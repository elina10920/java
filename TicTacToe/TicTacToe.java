package com.company;
import java.util.Arrays;
import java.text.ParseException;
/**
 * Created by elina on 2017/4/1.
 */
public class TicTacToe {
    public String[][] board;
    public String answer;
    public int row_po;
    public int col_po;
    public String[] input;
    public int count ;

    public TicTacToe(int row, int col) {
        count =0;
        answer = null;
        board = new String[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j] = null;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j] != null){
                    System.out.print(" ");
                    System.out.print(board[i][j]);
                }
                if (j != 2) {
                    if(board[i][j] == null)
                        System.out.print("  ");
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != 2)
                System.out.println("---------");
        }

    }

    public boolean check() {
        input = answer.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] results = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            results[i] = Integer.parseInt(input[i].trim());
            if (results[i] <= 0 || results[i] > 3 || i > 1) {
                System.out.println("數字範圍輸入錯誤");
                return false;
            }
        }
        row_po = Integer.parseInt(input[0].trim());
        col_po = Integer.parseInt(input[1].trim());

        if(board[row_po-1][col_po-1] != null){
            System.out.println("此處已滿");
            return false;
        }

        return true;
    }

    public void inputBoard() {
        if(count%2 != 0) {
            board[row_po-1][col_po-1] = "x";
        }else{
            board[row_po-1][col_po-1] = "o";
        }
    }

    public boolean equal() {
        for (int i = 0; i < 3; i++) {      //平手
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != null && count == 9) {
                    System.out.println("平手");
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {              //橫的win
            if(board[i][0]!=null && board[i][1]!=null &&  board[i][2]!=null){
                if (board[i][0] == board[i][1]) {
                    if (board[i][0] == board[i][2]) {
                        if (board[i][0].equals("x")) {
                            System.out.println("player x win!!");
                        } else {
                            System.out.println("player o win!!");
                        }
                        return false;
                    }
                }
            }

        }
        for (int i = 0; i < 3; i++) {    //直的win
            if(board[0][i]!=null && board[1][i]!=null &&  board[2][i]!=null){
                if (board[0][i] == board[1][i]) {
                    if (board[0][i] == board[2][i]) {
                        if (board[0][i].equals("x")) {
                            System.out.println("player x win!!");
                        } else {
                            System.out.println("player o win!!");
                        }
                        return false;
                    }
                }

            }
        }
        if(board[0][0]!=null && board[1][1]!=null &&  board[2][2]!=null){  //右撇win
            if (board[0][0] == board[1][1]) {
                if (board[0][0] == board[2][2]) {
                    if (board[0][0].equals("x")) {
                        System.out.println("player x win!!");
                    } else {
                        System.out.println("player o win!!");
                    }
                    return false;
                }
            }
        }
        if(board[0][2]!=null && board[1][1]!=null &&  board[2][0]!=null){  //左撇win
            if (board[0][2] == board[1][1]) {
                if (board[0][2] == board[2][0]) {
                    if (board[0][2].equals("x")) {
                        System.out.println("player x win!!");
                    } else {
                        System.out.println("player o win!!");
                    }
                    return false;
                }
            }
        }
        return true;
    }


}
