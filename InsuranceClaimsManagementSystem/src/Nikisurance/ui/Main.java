/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.ui;

import java.util.ArrayList;

import Nikisurance.io.DataManager;
import Nikisurance.util.DataGenerator;
import Nikisurance.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + //
                "███╗   ██╗██╗██╗  ██╗██╗███████╗██╗   ██╗██████╗  █████╗ ███╗   ██╗ ██████╗███████╗\n" + //
                "████╗  ██║██║██║ ██╔╝██║██╔════╝██║   ██║██╔══██╗██╔══██╗████╗  ██║██╔════╝██╔════╝\n" + //
                "██╔██╗ ██║██║█████╔╝ ██║███████╗██║   ██║██████╔╝███████║██╔██╗ ██║██║     █████╗  \n" + //
                "██║╚██╗██║██║██╔═██╗ ██║╚════██║██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║     ██╔══╝  \n" + //
                "██║ ╚████║██║██║  ██╗██║███████║╚██████╔╝██║  ██║██║  ██║██║ ╚████║╚██████╗███████╗\n" + //
                "╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝\n" + //
                "                                                                                   \n" + //
                "");

        System.out.println("Welcome to NikiSurance Insurance Claims Management System");
        System.out.println("--------------------------------------------------------");
        // DataGenerator dataGenerator = new DataGenerator();
        // dataGenerator.generateAndSaveData();

        DataManager dataManager = new DataManager();
        System.out.println("Customers:");
        ArrayList<Customer> customers = dataManager.loadCustomers();
        ArrayList<InsuranceCard> insuranceCards = dataManager.loadInsuranceCards();
        ArrayList<Claim> claims = dataManager.loadClaims();
        System.out.println("Successfully loaded " + customers.size() + " customers");
        System.out.println("Successfully loaded " + insuranceCards.size() + " insurance cards");
        System.out.println("Successfully loaded " + claims.size() + " claims");
    }
}
