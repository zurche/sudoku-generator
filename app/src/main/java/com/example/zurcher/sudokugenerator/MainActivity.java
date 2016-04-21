package com.example.zurcher.sudokugenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.zurcher.sudokugenerator.generator.SudokuBoardGenerator;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.Q0_0) TextView q0_0;
    @Bind(R.id.Q0_1) TextView q0_1;
    @Bind(R.id.Q0_2) TextView q0_2;
    @Bind(R.id.Q0_3) TextView q0_3;
    @Bind(R.id.Q0_4) TextView q0_4;
    @Bind(R.id.Q0_5) TextView q0_5;
    @Bind(R.id.Q0_6) TextView q0_6;
    @Bind(R.id.Q0_7) TextView q0_7;
    @Bind(R.id.Q0_8) TextView q0_8;

    @Bind(R.id.Q1_0) TextView q1_0;
    @Bind(R.id.Q1_1) TextView q1_1;
    @Bind(R.id.Q1_2) TextView q1_2;
    @Bind(R.id.Q1_3) TextView q1_3;
    @Bind(R.id.Q1_4) TextView q1_4;
    @Bind(R.id.Q1_5) TextView q1_5;
    @Bind(R.id.Q1_6) TextView q1_6;
    @Bind(R.id.Q1_7) TextView q1_7;
    @Bind(R.id.Q1_8) TextView q1_8;

    @Bind(R.id.Q2_0) TextView q2_0;
    @Bind(R.id.Q2_1) TextView q2_1;
    @Bind(R.id.Q2_2) TextView q2_2;
    @Bind(R.id.Q2_3) TextView q2_3;
    @Bind(R.id.Q2_4) TextView q2_4;
    @Bind(R.id.Q2_5) TextView q2_5;
    @Bind(R.id.Q2_6) TextView q2_6;
    @Bind(R.id.Q2_7) TextView q2_7;
    @Bind(R.id.Q2_8) TextView q2_8;

    @Bind(R.id.Q3_0) TextView q3_0;
    @Bind(R.id.Q3_1) TextView q3_1;
    @Bind(R.id.Q3_2) TextView q3_2;
    @Bind(R.id.Q3_3) TextView q3_3;
    @Bind(R.id.Q3_4) TextView q3_4;
    @Bind(R.id.Q3_5) TextView q3_5;
    @Bind(R.id.Q3_6) TextView q3_6;
    @Bind(R.id.Q3_7) TextView q3_7;
    @Bind(R.id.Q3_8) TextView q3_8;

    @Bind(R.id.Q4_0) TextView q4_0;
    @Bind(R.id.Q4_1) TextView q4_1;
    @Bind(R.id.Q4_2) TextView q4_2;
    @Bind(R.id.Q4_3) TextView q4_3;
    @Bind(R.id.Q4_4) TextView q4_4;
    @Bind(R.id.Q4_5) TextView q4_5;
    @Bind(R.id.Q4_6) TextView q4_6;
    @Bind(R.id.Q4_7) TextView q4_7;
    @Bind(R.id.Q4_8) TextView q4_8;

    @Bind(R.id.Q5_0) TextView q5_0;
    @Bind(R.id.Q5_1) TextView q5_1;
    @Bind(R.id.Q5_2) TextView q5_2;
    @Bind(R.id.Q5_3) TextView q5_3;
    @Bind(R.id.Q5_4) TextView q5_4;
    @Bind(R.id.Q5_5) TextView q5_5;
    @Bind(R.id.Q5_6) TextView q5_6;
    @Bind(R.id.Q5_7) TextView q5_7;
    @Bind(R.id.Q5_8) TextView q5_8;

    @Bind(R.id.Q6_0) TextView q6_0;
    @Bind(R.id.Q6_1) TextView q6_1;
    @Bind(R.id.Q6_2) TextView q6_2;
    @Bind(R.id.Q6_3) TextView q6_3;
    @Bind(R.id.Q6_4) TextView q6_4;
    @Bind(R.id.Q6_5) TextView q6_5;
    @Bind(R.id.Q6_6) TextView q6_6;
    @Bind(R.id.Q6_7) TextView q6_7;
    @Bind(R.id.Q6_8) TextView q6_8;

    @Bind(R.id.Q7_0) TextView q7_0;
    @Bind(R.id.Q7_1) TextView q7_1;
    @Bind(R.id.Q7_2) TextView q7_2;
    @Bind(R.id.Q7_3) TextView q7_3;
    @Bind(R.id.Q7_4) TextView q7_4;
    @Bind(R.id.Q7_5) TextView q7_5;
    @Bind(R.id.Q7_6) TextView q7_6;
    @Bind(R.id.Q7_7) TextView q7_7;
    @Bind(R.id.Q7_8) TextView q7_8;

    @Bind(R.id.Q8_0) TextView q8_0;
    @Bind(R.id.Q8_1) TextView q8_1;
    @Bind(R.id.Q8_2) TextView q8_2;
    @Bind(R.id.Q8_3) TextView q8_3;
    @Bind(R.id.Q8_4) TextView q8_4;
    @Bind(R.id.Q8_5) TextView q8_5;
    @Bind(R.id.Q8_6) TextView q8_6;
    @Bind(R.id.Q8_7) TextView q8_7;
    @Bind(R.id.Q8_8) TextView q8_8;

    private SudokuBoardGenerator mSudokuGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mSudokuGenerator = new SudokuBoardGenerator();

        generateSudokuBoardValues();
    }

    private void generateSudokuBoardValues() {
        int[][] values = mSudokuGenerator.generateNineValueSudokuValuesFixedPlaces();

        q0_0.setText("" + values[0][0]);
        q0_1.setText("" + values[0][1]);
        q0_2.setText("" + values[0][2]);
        q0_3.setText("" + values[0][3]);
        q0_4.setText("" + values[0][4]);
        q0_5.setText("" + values[0][5]);
        q0_6.setText("" + values[0][6]);
        q0_7.setText("" + values[0][7]);
        q0_8.setText("" + values[0][8]);

        q1_0.setText("" + values[1][0]);
        q1_1.setText("" + values[1][1]);
        q1_2.setText("" + values[1][2]);
        q1_3.setText("" + values[1][3]);
        q1_4.setText("" + values[1][4]);
        q1_5.setText("" + values[1][5]);
        q1_6.setText("" + values[1][6]);
        q1_7.setText("" + values[1][7]);
        q1_8.setText("" + values[1][8]);

        q2_0.setText("" + values[2][0]);
        q2_1.setText("" + values[2][1]);
        q2_2.setText("" + values[2][2]);
        q2_3.setText("" + values[2][3]);
        q2_4.setText("" + values[2][4]);
        q2_5.setText("" + values[2][5]);
        q2_6.setText("" + values[2][6]);
        q2_7.setText("" + values[2][7]);
        q2_8.setText("" + values[2][8]);

        q3_0.setText("" + values[3][0]);
        q3_1.setText("" + values[3][1]);
        q3_2.setText("" + values[3][2]);
        q3_3.setText("" + values[3][3]);
        q3_4.setText("" + values[3][4]);
        q3_5.setText("" + values[3][5]);
        q3_6.setText("" + values[3][6]);
        q3_7.setText("" + values[3][7]);
        q3_8.setText("" + values[3][8]);

        q4_0.setText("" + values[4][0]);
        q4_1.setText("" + values[4][1]);
        q4_2.setText("" + values[4][2]);
        q4_3.setText("" + values[4][3]);
        q4_4.setText("" + values[4][4]);
        q4_5.setText("" + values[4][5]);
        q4_6.setText("" + values[4][6]);
        q4_7.setText("" + values[4][7]);
        q4_8.setText("" + values[4][8]);

        q5_0.setText("" + values[5][0]);
        q5_1.setText("" + values[5][1]);
        q5_2.setText("" + values[5][2]);
        q5_3.setText("" + values[5][3]);
        q5_4.setText("" + values[5][4]);
        q5_5.setText("" + values[5][5]);
        q5_6.setText("" + values[5][6]);
        q5_7.setText("" + values[5][7]);
        q5_8.setText("" + values[5][8]);

        q6_0.setText("" + values[6][0]);
        q6_1.setText("" + values[6][1]);
        q6_2.setText("" + values[6][2]);
        q6_3.setText("" + values[6][3]);
        q6_4.setText("" + values[6][4]);
        q6_5.setText("" + values[6][5]);
        q6_6.setText("" + values[6][6]);
        q6_7.setText("" + values[6][7]);
        q6_8.setText("" + values[6][8]);

        q7_0.setText("" + values[7][0]);
        q7_1.setText("" + values[7][1]);
        q7_2.setText("" + values[7][2]);
        q7_3.setText("" + values[7][3]);
        q7_4.setText("" + values[7][4]);
        q7_5.setText("" + values[7][5]);
        q7_6.setText("" + values[7][6]);
        q7_7.setText("" + values[7][7]);
        q7_8.setText("" + values[7][8]);

        q8_0.setText("" + values[8][0]);
        q8_1.setText("" + values[8][1]);
        q8_2.setText("" + values[8][2]);
        q8_3.setText("" + values[8][3]);
        q8_4.setText("" + values[8][4]);
        q8_5.setText("" + values[8][5]);
        q8_6.setText("" + values[8][6]);
        q8_7.setText("" + values[8][7]);
        q8_8.setText("" + values[8][8]);

        values = mSudokuGenerator.generateNineValueSudokuValuesFixedPlaces();

    }


}
