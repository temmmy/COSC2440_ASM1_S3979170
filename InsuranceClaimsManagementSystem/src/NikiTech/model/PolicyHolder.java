/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package NikiTech.model;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private ArrayList<Dependent> dependents;

    public PolicyHolder(String id, String fullName, InsuranceCard insuranceCard) {
        super(id, fullName, insuranceCard);
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
}
