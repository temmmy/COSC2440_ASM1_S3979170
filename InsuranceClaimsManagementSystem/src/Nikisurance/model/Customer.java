/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.util.ArrayList;
import java.io.Serializable;

public abstract class Customer implements Serializable {
    private String id;
    private String name;
    private InsuranceCard insuranceCard;
    private ArrayList<Claim> claims;

    public Customer(String id, String name, InsuranceCard insuranceCard) {
        this.id = id;
        this.name = name;
        this.insuranceCard = insuranceCard;
        this.claims = new ArrayList<>();
    }

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.insuranceCard = null;
        this.claims = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsuranceCard getInsuranceCard() {
        return this.insuranceCard;
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    public ArrayList<Claim> getClaims() {
        return this.claims;
    }

    public void setClaims(ArrayList<Claim> claims) {
        this.claims = claims;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", insuranceCard='" + getInsuranceCard() + "'" +
                "}";
    }
}
