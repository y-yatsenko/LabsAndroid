package com.example.evgen.androidlaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class SecondActivityy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activityy);
    }

    public void onCheckboxClicked(View view) {
        CheckBox black = (CheckBox) findViewById(R.id.checkBoxb);
        CheckBox white = (CheckBox) findViewById(R.id.checkBoxw);
        String str = "";
        if(black.isChecked())
            str = black.getText() + " selected";
        else
        if(white.isChecked())
            str = white.getText() + " selected";
        if(black.isChecked() && white.isChecked()) {
            str = "good chooice";
            Intent intent = new Intent (SecondActivityy.this, ThirdActivity.class);
            startActivity(intent);
        }

        TextView slect = (TextView) findViewById(R.id.textView);
        slect.setText(str);
    }

}
