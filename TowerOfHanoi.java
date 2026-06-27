/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class TowerOfHanoi {

    public static void hanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        hanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        hanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {

        int disks = 3;

        hanoi(disks, 'A', 'B', 'C');
    }
}