package com.company;
import java.util.Scanner;
/**
 * Created by elina on 2017/3/23.
 */
public class Guess {
    private int[] guess; // 宣告 guess 陣列，記錄使用者猜的數字
    public int limit; //限制輸入次數
    public int max;
    public int min;
    public int count; //算出使用者猜幾次
    public int correct; //正確答案

    /**
     * 建構子，配置陣列長度，並設定陣列元素初始值為 0
     */
    public Guess(int num) {
        guess = new int[num];
        for (int i = 0; i < guess.length; i++) {
            guess[i] = 0;
        }
    }
    /**
     * setGuess：輸入數字，存至 guess 陣列
     */
    public void setGuess() {
        correct = (int)(Math.random() * (max - min + 1) + min);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < limit; i++) {
            System.out.printf("數字範圍：%d~%d\n",min,max);
            System.out.print("您猜的數字：");
            guess[i] = input.nextInt(); // 取得使用者輸入，存至 guess 陣列
            count+=1;
            if(guess[i]>max || guess[i]<min){
                System.out.println("請輸入範圍內的數字");
                continue;
            }else {
                if (guess[i] < correct) {
                    System.out.println("猜錯了！您猜的數字比答案小！");
                    min = guess[i];

                } else if (guess[i] > correct) {
                    System.out.println("猜錯了！您猜的數字比答案大！");
                    max = guess[i];
                } else {
                    System.out.println("恭喜您猜對了！");
                    break;
                }
            }
        }
    }
    /**
     * showGuess：印出 guess 陣列每個元素之值
     */
    public void showGuess() {
        for (int i = 0; i < count; i++) {
            System.out.printf("第 %d 猜: %d\n", i + 1, guess[i]);
        }
        System.out.println("--");
    }


}