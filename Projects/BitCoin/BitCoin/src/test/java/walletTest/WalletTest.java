package test.java.walletTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import main.java.genSig.GenSig;
import org.junit.Test;

import wallet.Wallet;

public class WalletTest {

	
	@Test
	public void setSkTest() {
		
		Wallet wallet = new Wallet();
		
		PrivateKey key = GenSig.generateKeyPair().getPrivate();
		
		wallet.setSK(key);
		
		assertNotNull(wallet.getSK());
		
	}
	
	
	@Test
	public void setAddressTest() {
		
		Wallet wallet = new Wallet();
		
		PublicKey key = GenSig.generateKeyPair().getPublic();
		
		wallet.setAddress(key);
		
		assertNotNull(wallet.getAddress());
		
	}
	
	
	@Test
	public void GenerateKeyPairTest() {
		
		Wallet wallet = new Wallet();
		
		wallet.generateKeyPair();
		
		assertNotNull(wallet.getSK());
		assertNotNull(wallet.getAddress());
		
		
	}
}
