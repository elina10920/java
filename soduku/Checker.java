package com.company;
import java.util.Scanner;
public class Checker {

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        System.out.println("enter the sudoku");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                sudoku.sudo[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku.sudo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(sudoku.check());
    }
}
