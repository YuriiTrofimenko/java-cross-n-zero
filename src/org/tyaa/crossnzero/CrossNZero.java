/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.crossnzero;

/**
 *
 * @author student
 */
public class CrossNZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            // System.out.println("work " + i);
            for (int j = 1; j <= 3; j++) {
                /*// Row 1
                if (i == 1 && j == 1) {
                    System.out.print("X");
                } else if (i == 1 && j == 2) {
                    System.out.print(" ");
                } else if (i == 1 && j == 3) {
                    System.out.println("O");
                }
                // Row 2
                if (i == 2 && j == 1) {
                    System.out.print("O");
                } else if (i == 2 && j == 2) {
                    System.out.print("X");
                } else if (i == 2 && j == 3) {
                    System.out.println("X");
                }
                // Row 3
                if (i == 3 && j == 1) {
                    System.out.print(" ");
                } else if (i == 3 && j == 2) {
                    System.out.print(" ");
                } else if (i == 3 && j == 3) {
                    System.out.println("O");
                }*/
                // Row 1
                
                if (i == 1) {
                    switch (j) {
                        case 1:
                            System.out.print("X");
                            break;
                        case 2:
                            System.out.print(" ");
                            break;
                        case 3:
                            System.out.println("O");
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 2) {
                    switch (j) {
                        case 1:
                            System.out.print("O");
                            break;
                        case 2:
                            System.out.print("X");
                            break;
                        case 3:
                            System.out.println("X");
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 3) {
                    switch (j) {
                        case 1:
                            System.out.print(" ");
                            break;
                        case 2:
                            System.out.print(" ");
                            break;
                        case 3:
                            System.out.println("O");
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
    
}
