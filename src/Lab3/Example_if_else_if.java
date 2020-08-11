package Lab3;

import java.util.Scanner;

//Grade GUTS
//0     - 49.99  F
//50.00 - 54.99  D
//55.00 - 59.99  D+
//60.99 - 64.99  C
//65.00 - 69.99  C+
//70.00 - 74.99  B
//75.00 - 79.99  B+
//80.00 - 100.00 A
import java.util.Scanner;

public class Example_if_else_if {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score, and I will tell your Grade:");
        double score = sc.nextDouble();
        //condition

        if (score>=0 && score <=49.99) {
            System.out.println("Your grade is F.");
        }else if (score>=50 && score <=54.99){
            System.out.println("Your grade is D.");
        }else if (score>=55 && score <=59.99){
            System.out.println("Your grade is D+.");
        }else if (score>=60 && score <=64.99){
            System.out.println("Your grade is C.");
        }else if (score>=65 && score <=69.99){
            System.out.println("Your grade is C+.");
        }else if (score>=70 && score <=74.99){
            System.out.println("Your grade is B.");
        }else if (score>=75 && score <=79.99){
            System.out.println("Your grade is B+.");
        }else if (score>=80 && score <=100) {
            System.out.println("Your grade is A.");
        }else {
            System.out.println("Please, enter score between 0-100.Thank you.");
        }


    }
}
