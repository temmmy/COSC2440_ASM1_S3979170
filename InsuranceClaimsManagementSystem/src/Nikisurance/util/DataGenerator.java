package Nikisurance.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import Nikisurance.model.Claim;
import Nikisurance.model.Customer;
import Nikisurance.model.Dependent;
import Nikisurance.model.InsuranceCard;
import Nikisurance.model.PolicyHolder;

public class DataGenerator {
    private static final String CUSTOMERS_FILE = "customers.dat";
    private static final String INSURANCE_CARDS_FILE = "insurancecards.dat";
    private static final String CLAIMS_FILE = "claims.dat";
    private Random random = new Random();

    public void generateAndSaveData() {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<InsuranceCard> insuranceCards = new ArrayList<>();
        ArrayList<Claim> claims = new ArrayList<>();
        ArrayList<PolicyHolder> policyHolders = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            PolicyHolder policyHolder = generatePolicyHolder();
            customers.add(policyHolder);
            policyHolders.add(policyHolder);
            for (int j = 0; j < 5; j++) {
                Dependent dependent = generateDependent();
                policyHolder.addDependent(dependent);
                customers.add(dependent);
            }
        }

        for (PolicyHolder ph : policyHolders) {
            if (random.nextBoolean()) { // Not all Policyholders will get a card
                InsuranceCard card = generateInsuranceCard(ph); // Pass in policyholder
                insuranceCards.add(card);
            }
        }

        for (int i = 0; i < 50; i++) {
            Customer customer = customers.get(random.nextInt(customers.size()));
            Claim claim = generateClaim(customer);
            claims.add(claim);
        }

        saveToFile(customers, CUSTOMERS_FILE);
        saveToFile(insuranceCards, INSURANCE_CARDS_FILE);
        saveToFile(claims, CLAIMS_FILE);

    }

    private void saveToFile(Object data, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(data);
        } catch (IOException e) {
            System.err.println("Error saving to file " + filename + ": " + e.getMessage());
        }
    }

    private PolicyHolder generatePolicyHolder() {
        String id = String.format("c-%07d", random.nextInt(1000000));
        String name = generateName();
        PolicyHolder policyHolder = new PolicyHolder(id, name);
        return policyHolder;
    }

    private InsuranceCard generateInsuranceCard(PolicyHolder policyHolder) {
        String id = String.format("%10d", random.nextInt(1000000000));
        Date issueDate = generateDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(issueDate);
        calendar.add(Calendar.YEAR, 1); // Add 1 year to the issue date
        Date expiryDate = calendar.getTime();
        InsuranceCard card = new InsuranceCard(id, policyHolder.getName(), policyHolder,
                expiryDate);
        policyHolder.setInsuranceCard(card);
        return card;
    }

    private Claim generateClaim(Customer customer) {
        String id = String.format("c-%10d", random.nextInt(1000000000));
        Date date = generateDate();
        double amount = random.nextDouble() * 10000;
        String description = "Claim for " + customer.getName();
        return new Claim(id, date, amount, description, customer);
    }

    private Dependent generateDependent() {
        String id = String.format("c-%07d", random.nextInt(1000000));
        String name = generateName();
        return new Dependent(id, name);
    }

    private String generateName() {
        String[] firstNames = { "John", "Jane", "Emily", "Michael", "David", "Minh", "Nghia", "Dat", "Duy", "Mai" };
        String[] lastNames = { "Smith", "Johnson", "Williams", "Brown", "Lee", "Nguyen", "Tran", "Le", "Pham",
                "Huynh" };
        return firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
    }

    private Date generateDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -random.nextInt(20)); // A date within the last 20 years
        calendar.add(Calendar.DAY_OF_MONTH, -random.nextInt(365)); // Adjust range as needed
        return calendar.getTime();
    }
}