package com.example.evgen.androidlaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_activity = findViewById(R.id.button_activity1);

        button_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivityy.class);
                startActivity(intent);
            }
        });

    }
    public  void onClick(View view){
        Toast toast = Toast.makeText(this, "WORKS?!",Toast.LENGTH_LONG);
        toast.show();
    }


}
