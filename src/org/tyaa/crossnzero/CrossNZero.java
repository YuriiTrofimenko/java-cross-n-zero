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
        
        /* Одномерные массивы */
        
        // Создать три одномерных массива по 3 элемента в каждом
        // 1 массив
        char[] row1 = new char[3];
        // 2 массив
        char[] row2 = new char[3];
        // 3 массив
        char[] row3 = new char[3];
        
        for (int i = 1; i <= 3; i++) {
            // System.out.println("work " + i);
            for (int j = 1; j <= 3; j++) {
                // Row 1
                // Ветвь логики, когда заполяем первую строку таблицы
                if (i == 1) {
                    switch (j) {
                        // Ветвь логики, когда заполняем первую ячейку
                        case 1:
                            // System.out.print("X");
                            // В массив №1 (row1) вставляем символ 'X'
                            // - в ячейку под индексом 0, то есть в первую из трех
                            row1[0] = 'X';
                            break;
                        // Ветвь логики, когда заполняем вторую ячейку
                        case 2:
                            // System.out.print(" ");
                            // В массив №1 (row1) вставляем символ ' '
                            // - в ячейку под индексом 1, то есть во вторую из трех
                            row1[1] = ' ';
                            break;
                        // Ветвь логики, когда заполняем третью ячейку
                        case 3:
                            // System.out.println("O");
                            // В массив №1 (row1) вставляем символ 'O'
                            // - в ячейку под индексом 2, то есть в третью из трех
                            row1[2] = 'O';
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 2) {
                    switch (j) {
                        case 1:
                            // System.out.print("O");
                            // В массив №2 (row2) вставляем символ 'O'
                            // - в ячейку под индексом 0, то есть в первую из трех
                            row2[0] = 'O';
                            break;
                        case 2:
                            // System.out.print("X");
                            row2[1] = 'X';
                            break;
                        case 3:
                            // System.out.println("X");
                            row2[2] = 'X';
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 3) {
                    switch (j) {
                        case 1:
                            // System.out.print(" ");
                            row3[0] = ' ';
                            break;
                        case 2:
                            // System.out.print(" ");
                            row3[1] = ' ';
                            break;
                        case 3:
                            // System.out.println("O");
                            row3[2] = 'O';
                            break;
                        default:
                            break;
                    }
                }
            } // Скобка, обозначающая конец цикла, в котором создаются ячейки текущей строки таблицы
        } // Скобка, обозначающая конец цикла, в котором создаются строки таблицы
        
        // Вывод данных массивов (таблицы) в консоль
        for (int i = 0; i < 3; i++) {
            System.out.print(row1[i]);
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(row2[i]);
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(row3[i]);
        }
        
        /* Массив массивов символов (Двумерный массив) */
        
        /* Одномерные массивы */
        
        // Создать три одномерных массива по 3 элемента в каждом
        // 1 массив
        /*char[] row1 = new char[3];
        // 2 массив
        char[] row2 = new char[3];
        // 3 массив
        char[] row3 = new char[3];
        
        char[][] table = {row1, row2, row3};
        
        for (int i = 1; i <= 3; i++) {
            // System.out.println("work " + i);
            for (int j = 1; j <= 3; j++) {
                // Row 1
                // Ветвь логики, когда заполяем первую строку таблицы
                if (i == 1) {
                    switch (j) {
                        // Ветвь логики, когда заполняем первую ячейку
                        case 1:
                            // System.out.print("X");
                            // В массив №1 (row1) вставляем символ 'X'
                            // - в ячейку под индексом 0, то есть в первую из трех
                            // row1[0] = 'X';
                            // Записываем в подмассив row1 (обращаемся к нему по индексу 0)
                            // символ 'X'
                            table[0][0] = 'X';
                            break;
                        // Ветвь логики, когда заполняем вторую ячейку
                        case 2:
                            // System.out.print(" ");
                            // В массив №1 (row1) вставляем символ ' '
                            // - в ячейку под индексом 1, то есть во вторую из трех
                            // row1[1] = ' ';
                            // Записываем в подмассив row1 (обращаемся к нему по индексу 0)
                            // символ 'X'
                            table[0][1] = 'X';
                            break;
                        // Ветвь логики, когда заполняем третью ячейку
                        case 3:
                            // System.out.println("O");
                            // В массив №1 (row1) вставляем символ 'O'
                            // - в ячейку под индексом 2, то есть в третью из трех
                            // row1[2] = 'O';
                            // Записываем в подмассив row1 (обращаемся к нему по индексу 0)
                            // символ 'O'
                            table[0][2] = 'O';
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 2) {
                    switch (j) {
                        case 1:
                            // System.out.print("O");
                            // В массив №2 (row2) вставляем символ 'O'
                            // - в ячейку под индексом 0, то есть в первую из трех
                            // row2[0] = 'O';
                            table[1][0] = 'O';
                            break;
                        case 2:
                            // System.out.print("X");
                            // row2[1] = 'X';
                            table[1][1] = 'X';
                            break;
                        case 3:
                            // System.out.println("X");
                            // row2[2] = 'X';
                            table[1][2] = 'X';
                            break;
                        default:
                            break;
                    }
                }
                
                if (i == 3) {
                    switch (j) {
                        case 1:
                            // System.out.print(" ");
                            // row3[0] = ' ';
                            table[2][0] = ' ';
                            break;
                        case 2:
                            // System.out.print(" ");
                            // row3[1] = ' ';
                            table[2][1] = ' ';
                            break;
                        case 3:
                            // System.out.println("O");
                            // row3[2] = 'O';
                            table[2][2] = 'O';
                            break;
                        default:
                            break;
                    }
                }
            } // Скобка, обозначающая конец цикла, в котором создаются ячейки текущей строки таблицы
        } // Скобка, обозначающая конец цикла, в котором создаются строки таблицы
        
        // Вывод данных массивов (таблицы) в консоль
        // Перебираем строки 2д массива
        for (int i = 0; i < 3; i++) {
            // Перебираем ячейки текущего подмассива 
            for (int j = 0; j < 3; j++) {
                // Выводим значение из строки №i, ячейки №j
                System.out.print(table[i][j]);
            }
            System.out.println();
        }*/
    }
}
