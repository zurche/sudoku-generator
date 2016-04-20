package com.example.zurcher.sudokugenerator.generator;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by zurcher on 19/04/16.
 */
public class SudokuBoardGenerator {
    private static final int BOARD_SIZE_FOUR = 4;
    private static final int BOARD_SIZE_NINE = 9;

    private static final int COLUMN_A_INDEX = 0;
    private static final int COLUMN_B_INDEX = 3;
    private static final int COLUMN_C_INDEX = 6;

    int[][] values = new int[BOARD_SIZE_FOUR][BOARD_SIZE_FOUR];

    public int[][] generateNineValueSudokuValuesFixedPlaces() {

        /**
         * VALID SINGLE VALUE LOCATION:
         * A: [0][0];[1][5];[2][6];[3][1];[4][4];[5][8];[6][3];[7][7];[8][2];
         * B: [0][3];[1][2];[2][8];[3][0];[4][5];[5][6];[6][1];[7][4];[8][7];
         * C: [0][2];[1][6];[2][3];[3][5];[4][1];[5][7];[6][4];[7][0];[8][8];
         * D: [0][1];[1][3];[2][7];[3][2];[4][8];[5][5];[6][0];[7][6];[8][4];
         * E: [0][4];[1][7];[2][1];[3][3];[4][6];[5][0];[6][2];[7][8];[8][5];
         * F: [0][8];[1][4];[2][2];[3][6];[4][0];[5][3];[6][7];[7][1];[8][3];
         * G: [0][5];[1][8];[2][0];[3][7];[4][2];[5][4];[6][6];[7][3];[8][1];
         * H: [0][6];[1][0];[2][4];[3][8];[4][3];[5][1];[6][5];[7][2];[8][6];
         * I: [0][7];[1][1];[2][5];[3][4];[4][7];[5][2];[6][8];[7][5];[8][0];
         */

        values = new int[BOARD_SIZE_NINE][BOARD_SIZE_NINE];

        LinkedList<Integer> possibleNumbers = new LinkedList();
        possibleNumbers.add(1);
        possibleNumbers.add(2);
        possibleNumbers.add(3);
        possibleNumbers.add(4);
        possibleNumbers.add(5);
        possibleNumbers.add(6);
        possibleNumbers.add(7);
        possibleNumbers.add(8);
        possibleNumbers.add(9);

        int randomIndexLimit = BOARD_SIZE_NINE - 1;

        // FILLING 'A' VALUE
        int tmpIndex = getNewRandomInt(0, randomIndexLimit);
        int numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][0] = numberToFill;
        values[1][5] = numberToFill;
        values[2][6] = numberToFill;
        values[3][1] = numberToFill;
        values[4][4] = numberToFill;
        values[5][8] = numberToFill;
        values[6][3] = numberToFill;
        values[7][7] = numberToFill;
        values[8][2] = numberToFill;

        // FILLING 'B' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][3] = numberToFill;
        values[1][2] = numberToFill;
        values[2][8] = numberToFill;
        values[3][0] = numberToFill;
        values[4][5] = numberToFill;
        values[5][6] = numberToFill;
        values[6][1] = numberToFill;
        values[7][4] = numberToFill;
        values[8][7] = numberToFill;

        // FILLING 'C' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][2] = numberToFill;
        values[1][6] = numberToFill;
        values[2][3] = numberToFill;
        values[3][5] = numberToFill;
        values[4][1] = numberToFill;
        values[5][7] = numberToFill;
        values[6][4] = numberToFill;
        values[7][0] = numberToFill;
        values[8][8] = numberToFill;

        // FILLING 'D' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][1] = numberToFill;
        values[1][3] = numberToFill;
        values[2][7] = numberToFill;
        values[3][2] = numberToFill;
        values[4][8] = numberToFill;
        values[5][5] = numberToFill;
        values[6][0] = numberToFill;
        values[7][6] = numberToFill;
        values[8][4] = numberToFill;

        // FILLING 'E' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][4] = numberToFill;
        values[1][7] = numberToFill;
        values[2][1] = numberToFill;
        values[3][3] = numberToFill;
        values[4][6] = numberToFill;
        values[5][0] = numberToFill;
        values[6][2] = numberToFill;
        values[7][8] = numberToFill;
        values[8][5] = numberToFill;

        // FILLING 'F' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][8] = numberToFill;
        values[1][4] = numberToFill;
        values[2][2] = numberToFill;
        values[3][6] = numberToFill;
        values[4][0] = numberToFill;
        values[5][3] = numberToFill;
        values[6][7] = numberToFill;
        values[7][1] = numberToFill;
        values[8][3] = numberToFill;

        // FILLING 'G' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][5] = numberToFill;
        values[1][8] = numberToFill;
        values[2][0] = numberToFill;
        values[3][7] = numberToFill;
        values[4][2] = numberToFill;
        values[5][4] = numberToFill;
        values[6][6] = numberToFill;
        values[7][3] = numberToFill;
        values[8][1] = numberToFill;

        // FILLING 'H' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][6] = numberToFill;
        values[1][0] = numberToFill;
        values[2][4] = numberToFill;
        values[3][8] = numberToFill;
        values[4][3] = numberToFill;
        values[5][1] = numberToFill;
        values[6][5] = numberToFill;
        values[7][2] = numberToFill;
        values[8][6] = numberToFill;

        // FILLING 'I' VALUE
        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][7] = numberToFill;
        values[1][1] = numberToFill;
        values[2][5] = numberToFill;
        values[3][4] = numberToFill;
        values[4][7] = numberToFill;
        values[5][2] = numberToFill;
        values[6][8] = numberToFill;
        values[7][5] = numberToFill;
        values[8][0] = numberToFill;

        return values;
    }

    public int[][] generateFourValueSudokuValuesFixedPlaces() {

        /**
         * VALID SINGLE VALUE LOCATION:
         * A: [0][0];[1][2];[2][1];[3][3]
         * B: [1][0];[0][3];[2][2];[3][1]
         * C: [0][1];[1][3];[2][0];[3][2]
         * D: [3][0];[1][1];[0][2];[2][3]
         */

        values = new int[BOARD_SIZE_FOUR][BOARD_SIZE_FOUR];

        LinkedList<Integer> possibleNumbers = new LinkedList();
        possibleNumbers.add(1);
        possibleNumbers.add(2);
        possibleNumbers.add(3);
        possibleNumbers.add(4);

        int randomIndexLimit = BOARD_SIZE_FOUR - 1;

        int tmpIndex = getNewRandomInt(0, randomIndexLimit);
        int numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][0] = numberToFill;
        values[1][2] = numberToFill;
        values[2][1] = numberToFill;
        values[3][3] = numberToFill;

        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][3] = numberToFill;
        values[1][0] = numberToFill;
        values[2][2] = numberToFill;
        values[3][1] = numberToFill;

        randomIndexLimit--;
        tmpIndex = getNewRandomInt(0, randomIndexLimit);
        numberToFill = possibleNumbers.remove(tmpIndex);

        values[0][1] = numberToFill;
        values[1][3] = numberToFill;
        values[2][0] = numberToFill;
        values[3][2] = numberToFill;

        numberToFill = possibleNumbers.remove(0);

        values[3][0] = numberToFill;
        values[1][1] = numberToFill;
        values[0][2] = numberToFill;
        values[2][3] = numberToFill;

        shuffleRandomColumns();

        return values;
    }

    private void shuffleRandomColumns() {
        LinkedList<Integer> possibleNumbers = new LinkedList();
        possibleNumbers.add(COLUMN_A_INDEX);
        possibleNumbers.add(COLUMN_B_INDEX);
        possibleNumbers.add(COLUMN_C_INDEX);

        int randomIndexA = getNewRandomInt(0,2);
        int columnAIndex = possibleNumbers.get(randomIndexA);

        int randomIndexB = getNewRandomInt(0,2);
        int columnBIndex = possibleNumbers.get(randomIndexB);

        swapColumns(columnAIndex, columnBIndex);
    }

    private int getNewRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    private int[][] swapColumns(int columnAStartingColumnIndex, int columnBStartingColumnIndex) {

        int tmpColIndex = 0;

        int[][] columnA = new int[9][3];
        int[][] columnB = new int[9][3];

        for(int row = 0; row < 9; row ++) {
            for(int col = columnAStartingColumnIndex; col < columnAStartingColumnIndex + 3; col ++) {
                columnA[row][tmpColIndex] = values[row][col];
                tmpColIndex++;
            }
            tmpColIndex = 0;
        }

        for(int row = 0; row < 9; row ++) {
            for(int col = columnBStartingColumnIndex; col < columnBStartingColumnIndex + 3; col ++) {
                columnB[row][tmpColIndex] = values[row][col];
                values[row][col] = columnA[row][tmpColIndex];
                tmpColIndex++;
            }
            tmpColIndex = 0;
        }

        for(int row = 0; row < 9; row ++) {
            for(int col = columnAStartingColumnIndex; col < columnAStartingColumnIndex + 3; col ++) {
                values[row][col] = columnB[row][tmpColIndex];
                tmpColIndex++;
            }
            tmpColIndex = 0;
        }

        return values;
    }
}
