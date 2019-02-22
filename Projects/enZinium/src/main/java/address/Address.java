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

    public Address() {
    }


    // Getters

    public PublicKey getPK() {

        return this.PK;

    }


    public PrivateKey getSK() {

        return this.SK;

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

}


