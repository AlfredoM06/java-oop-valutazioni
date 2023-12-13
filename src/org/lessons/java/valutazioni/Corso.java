package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.List;

public class Corso {
   public List<Studente> students = new ArrayList<>();
   public void addStudent( Studente student ){
      students.add(student);
   }

   public void removeStudent(int idStudent){
      for (int i = 0; i < students.size(); i ++){
         if (students.get(i).getIdStudent() == idStudent){
            students.remove(i);
            break;
         }
      }
   }


   public int studentPassed () {
      int promoted = 0;
      for (Studente student : students){
         if (student.passed()){
            promoted ++;
         }
      }
       return (promoted * 100) / students.size();
   }



}
