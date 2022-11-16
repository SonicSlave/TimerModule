package com.example.timerprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    NumberPicker hours;
    NumberPicker mins;
    TextView msg;
    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hours = findViewById(R.id.npH);
        mins = findViewById(R.id.npM);
        msg = findViewById(R.id.tv3);
        conf = findViewById(R.id.conbutton);

        hours.setMinValue(0);
        hours.setMaxValue(23);
        hours.setValue(4);

        mins.setMinValue(0);
        mins.setMaxValue(59);
        mins.setValue(0);
    }

    public void PrintTime(View v)
    {
        int hr = hours.getValue();
        int min = mins.getValue();
        String toBeSent = "Trying to break the program?";
        conf.setVisibility(View.INVISIBLE);
        if(min != 0 || hr != 0)
        {
            toBeSent = "Set timer for ";
            if(hr == 1)
            {
                toBeSent += ("1 hour");
            }
            else if(hr > 1)
            {
                toBeSent += (hr + " hours");
            }

            if(hr > 0 && min > 0)
            {
                toBeSent += (" and ");
            }

            if(min == 1)
            {
                toBeSent += ("1 min");
            }
            else if(min > 1)
            {
                toBeSent += (min + " mins");
            }
            toBeSent += "?";
            conf.setVisibility(View.VISIBLE);
        }

        msg.setVisibility(View.VISIBLE);
        msg.setText(toBeSent);
    }
}