package tokenContract;

import address.Address;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {

    // Atributos

    private PublicKey ownerPK = null;
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0d;
    private Map<PublicKey, Double> balances = new HashMap<>();


    // Constructor

    public TokenContract(Address address) {

        this.ownerPK = address.getPK();

    }


    // Getters

    public PublicKey getOwnerPK() {

        return this.ownerPK;

    }


    public Map<PublicKey, Double> getBalances(){

        return this.balances;

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


    public void addOwner(PublicKey PK, double cantidad){

        this.getBalances().putIfAbsent(PK, cantidad);

    }


    public int numOwners(){

        return this.getBalances().size();

    }


    public double balanceOf(PublicKey PK){

        try{

            return this.getBalances().get(PK);

        }
        catch(NullPointerException e){

            return 0d;

        }

    }


    public void require(boolean holds){

        if(!holds){

            System.out.println("No dispones de suficientes tokens!");

        }

    }


    public void transfer(PublicKey PKDestinatario, double cantidad){

        double suma = 0d;
        boolean holds = true;

        if(cantidad > this.getBalances().get(this.getOwnerPK())){

            holds = false;
            this.require(false);

        }
        else {
            double deduccion = this.getBalances().get(this.getOwnerPK()) - cantidad;

            try {
                suma = this.getBalances().get(PKDestinatario) + cantidad;
            } catch (NullPointerException e) {

                suma = cantidad;

            }

            this.getBalances().put(this.getOwnerPK(), deduccion);
            this.getBalances().put(PKDestinatario, suma);
        }
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
