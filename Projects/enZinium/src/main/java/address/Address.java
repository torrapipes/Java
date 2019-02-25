package address;

import genSig.GenSig;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {


    // Atributos

    private PublicKey PK = null;
    private PrivateKey SK = null;
    private String symbol = "EZI";
    private double balance = 0d;

    public Address() {
    }


    // Getters

    public PublicKey getPK() {

        return this.PK;

    }


    public PrivateKey getSK() {

        return this.SK;

    }


    public double getBalance() {

        return balance;

    }


    // Setters

    public void setPK(PublicKey PK) {

        this.PK = PK;

    }


    public void setSK(PrivateKey SK) {

        this.SK = SK;

    }


    // Métodos

    public void generateKeyPair() {

        KeyPair pair = GenSig.generateKeyPair();

        this.setPK(pair.getPublic());
        this.setSK(pair.getPrivate());

    }


    public String symbol() {

        return this.symbol;

    }


    public void addEZI(double cantidad){

        this.balance = cantidad;

    }


    @Override
    public String toString() {

        return "PK = " + this.getPK().hashCode() +
                "\n" + "balance = " + this.getBalance() + " " + this.symbol() ;

    }
}


