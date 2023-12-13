package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Corso course = new Corso();
        Random random = new Random();
        int randomStudent = random.nextInt(10,20);


        for (int i = 0; i < randomStudent; i ++){

            int randomAbsence = random.nextInt(0, 100);
            int randomAverage = random.nextInt(0, 5);
            Studente studente = new Studente(randomAbsence, randomAverage);
            course.addStudent(studente);
        }
        System.out.println("studenti: " + course.students);
        System.out.println("percentuale: " + course.studentPassed() + "%");
    }
}
