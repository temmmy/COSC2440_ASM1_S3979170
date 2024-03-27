/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.ui;

import java.util.ArrayList;
import java.util.Scanner;

import Nikisurance.io.DataManager;
import Nikisurance.util.*;
import Nikisurance.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + //
                "███╗   ██╗██╗██╗  ██╗██╗███████╗██╗   ██╗██████╗  █████╗ ███╗   ██╗ ██████╗███████╗\n" + //
                "████╗  ██║██║██║ ██╔╝██║██╔════╝██║   ██║██╔══██╗██╔══██╗████╗  ██║██╔════╝██╔════╝\n" + //
                "██╔██╗ ██║██║█████╔╝ ██║███████╗██║   ██║██████╔╝███████║██╔██╗ ██║██║     █████╗  \n" + //
                "██║╚██╗██║██║██╔═██╗ ██║╚════██║██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║     ██╔══╝  \n" + //
                "██║ ╚████║██║██║  ██╗██║███████║╚██████╔╝██║  ██║██║  ██║██║ ╚████║╚██████╗███████╗\n" + //
                "╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝" + //
                "");

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("|           WELCOME TO NIKISURANCE INSURANCE CLAIMS MANAGEMENT SYSTEM!            |");
        System.out.println("-----------------------------------------------------------------------------------");
        DataGenerator dataGenerator = new DataGenerator();
        // ArrayList<Customer> customers = dataManager.loadCustomers();
        // ArrayList<InsuranceCard> insuranceCards = dataManager.loadInsuranceCards();
        // ArrayList<Claim> claims = dataManager.loadClaims();
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();

        // Confirmation Message
        // System.out.println("Successfully loaded " + customers.size() + " customers");
        // System.out.println("Successfully loaded " + insuranceCards.size() + "
        // insurance cards");
        // System.out.println("Successfully loaded " + claims.size() + " claims");

        boolean authenticated = false;
        do {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (auth.authenticate(username, password)) {
                authenticated = true;
                DataManager dataManager = new DataManager(); // Assuming DataManager loads/saves data
                AdminUI adminUI = new AdminUI(); // Assuming you have a class for your text-based UI
                Admin admin = new Admin(username, password, dataManager, adminUI);
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid credentials.");
            }
        } while (!authenticated);
    }
}
