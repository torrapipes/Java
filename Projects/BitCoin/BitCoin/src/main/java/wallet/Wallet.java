package wallet;

import java.security.PrivateKey;
import java.security.PublicKey;

import genSig.GenSig;

public class Wallet {

	
	// Atributos
	
	private PublicKey address = null;
	private PrivateKey sKey = null;
	private double total_input = 0d;
	private double total_output = 0d;
	private double balance = 0d;
	
	// Constructor
	
	public Wallet() {}
	
	
	// Getters
	
	public double getTotalInput() {
		
		return this.total_input;
		
	}
	
	
	public double getTotalOutput() {
		
		return this.total_output;
		
	}
	
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	
	public PrivateKey getSK() {
		
		return this.sKey;
		
	}
	
	
	public PublicKey getAddress() {
		
		return this.address;
		
	}
	
	
	// Setters
	
	public void setSK(PrivateKey sKey) {
		
		this.sKey = sKey;
		
	}
	
	
	public void setAddress(PublicKey pKey) {
		
		this.address = pKey;
		
	}
	
	
	// Métodos
	
	public void generateKeyPair() {
		
		this.setSK(GenSig.generateKeyPair().getPrivate());
		this.setAddress(GenSig.generateKeyPair().getPublic());
		
	}


	@Override
	public String toString() {
		return "\n" + "Wallet = " + getAddress().hashCode() + "\n" +
                "Total input = " + getTotalInput() + "\n" +
                "Total output = " + getTotalOutput() + "\n" +
                "Balance = " + getBalance() + "\n";
	}
	
	
	
	
	
	
}
