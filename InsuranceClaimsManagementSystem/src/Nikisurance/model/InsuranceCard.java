/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.util.Date;
import java.io.Serializable;

public class InsuranceCard implements Serializable {
    private String cardNumber;
    private String cardHolderName;
    private PolicyHolder policyOwner;
    private Date expiryDate;

    public InsuranceCard(String cardNumber, String cardHolderName, PolicyHolder policyOwner, Date expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.policyOwner = policyOwner;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public PolicyHolder getPolicyOwner() {
        return this.policyOwner;
    }

    public void setPolicyOwner(PolicyHolder policyOwner) {
        this.policyOwner = policyOwner;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "{" +
                " cardNumber='" + getCardNumber() + "'" +
                ", cardHolderName='" + getCardHolderName() + "'" +
                ", expiryDate='" + getExpiryDate() + "'" +
                "}";
    }
}
