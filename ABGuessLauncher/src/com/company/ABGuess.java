package com.company;
import java.util.Scanner;
/**
 * Created by elina on 2017/3/24.
 */
public class ABGuess {
    private static  int[] input_guess;
    private static  int[] answer;
    public static int count;
    boolean repeat;



    public ABGuess(int num) {
        count = 0;
        input_guess = new int[num];
        for (int i = 0; i < input_guess.length; i++) {
            input_guess[i] = 0;
        }
        answer = new int[num];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }

    }

    public void CorrectAnswer(){

        for(int i=0;i<4;i++){
            do{
                repeat = false;
                answer[i] = (int)(Math.random() * 10);
                for(int j=0;j<i;j++){
                    if(answer[i] == answer[j]){
                        repeat =true;
                        break;
                    }
                }
            }while(repeat);
        }
        System.out.printf("%d%d%d%d\n",answer[0],answer[1],answer[2],answer[3]);
    }

    public void guess(){
        do{
            repeat =false;
            int i,j;
            System.out.println("請輸入您猜的數字：");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            count++;
            for(i=3;i>=0;i--){
                input_guess[i] =input % 10;
                input /= 10;
                for(j=3;j>i;j--){
                    if(input_guess[i] == input_guess[j]){
                        repeat =true;
                    }
                }
            }
            if(repeat == true){
                System.out.println("請輸入4個不同的數字！！");
            }

        }while(repeat);
    }

    public static boolean compare() {
        int a_count=0,b_count=0;
        for (int i = 0; i < 4; i++) {
            if (input_guess[i] == answer[i]) {
                a_count++;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (input_guess[i] == answer[j] && i != j) {
                        b_count++;
                        break;
                    }
                }
            }
        }
        System.out.printf("%dA%dB\n",a_count,b_count);
        if(a_count == 4){
            System.out.println("恭喜您答對了～～");
            System.out.println("**********遊戲結束**********");
            System.out.printf("您總共猜了%d次\n",count);
            return true;
        }else{
            return false;
        }
    }
}
