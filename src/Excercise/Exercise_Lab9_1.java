package Excercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Exercise_Lab9_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is your namr? :");
        name = scanner.nextLine();
        System.out.println("Your name is "+name);
        String studentid;
        System.out.println("What is your studentid ? :");
        studentid = scanner.nextLine();
        System.out.println("Your name is "+studentid);
        String major;
        System.out.println("What is your major? :");
        major = scanner.nextLine();
        System.out.println("Your major is "+major);
        String Phonenumber;
        System.out.println("What is your Phone number ?:");
        Phonenumber = scanner.nextLine();
        System.out.println("Your age is "+Phonenumber);
        String email;
        System.out.println("What is your email? :");
        email = scanner.nextLine();
        System.out.println("Your email is "+email);

        Path myPath = Paths.get("C:/Users/LabCom_MT-4/Documents/bank/myProfile.txt");
        BufferedWriter writer =null;

            try {
                writer = Files.newBufferedWriter(myPath, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                writer.write(name);
                writer.newLine();
                writer.write(studentid);
                writer.newLine();
                writer.write(major);
                writer.newLine();
                writer.write(Phonenumber);
                writer.newLine();
                writer.write(email);
                writer.newLine();


            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

    }
}