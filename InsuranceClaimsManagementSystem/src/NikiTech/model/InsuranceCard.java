/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package NikiTech.model;

import java.util.Date;

public class InsuranceCard {
    private String cardNumber;
    private String cardHolderName;
    private String policyOwner;
    private Date expiryDate;

    public InsuranceCard(String cardNumber, String cardHolderName, String policyOwner, Date expiryDate) {
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

    public String getPolicyOwner() {
        return this.policyOwner;
    }

    public void setPolicyOwner(String policyOwner) {
        this.policyOwner = policyOwner;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
