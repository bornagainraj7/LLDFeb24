package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values for x and y");

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                throw new WrongInputException("Invalid Input");
            }

            System.out.println(x/y);
            System.out.println("after division");

            File file = new File("filename.txt");
            FileReader reader = new FileReader(file);
            reader.read();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch (WrongInputException e) {
            System.out.println(e.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot open or read file");
        } catch (Exception e) {
            System.out.println("General exception found");
        } finally {
            System.out.println("Finally The Rock has come to.........");
        }

        // if any exception is not caught by catch block then this line wont execute but finally will execute
        System.out.println("After all catch and finally blocks");

    }
}
