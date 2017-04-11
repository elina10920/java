package com.company;

/**
 * Created by elina on 2017/4/2.
 */
public class Sudoku {
    public int[][] sudo = new int[9][9];

    public boolean check() {

        for (int i = 0; i < 9; i++) {

            for (int j = 1; j < 9; j++) {    //check row
                for (int k = j - 1; k >= 0; k--) {
                    if (sudo[i][j] == sudo[i][k]) {
                        return false;
                    }
                }
            }

            for(int j=1;j<9;j++){      //check column
                for(int k=j-1;k>=0;k--){
                    if(sudo[j][i]==sudo[k][i]){
                        return false;
                    }
                }
            }


            for(int j=1;j<9;j++){    //check little square
                for(int k=j-1;k>=0;k--){
                    if(sudo[i%3*3+j/3][j%3+i/3*3]==sudo[i%3*3+k/3][k%3+i/3*3])
                    {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
