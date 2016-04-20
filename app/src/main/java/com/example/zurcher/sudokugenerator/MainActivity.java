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

    @Bind(R.id.Q1_0) TextView q1_0;
    @Bind(R.id.Q1_1) TextView q1_1;
    @Bind(R.id.Q1_2) TextView q1_2;
    @Bind(R.id.Q1_3) TextView q1_3;

    @Bind(R.id.Q2_0) TextView q2_0;
    @Bind(R.id.Q2_1) TextView q2_1;
    @Bind(R.id.Q2_2) TextView q2_2;
    @Bind(R.id.Q2_3) TextView q2_3;

    @Bind(R.id.Q3_0) TextView q3_0;
    @Bind(R.id.Q3_1) TextView q3_1;
    @Bind(R.id.Q3_2) TextView q3_2;
    @Bind(R.id.Q3_3) TextView q3_3;

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
        int[][] values = mSudokuGenerator.generateFourValueSudokuValuesFixedPlaces();

        q0_0.setText("" + values[0][0]);
        q0_1.setText("" + values[0][1]);
        q1_0.setText("" + values[1][0]);
        q1_1.setText("" + values[1][1]);

        q2_0.setText("" + values[2][0]);
        q2_1.setText("" + values[2][1]);
        q3_0.setText("" + values[3][0]);
        q3_1.setText("" + values[3][1]);

        q0_2.setText("" + values[0][2]);
        q0_3.setText("" + values[0][3]);
        q1_2.setText("" + values[1][2]);
        q1_3.setText("" + values[1][3]);

        q2_2.setText("" + values[2][2]);
        q2_3.setText("" + values[2][3]);
        q3_2.setText("" + values[3][2]);
        q3_3.setText("" + values[3][3]);

        values = mSudokuGenerator.generateNineValueSudokuValuesFixedPlaces();

    }


}
