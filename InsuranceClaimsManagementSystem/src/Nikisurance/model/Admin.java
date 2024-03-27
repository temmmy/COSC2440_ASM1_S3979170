/**
* @author <Nguyen Chi Nghia - s3979170>
*/

package Nikisurance.model;

import java.util.ArrayList;
import Nikisurance.ui.AdminUI;
import Nikisurance.io.DataManager;
import Nikisurance.model.*;

public class Admin implements ClaimProcessManager {

    private String username;
    private String password;
    private DataManager dataManager;
    private AdminUI adminUI;
    private ArrayList<InsuranceCard> insuranceCards;
    private ArrayList<Claim> claims;
    private ArrayList<Customer> customers;

    public Admin(String username, String password, DataManager dataManager, AdminUI adminUI) {
        this.username = username;
        this.password = password;
        this.dataManager = dataManager;
        this.adminUI = adminUI;
        this.claims = dataManager.loadClaims();
        this.customers = dataManager.loadCustomers();
        this.insuranceCards = dataManager.loadInsuranceCards();
    }

    @Override
    public void add(Claim claim) {

    }

    @Override
    public void update(Claim claim) {

    }

    @Override
    public void delete(String claimId) {

    }

    @Override
    public Claim getOne(String claimId) {
        return null;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DataManager getDataManager() {
        return this.dataManager;
    }

    public void setDataManager(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public AdminUI getAdminUI() {
        return this.adminUI;
    }

    public void setAdminUI(AdminUI adminUI) {
        this.adminUI = adminUI;
    }
}
