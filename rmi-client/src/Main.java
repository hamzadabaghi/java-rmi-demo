/* Client RMI

 1- creation de stub qui va communiquer avec le skeleton

 */

import business.Compte;
import server.IBanqueRemote;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        try {
            IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");

            // connexion établie

            System.out.println("conversion de 9000 euro en MAD : " + stub.conversion(9000));
            Compte c = stub.consulterCompte(2);
            System.out.println("solde du compte 2 : " + c.getSolde());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
