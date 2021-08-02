package Studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String name;
    private int gradeYear;
    private int balance;
    private String courses="";
    private static int costOfCourse=600;
    private static int id=1001;
    Scanner input=new Scanner(System.in);

    public Student(){
        System.out.println("\n Enter your name: ");
         this.name=input.next();
        System.out.println("1- Freshmen \n2- Junior \n3 Senior \n Enter student class level: ");
        this.gradeYear=input.nextInt();
        setstudentId();
        System.out.println("Name: "+name+" Grade is: "+gradeYear+" student ID: "+studentId+ "/n");


    }
    private void setstudentId(){
        id++;
         this.studentId= gradeYear+""+id;
    }
    public  void enroll(){
        int choice=5;
        while(choice!=0){
            System.out.println("Enter course to enroll (0 to quit) ");
            System.out.println("1- Mathmatics \n2- Chemistry \n3- Geography \n4- History");
            choice=input.nextInt();
            switch (choice){
            case 1:
                courses+="\nMathmatics";
                balance+=costOfCourse;
                break;
            case 2:
                courses+="\nChemistry";
                balance+=costOfCourse;
                break;
            case 3:
                courses+="\nGeography";
                balance+=costOfCourse;
                break;
            case 4:
                courses+="\nHistory";
                balance+=costOfCourse;
                break;

        }
        if(choice==1 || choice==2 || choice==3 || choice==4)
        {
            System.out.println("Enrolled in: "+courses);
            System.out.println("Your Balance is : "+balance);
        }
            System.out.println("You have quit enrolling");

        }
    }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+balance);
    }
    public void payTutution(){
        viewBalance();
        System.out.println("how much do you want to pay?");
        int payment=input.nextInt();
        balance-=payment;
        System.out.println("thank you for your payment which is: $"+payment+"\nnow your tuition balance is: $"+balance);
        viewBalance();
    }

    public void showInfo(){
        System.out.println("\nYour info are : ");
        System.out.println("Name:"+name+"\ncourses Enrolled"+courses+"\nbalance is "+balance);
    }
    }


