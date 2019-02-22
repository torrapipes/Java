package org.lasencinas;

import address.Address;

/**
 * Contratos inteligentes con enZinium.
 *
 * Rick va a organizar un concieto de Los Ricknillos
 * y quiere poner a la venta 100 entradas en nuestra
 * plataforma enZinium.
 * Para ello va a utilizar un contrato inteligente
 * construido sobre nuestra plataforma.
 * Este contrato recibira instrucciones sobre a quien vender
 * las entradas. El contrato almacenara que usuarios/as
 * de la plataforma poseen las entradas.
 * Cada usuario/a dipone de una address /direccion en la
 * plataforma, desde la que gestionar sus enZiniums
 * y las entradas.
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Crea una address en nuestro sistema para Rick
         * Genera las claves privada y publica de la direccion
         * El balance de enZinium de su direccion es cero
         * El simbolo del enZinium es EZI
         */

        Address rick = new Address();
        rick.generateKeyPair();

        /**
         * Visualiza la direccion publica de Rick y su balance
         *
         * Utiliza el metodo hashCode() de PublicKey para
         * mostrar la PublicKey en consola
         */

        System.out.println("\n" + "Address de Rick" + "\n" +
                "==============="        );
        System.out.println(rick.toString());

    }
}
