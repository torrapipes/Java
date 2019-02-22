package addressTest;

import address.Address;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class AddressTest {

    private Address address;

    @Before
    public void init(){

        address = new Address();

    }


    @Test
    public void getPKTest(){

        address.generateKeyPair();

        assertNotNull(address.getPK());

    }


    @Test
    public void getSKTest() {

        address.generateKeyPair();

        assertNotNull(address.getSK());

    }


    @Test
    public void symbolTest() {

        address.generateKeyPair();

        assertNotNull(address.symbol());

    }


    @Test
    public void generate_key_pair_test() {

        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
        assertNotNull(address.getSK());

    }


   /** @Test
    public void transferEZI_test() {

        Address rick = new Address();
        rick.generateKeyPair();

        rick.addEZI(20d);

        rick.transferEZI(20d);

        assertEquals(40d, rick.getBalance(), 0d);
    }*/

}
