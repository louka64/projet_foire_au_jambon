package com.example.corrigefoirejambon;

public class Caseta {
    private int num ;
    private float surface ;
    private String description ;
    private Zone laZone ;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public float getSurface() {
        return surface;
    }
    public void setSurface(float surface) {
        this.surface = surface;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Zone getLaZone() {
        return laZone;
    }
    public void setLaZone(Zone laZone) {
        this.laZone = laZone;
    }
    public Caseta(int num, float surface, String description, Zone laZone) {
        this.num = num;
        this.surface = surface;
        this.description = description;
        this.laZone = laZone;
    }
    @Override
    public String toString() {
        return "Caseta{"+
                "num="+ num +
                ", surface="+ surface +
                ", description='"+ description + '\''+
                ", laZone="+ laZone +
                '}';
    }
}