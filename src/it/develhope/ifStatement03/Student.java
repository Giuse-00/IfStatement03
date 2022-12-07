package it.develhope.ifStatement03;

import java.util.Random;

public class Student {

    Random random = new Random();

    public String name;
    public int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){
        int x = 1 + random.nextInt(35);
        System.out.println("I generated the number " + x + " for the student " + name);

        if(x>age){
            System.out.println("The generated number is greater than the student's age");
        }else if (x==age){
            System.out.println("The generated number is equals to the student's age");
        }else{
            System.out.println("The generated number is lower than the student's age");
        }
    }

}
