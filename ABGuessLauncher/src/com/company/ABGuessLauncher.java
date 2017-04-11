package com.company;
import java.util.Scanner;
public class ABGuessLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character check = new Character('Y'); //檢查使用者是否想再玩
        do {
            System.out.println("**********猜數字遊戲**********");
            /**
             * 建構子，配置陣列長度，並設定陣列元素初始值為 0
             */
            ABGuess gs = new ABGuess(4);
            System.out.printf("正確答案:");
            gs.CorrectAnswer();

            System.out.println("**********遊戲開始**********");
            boolean is_correct;
            do {

                gs.guess();
                is_correct = gs.compare();
            } while (!is_correct);
            System.out.println("**********再玩一次(Y/N)**********");
            check = scanner.next().charAt(0);
        } while (check.equals('Y'));
    }

}
