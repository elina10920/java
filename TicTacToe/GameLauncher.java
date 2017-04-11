package com.company;
import java.util.Scanner;
public class GameLauncher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character check = new Character('Y');
        boolean continuePlaying = true;

        while(continuePlaying){
            TicTacToe game = new TicTacToe(3,3);
            System.out.println("*****game start*****");
            do{
                System.out.print("player x enter your move(row[1-3],column[1-3]):");
                game.answer = scan.nextLine();
                while(!game.check()){
                    System.out.print("player x enter your move(row[1-3],column[1-3]):");
                    game.answer = scan.nextLine();
                    game.check();
                }
                game.count++;
                game.inputBoard();
                game.printBoard();

                if(!game.equal()){
                    break;
                }

                System.out.print("player o enter your move(row[1-3],column[1-3]):");
                game.answer = scan.nextLine();
                while(!game.check()){
                    System.out.print("player o enter your move(row[1-3],column[1-3]):");
                    game.answer = scan.nextLine();
                    game.check();
                }
                game.count++;
                game.inputBoard();
                game.printBoard();
                if(!game.equal()){
                    break;
                }
            } while(true);

            System.out.println("*****game over*****");
            System.out.println("play again(Y/N)?");
            check = scan.next().charAt(0);
            if (!check.equals('Y')) {
                continuePlaying = false;
            }
            /*
            我盡力了，這個重新開始的bug一直de不出來ＱＱ
            */
        }
    }
}
