package com.example.datetimepickers;

import android.support.v4.app.DialogFragment;
import android.app.TimePickerDialog;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePicker();

    }


    public void showTimePickerDialog(View view) {
      DialogFragment newFragment = new TimeFragment;
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" + day_string + year_string);

        Toast.makeText(
                this, getString(R.string.date), Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfTheDay, int minutes) {
        String hour_string = Integer.toString(hourOfTheDay);
        String minute_string = Integer.toString(minutes);

        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time), timeMessage + Toast.LENGTH_SHORT).show();
    }


}