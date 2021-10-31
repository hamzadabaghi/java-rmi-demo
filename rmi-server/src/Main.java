/* serveur RMI

1- il va instancier l'objet se service
2- il va publier sa réference dans l'annuaire

 */

import server.BanqueRmiService;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args)  {

        try{
            // démarrer l'annuaire qui va utiliser le port 1099
            LocateRegistry.createRegistry(1099);
            System.setProperty("java.security.policy", "AllPermission.policy");
            // instanciation de l'objet à publier
            BanqueRmiService od = new BanqueRmiService();
            System.out.println(od.toString());
            // publication de reference
            Naming.rebind("rmi://localhost:1099/BK",od);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
