package Excercise;

import java.util.Scanner;

public class Exercise_Lab3_1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter number: ");
            double num =sc.nextDouble();
            total += num;  //total = total+num

            //find average value
            double avg = total / 5;

            //display
            System.out.println("Total: "+ total);
            System.out.println("Average: "+ avg);

        }
    }
}
