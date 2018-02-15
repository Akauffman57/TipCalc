package com.example.android.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText inputcost;
    private EditText inputpeople;
    private TextView outputcost;
    private TextView outputcost2;
    private TextView barlabel;
    private SeekBar bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputcost = findViewById(R.id.cost);
        inputpeople = findViewById(R.id.split);
        outputcost = findViewById(R.id.done);
        outputcost2 = findViewById(R.id.total2);
        barlabel = findViewById(R.id.label);
        bar = findViewById(R.id.TipPercent);
        bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        barlabel.setText(i+"");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
    }
    public void Calculate(View v){
        String input1 = inputcost.getText().toString();
        String input2 = inputpeople.getText().toString();
        String input3 = barlabel.getText().toString();
        double cost = Double.parseDouble(input1);
        double people = Double.parseDouble(input2);
        int percent = Integer.parseInt(input3);
        double tip;
        tip = (cost)*(percent*.01);
        outputcost.setText("$"+tip);
        double total;
        total = cost+tip;
        outputcost2.setText("$"+total);



    }
}
