package tokenContract;

import address.Address;

import java.security.PublicKey;
import java.text.NumberFormat;
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

        if(holds){

            throw new AssertionError();

        }

    }

    public void deduccion(double cantidad){

        double deduccion = this.getBalances().get(this.getOwnerPK()) - cantidad;
        this.getBalances().put(this.getOwnerPK(), deduccion);

    }


    public void suma(PublicKey PKDestinatario, double cantidad){

        double suma = cantidad;

        try{

            suma += this.getBalances().get(PKDestinatario);

            this.getBalances().put(PKDestinatario, suma);

        }
        catch(NullPointerException e){

            this.getBalances().put(PKDestinatario, suma);

        }

    }


    public void transfer(PublicKey PKDestinatario, double cantidad){

            try {
                require((cantidad > this.getBalances().get(this.getOwnerPK())));

                deduccion(cantidad);

                suma(PKDestinatario, cantidad);

            }
            catch(AssertionError e){}

    }


    public void transfer(PublicKey PKOrigen, PublicKey PKDestinatario, double cantidad){

        try{

            require(cantidad > this.getBalances().get(PKOrigen));

            deduccionReventa(PKOrigen, cantidad);

            suma(PKDestinatario, cantidad);

        }
        catch( AssertionError e){}

    }


    private void deduccionReventa(PublicKey PKOrigen, double cantidad) {

        double deduccion = this.getBalances().get(PKOrigen) - cantidad;

        this.getBalances().put(PKOrigen, deduccion);

    }


    public void owners(){

        for(PublicKey key : this.getBalances().keySet()){

            if(key != this.getOwnerPK()) {

                System.out.println("Owner: " + key.hashCode() + " " + this.getBalances().get(key) + " " + this.symbol());

            }

        }
    }


    public String totalTokensSold() {

        int total = 0;

        for (PublicKey key : this.getBalances().keySet()){

            if(key != this.getOwnerPK()){

                total += this.getBalances().get(key);

            }

        }

        return NumberFormat.getInstance().format(total);

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
