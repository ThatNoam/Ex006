package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        txt = findViewById((R.id.txt));

        btn.setText("Click me");



    }

    public void clicked(View view) {
        btn.setText("Click me");
        counter += 1;

        if ((counter % 7) == 0) {
            btn.setText("BOOM");
        }

        txt.setText("This is a click number: " + counter);
        }

}
