package com.example.ahmadalomary.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int total= 0;
    int totalb= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3(View view){
        display(3);
    }

    public void add2(View view){
        display(2);
    }


    public void add3b(View view){
        displayb(3);
    }

    public void add2b(View view){
        displayb(2);
    }

    public void freeThrow(View view){
        display(1);
    }

    public void freeThrowb(View view){
        displayb(1);
    }

    private void display(int number) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        total += number;
        teamAScore.setText("" + total);
    }

    private void displayb(int number) {
        TextView teamBScore = (TextView) findViewById(R.id.quantityBTextView);
        totalb += number;
        teamBScore.setText("" + totalb);
    }

    public void reset(View view){
        TextView teamBScore = (TextView) findViewById(R.id.quantityBTextView);
        teamBScore.setText("0");
        totalb = 0;
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        total = 0;
        teamAScore.setText("0");
    }
}
