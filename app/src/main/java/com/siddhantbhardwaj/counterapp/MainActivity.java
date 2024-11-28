package com.siddhantbhardwaj.counterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText, counterText;
    Button btn;

    int counterVal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn = findViewById(R.id.button);
        welcomeText = findViewById(R.id.welcomeText);
        counterText = findViewById(R.id.counterText);

        // Adding functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("" + increaseCounter());
            }
        });

    }

    public int increaseCounter(){
        return counterVal++;
    }



}