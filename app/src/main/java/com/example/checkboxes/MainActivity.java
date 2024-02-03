package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox masculinCheckBox, femininCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masculinCheckBox = (CheckBox)findViewById(R.id.masculin);
        femininCheckBox = (CheckBox)findViewById(R.id.feminin);
    }

    public void onMasculinClicked(View view) {

        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);

        if(checkBox.isChecked()) {
            selection.setText("Masculin");
            femininCheckBox.setChecked(false);
        }
    }
    public void onFemininClicked(View view) {

        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);

        if(checkBox.isChecked()) {
            selection.setText("Feminin");
            masculinCheckBox.setChecked(false);
        }
    }
}