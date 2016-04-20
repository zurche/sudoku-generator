package com.example.zurcher.sudokugenerator.helper;

import android.util.Log;

import java.util.Random;

/**
 * Created by zurcher on 19/04/16.
 */
public class SudokuGenerator {
    private static final int BOARD_SIZE = 4;

    int[][] values = new int[BOARD_SIZE][BOARD_SIZE];

    public int[][] hardGenerateFirstQuadrantValues() {
        //-------------------------------------FIRST QUADRANT
        int q0_0 = getNewRandomInt(1, 4);
        Log.d("SudokuGenerator", "0,0 READY");
        values[0][0] = q0_0;

        int q0_1 = getNewRandomInt(1, 4);
        while (q0_1 == values[0][0]) {
            q0_1 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "0,1 READY");
        values[0][1] = q0_1;

        int q1_0 = getNewRandomInt(1, 4);
        while (q1_0 == values[0][0] ||
                q1_0 == values[0][1]) {
            q1_0 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "1,0 READY");
        values[1][0] = q1_0;

        int q1_1 = getNewRandomInt(1, 4);
        while (q1_1 == values[0][0] ||
                q1_1 == values[0][1] ||
                q1_1 == values[1][0]) {
            q1_1 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "1,1 READY");
        values[1][1] = q1_1;

        //-------------------------------------SECOND QUADRANT
        int q2_0 = getNewRandomInt(1, 4);
        while (q2_0 == values[0][0] ||
                q2_0 == values[1][0]) {
            q2_0 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "2,0 READY");
        values[2][0] = q2_0;

        int q3_0 = getNewRandomInt(1, 4);
        while (q3_0 == values[0][0] ||
                q3_0 == values[1][0] ||
                q3_0 == values[2][0]) {
            q3_0 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "3,0 READY");
        values[3][0] = q3_0;

        int q2_1 = getNewRandomInt(1, 4);
        while (q2_1 == values[0][1] ||
                q2_1 == values[1][1] ||
                q2_1 == values[2][0]) {
            q2_1 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "2,1 READY");
        values[2][1] = q2_1;

        int q3_1 = getNewRandomInt(1, 4);
        while (q3_1 == values[2][1] ||
                q3_1 == values[2][0] ||
                q3_1 == values[3][0]) {
            q3_1 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "3,1 READY");
        values[3][1] = q3_1;

        //-------------------------------------THIRD QUADRANT
        int q0_2 = getNewRandomInt(1, 4);
        while (q0_2 == values[0][0] ||
                q0_2 == values[0][1]) {
            q0_2 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "0,2 READY");
        values[0][2] = q0_2;

        int q0_3 = getNewRandomInt(1, 4);
        while (q0_3 == values[0][0] ||
                q0_3 == values[0][1] ||
                q0_3 == values[0][2]) {
            q0_3 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "0,3 READY");
        values[0][3] = q0_3;

        int q1_2 = getNewRandomInt(1, 4);
        while (q1_2 == values[0][2] ||
                q1_2 == values[1][0] ||
                q1_2 == values[1][1]) {
            q1_2 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "1,2 READY");
        values[1][2] = q1_2;

        int q1_3 = getNewRandomInt(1, 4);
        while (q1_3 == values[0][3] ||
                q1_3 == values[1][0] ||
                q1_3 == values[1][1] ||
                q1_3 == values[1][2]) {
            q1_3 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "1,3 READY");
        values[1][3] = q1_3;

        //-------------------------------------FOURTH QUADRANT
        int q2_2 = getNewRandomInt(1, 4);
        while (q2_2 == values[0][2] ||
                q2_2 == values[1][2] ||
                q2_2 == values[2][0] ||
                q2_2 == values[2][1]) {
            q2_2 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "2,2 READY");
        values[2][2] = q2_2;

        int q2_3 = getNewRandomInt(1, 4);
        while (q2_3 == values[0][3] ||
                q2_3 == values[1][3] ||
                q2_3 == values[2][0] ||
                q2_3 == values[2][1] ||
                q2_3 == values[2][2]) {
            q2_3 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "2,3 READY");
        values[2][3] = q2_3;

        int q3_2 = getNewRandomInt(1, 4);
        while (q3_2 == values[0][2] ||
                q3_2 == values[1][2] ||
                q3_2 == values[2][2] ||
                q3_2 == values[3][0] ||
                q3_2 == values[3][1]) {
            q3_2 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "3,2 READY");
        values[3][2] = q3_2;

        int q3_3 = getNewRandomInt(1, 4);
        while (q3_3 == values[0][3] ||
                q3_3 == values[1][3] ||
                q3_3 == values[2][3] ||
                q3_3 == values[3][0] ||
                q3_3 == values[3][1] ||
                q3_3 == values[3][2]) {
            q3_3 = getNewRandomInt(1, 4);
        }
        Log.d("SudokuGenerator", "3,3 READY");
        values[3][3] = q3_3;

        return values;
    }

    public int[][] softGenerateBoardValues() {
        // REMOVE THIS
        values = new int[BOARD_SIZE][BOARD_SIZE];

        int currentRandom = 0;
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                currentRandom = getNewRandomInt(1, 4);
                while (!isRandomValueValid(row, column, currentRandom)) {
                    currentRandom = getNewRandomInt(1, 4);
                }
                values[row][column] = currentRandom;
            }
        }
        return values;
    }

    private int getNewRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    private boolean isRandomValueValid(int row, int col, int newRandomValue) {
        boolean isRandomUniqueInColumn = isRandomUniqueInColumn(row, col, newRandomValue);
        boolean isRandomUniqueInRow = isRandomUniqueInRow(row, col, newRandomValue);
        return isRandomUniqueInColumn && isRandomUniqueInRow;
    }

    private boolean isRandomUniqueInColumn(int row, int col, int newRandomValue) {

        for (int currentRow = 0; currentRow < BOARD_SIZE; currentRow++) {
            if (currentRow != row) {
                if(values[currentRow][col] == newRandomValue) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isRandomUniqueInRow(int row, int col, int newRandomValue) {

        for (int currentColumn = 0; currentColumn < BOARD_SIZE; currentColumn++) {
            if (currentColumn != col) {
                if(values[row][currentColumn] == newRandomValue){
                    return false;
                }
            }
        }

        return true;
    }
}
