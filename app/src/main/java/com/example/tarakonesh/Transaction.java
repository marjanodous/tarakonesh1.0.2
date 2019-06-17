package com.example.tarakonesh;

/*support telgram id =@javaprogrammer_eh
 * 24/03/1398
 * creted by elmira hossein zadeh*/

public class Transaction {
    private String finacialAccountFk;
    private String bankAccountFk;
    private String transactionType;
    private String date;
    private String time;
    private int phoneNumber;
    private int money;
    private int transNumber;
    private int reference;
    private String transResult;
    private String details;

    public Transaction() {
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getFinacialAccountFk() {
        return finacialAccountFk;
    }

    public void setFinacialAccountFk(String finacialAccountFk) {
        this.finacialAccountFk = finacialAccountFk;
    }

    public String getBankAccountFk() {
        return bankAccountFk;
    }

    public void setBankAccountFk(String bankAccountFk) {
        this.bankAccountFk = bankAccountFk;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTransNumber() {
        return transNumber;
    }

    public void setTransNumber(int transNumber) {
        this.transNumber = transNumber;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getTransResult() {
        return transResult;
    }

    public void setTransResult(String transResult) {
        this.transResult = transResult;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

