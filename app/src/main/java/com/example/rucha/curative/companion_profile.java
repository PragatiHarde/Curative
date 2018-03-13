package com.example.rucha.curative;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class companion_profile extends AppCompatActivity implements View.OnClickListener {

    private Button dogButton;
    private SimpleDateFormat dateFormatter;
    DatePickerDialog dobPickerDialog;
    EditText dogDob;
    EditText dogAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companion_profile);
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        //find view by id
        dogButton = (Button) findViewById(R.id.com_profile_button);
        dogButton.setOnClickListener(this);

        dogAge = findViewById(R.id.com_profile_editage);

        AutoCompleteTextView sex = findViewById(R.id.com_profile_editsex);
        AutoCompleteTextView blood = findViewById(R.id.com_profile_editbloodgrp);
        dogDob = findViewById(R.id.com_profile_editdob);


        //calculate dob n age
        setDateTimeField();



        //auto complete text fields

        final String[] SEX = new String[]{"Female", "Male"};
        ArrayAdapter<String> sex_adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, SEX);
        sex.setAdapter(sex_adapter);

        final String[] BLOOD = new String[]{"DEA 1.1 +", "DEA 1.1 -", "DEA 3", "DEA 4", "DEA 5", "DEA 6", "DEA 7"};
        ArrayAdapter<String> blood_adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, BLOOD);
        blood.setAdapter(blood_adapter);


        //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);

        //   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        // fab.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //  public void onClick(View view) {
        //     Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //             .setAction("Action", null).show();
        //  }
        //  });
    }


    @Override
    public void onClick(View view) {
        if (view == dogDob) {
            dobPickerDialog.show();

        }


    }




    void setDateTimeField() {

        dogDob.setOnClickListener(this);

        Calendar newCalendar = Calendar.getInstance();
        dobPickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                dogDob.setText(dateFormatter.format(newDate.getTime()));


                //calculate age
                Calendar today = Calendar.getInstance();

                int age = ((today.get(Calendar.YEAR) - newDate.YEAR));
                if(today.get(Calendar.MONTH) == newDate.get(Calendar.MONTH)){
                if (today.get(Calendar.DAY_OF_YEAR) < newDate.DAY_OF_YEAR) {
                    age--;
                } }

               // Integer ageInt =  Integer.valueOf(age);
               // String ageS = ageInt.toString();
                dogAge.setText(age);
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }
}
