package com.capture.transaction.digibank.model;

//import org.hibernate.annotations.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransDetails {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int transCode;
    private String name;
    private String passport;
    private String destBank;
    private String destCountry;
    private int accNum;
    private double amount;

    public TransDetails(){}

   /* public TransDetails(String name, String passport, String destBank, String destCountry, int accNum, double amount) {
        this.name = name;
        this.passport = passport;
        this.destBank = destBank;
        this.destCountry = destCountry;
        this.accNum = accNum;
        this.amount = amount;
    }*/

    public int getTransCode() {
        return transCode;
    }

    public void setTransCode(int transCode) {
        this.transCode = transCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDestBank() {
        return destBank;
    }

    public void setDestBank(String destBank) {
        this.destBank = destBank;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

   /* @Override
    public String toString() {
        return "TransDetails{" +
                "transCode=" + transCode +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", destBank='" + destBank + '\'' +
                ", destCountry='" + destCountry + '\'' +
                ", accNum='" + accNum + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }*/
}
