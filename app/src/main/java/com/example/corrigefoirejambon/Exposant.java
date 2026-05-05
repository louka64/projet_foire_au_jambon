package com.example.corrigefoirejambon;

public class Exposant {
    private String code;
    private String nom;
    private String specialites;
    private int anneeCreation;
    private Caseta laCaseta ;
    public Exposant(String code, String nom, String specialites, int anneeCreation, Caseta laCaseta) {
        this.code = code;
        this.nom = nom;
        this.specialites = specialites ;
        this.anneeCreation = anneeCreation;
        this.laCaseta = laCaseta ;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSpecialites() {
        return specialites;
    }
    public void setSpecialites(String specialites) {
        this.specialites = specialites;
    }
    public int getAnneeCreation() {
        return anneeCreation;
    }
    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }
    public Caseta getLaCaseta() {
        return laCaseta;
    }
    public void setLaCaseta(Caseta laCaseta) {
        this.laCaseta = laCaseta;
    }
    @Override
    public String toString() {
        return "Exposant{"+
                "code='"+ this.code + '\''+
                ", nom='"+ this.nom + '\''+
                ", specialités="+ this.specialites +
                ", année de création="+ this.anneeCreation +
                ", caseta="+ this.laCaseta +
                '}';
    }
}