/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

public class Claim implements Serializable {
    private String id;
    private Date claimDate;
    private Customer insuredPerson;
    private String cardNumber;
    private Date examDate;
    private ArrayList<String> documents;
    private double claimAmount;
    private Status status;
    private BankingInfo receiverBankingInfo;

    public enum Status {
        NEW, PROCESSING, DONE;
    }

    public Claim(String id, Date claimDate, Customer insuredPerson, String cardNumber, Date examDate,
            ArrayList<String> documents, double claimAmount, Status status, BankingInfo receiverBankingInfo) {
        this.id = id;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankingInfo = receiverBankingInfo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getClaimDate() {
        return this.claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public Customer getInsuredPerson() {
        return this.insuredPerson;
    }

    public void setInsuredPerson(Customer insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExamDate() {
        return this.examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public ArrayList<String> getDocuments() {
        return this.documents;
    }

    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }

    public double getClaimAmount() {
        return this.claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BankingInfo getReceiverBankingInfo() {
        return this.receiverBankingInfo;
    }

    public void setReceiverBankingInfo(BankingInfo receiverBankingInfo) {
        this.receiverBankingInfo = receiverBankingInfo;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", claimDate='" + getClaimDate() + "'" +
                ", insuredPerson='" + getInsuredPerson() + "'" +
                ", cardNumber='" + getCardNumber() + "'" +
                ", examDate='" + getExamDate() + "'" +
                ", documents='" + getDocuments() + "'" +
                ", claimAmount='" + getClaimAmount() + "'" +
                ", status='" + getStatus() + "'" +
                ", receiverBankingInfo='" + getReceiverBankingInfo() + "'" +
                "}";
    }
}
