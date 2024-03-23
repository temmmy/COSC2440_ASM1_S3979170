/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private ArrayList<Dependent> dependents;
    private BankingInfo bankingInfo;

    public PolicyHolder(String id, String fullName, InsuranceCard insuranceCard) {
        super(id, fullName, insuranceCard);
        this.dependents = new ArrayList<>();
        this.bankingInfo = null;
    }

    public PolicyHolder(String id, String fullName) {
        super(id, fullName);
        this.dependents = new ArrayList<>();
    }

    public List<Dependent> getDependents() {
        return dependents;
    }

    public void addDependent(Dependent dependent) {
        dependents.add(dependent);
    }

    public void removeDependent(Dependent dependent) {
        dependents.remove(dependent);
    }

    public BankingInfo getBankingInfo() {
        return bankingInfo;
    }

    public void setBankingInfo(BankingInfo bankingInfo) {
        this.bankingInfo = bankingInfo;
    }

}
