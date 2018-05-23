package com.example.evgen.androidlaba;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {
    private Switch switch1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        switch1 = findViewById(R.id.switch11);
        textView = findViewById(R.id.textView);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    //button.setText(getResources().getString(R.string.button_subtraction_numbers));

                    textView.setText("activ");
                } else {
                    // button.setText(getResources().getString(R.string.button_addition_numbers));
                    textView.setText("unactiv");
                }
            }
        });

    }


}
