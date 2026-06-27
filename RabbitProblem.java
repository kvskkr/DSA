/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
import java.util.Scanner;

public class RabbitProblem {

    public static int rabbits(int month) {

        if (month == 1 || month == 2)
            return 1;

        return rabbits(month - 1) + rabbits(month - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Months: ");
        int month = sc.nextInt();

        System.out.println("Rabbit Pairs after " + month + " months = " + rabbits(month));

        sc.close();
    }
}
