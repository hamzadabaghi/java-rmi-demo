package server;

import business.Compte;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// skeleton ( UnicastRemoteObject ) : service d'écoute d'un serveur multithread pour permettre l'accés des services distants
public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote {

    public BanqueRmiService() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double mt) throws RemoteException {
        return mt*10;
    }

    @Override
    public Compte consulterCompte(int code) throws RemoteException {
        Compte compte = new Compte(1,Math.random()*9000, LocalDate.of(2022,12,10));
        return compte;
    }

    @Override
    public List<Compte> comptes() throws RemoteException {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1,Math.random()*9000, LocalDate.of(2022,12,10)));
        comptes.add(new Compte(2,Math.random()*8000, LocalDate.of(2020,11,20)));
        comptes.add(new Compte(3,Math.random()*6000, LocalDate.of(2021,10,25)));
        return comptes;
    }
}
