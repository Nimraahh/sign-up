package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        TextView txt5= (TextView) findViewById(R.id.txt5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txt5.setText("Sign Up Successful !!!");
            }
        });
    }
}