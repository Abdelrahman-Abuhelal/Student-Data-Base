package Studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter how many student do you want? ");
        int numStudents=in.nextInt();
        Student[]students=new Student[numStudents];

        for (int i=0;i<numStudents;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].payTutution();
            students[i].showInfo();
        }
    }
}
