package com.company;
import java.util.Scanner;
/**
 *
 * @author elina
 */
public class GameLauncher {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Character check = new Character('Y'); //檢查使用者是否想再玩

        do {


            Guess gs = new Guess(100);

            System.out.println("***********猜數字遊戲***********");
            System.out.print("猜數字範圍最小值：");
            gs.min = scanner.nextInt();
            System.out.print("猜數字範圍最大值：");
            gs.max = scanner.nextInt();
            System.out.print("猜數字次數限制：");
            gs.limit = scanner.nextInt();

            System.out.println("***********遊戲開始***********");
            gs.setGuess();
            System.out.println("***********遊戲結束***********");
            gs.showGuess();
            System.out.printf("猜數字限制%d次\n", gs.limit);
            System.out.printf("您總共猜%d次\n", gs.count);
            System.out.printf("正確數字：%d\n", gs.correct);
            System.out.println("***********再玩一次(Y/N)***********");
            check=scanner.next().charAt(0);

        } while (check.equals('Y'));

    }
}
