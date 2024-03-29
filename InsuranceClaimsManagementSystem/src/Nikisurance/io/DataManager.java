/**
* @author <Nguyen Chi Nghia - s3979170>
*/

package Nikisurance.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Nikisurance.model.Customer;
import Nikisurance.model.InsuranceCard;
import Nikisurance.model.Claim;

public class DataManager {
    private static final String CUSTOMERS_FILE = "InsuranceClaimsManagementSystem/data/customers.dat";
    private static final String INSURANCE_CARDS_FILE = "InsuranceClaimsManagementSystem/data/insurancecards.dat";
    private static final String CLAIMS_FILE = "InsuranceClaimsManagementSystem/data/claims.dat";

    @SuppressWarnings("unchecked")
    public ArrayList<Customer> loadCustomers() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(CUSTOMERS_FILE))) {
            return (ArrayList<Customer>) in.readObject(); // Cast is necessary
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading customers: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list on error
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<InsuranceCard> loadInsuranceCards() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(INSURANCE_CARDS_FILE))) {
            return (ArrayList<InsuranceCard>) in.readObject(); // Cast is necessary
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading insurance cards: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list on error
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Claim> loadClaims() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(CLAIMS_FILE))) {
            return (ArrayList<Claim>) in.readObject(); // Cast is necessary
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading claims: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list on error
        }
    }

    public void saveClaims(ArrayList<Claim> claims) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(CLAIMS_FILE))) {
            out.writeObject(claims);
        } catch (IOException e) {
            System.err.println("Error saving claims: " + e.getMessage());
        }
    }

    public void saveCustomers(ArrayList<Customer> customers) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(CUSTOMERS_FILE))) {
            out.writeObject(customers);
        } catch (IOException e) {
            System.err.println("Error saving customers: " + e.getMessage());
        }
    }

    public void saveInsuranceCards(ArrayList<InsuranceCard> insuranceCards) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(INSURANCE_CARDS_FILE))) {
            out.writeObject(insuranceCards);
        } catch (IOException e) {
            System.err.println("Error saving insurance cards: " + e.getMessage());
        }
    }
}
