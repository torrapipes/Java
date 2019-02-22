package tokenContract;

import address.Address;

import java.security.PublicKey;

public class TokenContract {

    // Atributos

    private PublicKey ownerPK = null;
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0d;


    // Constructor

    public TokenContract(Address address) {

        this.ownerPK = address.getPK();

    }


    // Getters

    public PublicKey getOwnerPK() {

        return this.ownerPK;

    }


    // Setters

    public void setName(String name) {

        this.name = name;

    }


    public void setSymbol(String symbol) {

        this.symbol = symbol;

    }


    public void setTotalSupply(double totalSupply) {

        this.totalSupply = totalSupply;

    }


    // Métodos

    public String name() {

        return name;

    }


    public String symbol() {

        return symbol;

    }


    public double totalSupply() {

        return totalSupply;

    }

    @Override
    public String toString() {

        return "\n" +
                "ownerPK = " + this.getOwnerPK().hashCode() +
                "\n" + "name = " + this.name() + '\n' +
                "symbol = " + this.symbol() + '\n' +
                "totalSupply = " + this.totalSupply();

    }
}