/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.io.Serializable;

public class BankingInfo implements Serializable {
    private String bankName;
    private Customer customer;
    private String accountNumber;

    public BankingInfo(String bankName, Customer customer, String accountNumber) {
        this.bankName = bankName;
        this.customer = customer;
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}