package com.example.corrigefoirejambon;

import java.util.ArrayList;
public class Foire {
    public static ArrayList<Zone>zones = new ArrayList<Zone>();
    public static ArrayList<Caseta>casetas = new ArrayList<Caseta>();
    public static ArrayList<Exposant>exposants = new ArrayList<Exposant>();
    public static void init(){
        Foire.zones.add(new Zone("A", "Halles","Quartier des Halles"));
        Foire.zones.add(new Zone("B", "Chapiteau des salaisonniers","Quai Chaot"));
        Foire.zones.add(new Zone("C", "Marché traditionnel","Quartier Sainte Claire"));
        Foire.zones.add(new Zone("D", "Trinquet Saint André","Quartier Saint André"));
        Foire.casetas.add(new Caseta(1, 21, "Entrée 1 chapiteau 1",zones.get(1)));
        Foire.casetas.add(new Caseta(2, 21, "Entrée 1 chapiteau 2", zones.get(1)));
        Foire.casetas.add(new Caseta(3, 18, "Entrée 1 chapiteau allée transversale 1",zones.get(1)));
        Foire.casetas.add(new Caseta(19, 12, "Halles Côté sud", zones.get(0)));
        Foire.casetas.add(new Caseta(21, 14, "Halles Côté nord", zones.get(0)));
        Foire.exposants.add(new Exposant("ELIZA","Ferme Elizaldia","Jambon de Bayonne IGP, Saucisse sèche Makila, Saucisson de montagne IGP", 1983,casetas.get(3)));
        Foire.exposants.add(new Exposant("SMDUP","Salaisons Michel Dupuy","Jambon de Bayonne IGP, Lomo séché au piment d'Espelette", 1781,casetas.get(1)));
        Foire.exposants.add(new Exposant("MMONT","Maison Montauzer","Jambon de Bayonne IGP", 1923,casetas.get(2)));
        Foire.exposants.add(new Exposant("SADOU","Salaisons de l'Adour","Jambon de Bayonne IGP", 1873,casetas.get(0)));
        Foire.exposants.add(new Exposant("PIBAI","Maison Pierre ABAIALDE","Jambon de Bayonne IGP de haute qualité", 1728,casetas.get(4)));
    }
}