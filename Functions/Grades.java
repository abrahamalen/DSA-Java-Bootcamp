/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter marks: ");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        studentGrade(marks);
        in.close();
    }

    static void studentGrade(int marks) {
        if (marks > 90 && marks <= 100)
            System.out.println("Grade: AA");
        else if (marks <= 90 && marks > 80)
            System.out.println("Grade: AB");
        else if (marks <= 80 && marks > 70)
            System.out.println("Grade: AB");
        else if (marks <= 70 && marks > 60)
            System.out.println("Grade: AB");
        else if (marks <= 60 && marks > 50)
            System.out.println("Grade: AB");
        else if (marks <= 50 && marks > 40)
            System.out.println("Grade: AB");
        else
            System.out.println("Fail");
    }

}
