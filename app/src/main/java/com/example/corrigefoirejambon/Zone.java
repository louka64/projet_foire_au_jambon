package com.example.corrigefoirejambon;

public class Zone {
    private String code ;
    private String nom ;
    private String quartier ;
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
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public Zone(String code, String nom, String quartier) {
        this.code = code;
        this.nom = nom;
        this.quartier = quartier;
    }
    @Override
    public String toString() {
        return "Zone{"+
                "code='"+ code + '\''+
                ", nom='"+ nom + '\''+
                ", quartier='"+ quartier + '\''+
                '}';
    }
}