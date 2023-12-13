package org.lessons.java.valutazioni;

public class Studente {
    //Attributi
    private int idStudent;
    private static int idCounter = 0;
    private int absence;
    private double average;

    //Costruttori


    public Studente( int absence, double average) {
        this.idStudent = idCounter ++;
        this.absence = absence;
        this.average = average;
    }

    // Getter e Setter

    public int getIdStudent() {
        return idStudent;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    
    //Metodi
    
    public boolean passed(){
        if (absence >= 50 || average < 2) {
            return false;
        } else if (absence >= 25 && average > 2) {
            return true;
        } else return absence < 25 && average >= 2;
    }

    @Override
    public String toString() {
        return "Studente:" +  "idStudent=" + idStudent + ", absence=" + absence + ", average=" + average;
    }
}
