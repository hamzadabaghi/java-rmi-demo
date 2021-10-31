package business;

import java.io.Serializable;
import java.time.LocalDate;

public class Compte implements Serializable {

    // attributes
    private int code;
    private double solde;
    private LocalDate dateCreation;

    // constructors
    public Compte() {
        super();
    }

    public Compte(int code, double solde, LocalDate dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }



    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

}
