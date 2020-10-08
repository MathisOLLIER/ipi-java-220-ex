package com.ipiecoles.java.java220;

public class Commercial  extends Employe {
    private Double caAnnuel = 0.0;

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    @Override
    public Double getPrimeAnnuelle(){
        return Math.max(Math.ceil(this.getCaAnnuel()* 0.05), 500);
    }
}
