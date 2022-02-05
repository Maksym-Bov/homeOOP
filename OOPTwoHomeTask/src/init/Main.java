package init;

import univer.Aspirant;
import univer.Student;

public class Main {

    public static void main (String[] args){

        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        Student student1 = new Student("Mark","Klok",4.98);
        Student student2 = new Student("Mark","Klok",5);
        Aspirant aspirant1 = new Aspirant("Jack","Polk",3.66,"Water");
        Aspirant aspirant2 = new Aspirant("Jack","Polk",5,"Fire");

        System.out.println(student.getScholarship(student1.getAverageMark()));
        System.out.println(student.getScholarship(student2.getAverageMark()));

        System.out.println(aspirant.getScholarship(aspirant1.getAverageMark()));
        System.out.println(aspirant.getScholarship(aspirant2.getAverageMark()));
        Student [] arr ={student1,aspirant2};
        System.out.println(student.getScholarship(arr[0].getAverageMark()));
        System.out.println(student.getScholarship(arr[1].getAverageMark()));

    }
}
