package tokenContractTest;

import address.Address;
import org.junit.Before;
import org.junit.Test;
import tokenContract.TokenContract;

import java.security.PublicKey;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TokenContractTest {


    private TokenContract tk;
    private Address ad;
    private Address ad1;
    private Address ad2;


    @Before
    public void init(){

        ad = new Address();
        ad1 = new Address();
        ad1 = new Address();

        ad.generateKeyPair();
        ad1.generateKeyPair();
        ad2.generateKeyPair();

        tk = new TokenContract(ad);

    }


    @Test
    public void constructorTest(){

        assertNotNull(tk);

    }


    @Test
    public void getOwnerPKTest(){

        PublicKey pair  = ad.getPK();

        assertEquals(pair, tk.getOwnerPK());

    }


    @Test
    public void nameTest(){

        String name = "Caterina";

        tk.setName(name);

        assertEquals(name, tk.name());

    }


    @Test
    public void symbolTest(){

        String symbol = "bgs";

        tk.setSymbol(symbol);

        assertEquals(symbol, tk.symbol());

    }


    @Test
    public void totalSupplyTest(){

        double totalSupply = 10.00;

        tk.setTotalSupply(totalSupply);

        assertEquals(totalSupply, tk.totalSupply());

    }


    @Test
    public void addOwnerTest(){

        double cantidad = 25;

        tk.addOwner(ad.getPK(), cantidad);

        assertEquals(cantidad, tk.getBalances().get(ad.getPK()));

    }


    @Test
    public void numOwnersTest(){

        tk.getBalances().put(ad.getPK(), 100d);
        tk.getBalances().put(ad1.getPK(), 100d);

        assertEquals(2, tk.numOwners());

    }


    @Test
    public void balanceOfTest(){

        double cincuenta = 50d;

        tk.getBalances().put(ad.getPK(), cincuenta);

        assertEquals(cincuenta, tk.balanceOf(ad.getPK(), cincuenta), 0d);
        assertEquals(0d, tk.balanceOf(ad2.getPK(), cincuenta), 0d);

    }


    @Test
    public void getBalancesTest(){

        assertNotNull(tk.getBalances());

    }

   /* @Test
    public void payable_test() {

        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);
        Address morty = new Address();
        morty.generateKeyPair();

        morty.addEZI(20d);

        // verifico la transferencia de entradas
        ricknillos.payable(morty.getPK(), morty.getBalance());
        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);

        // verifico la trasnferencia de EZI
        assertEquals(20d, ricknillos.owner().getBalance(), 0d); */
}
