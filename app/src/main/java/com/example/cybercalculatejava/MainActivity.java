package com.example.cybercalculatejava;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button checkSkillsButton = findViewById(R.id.check_skills_button);
        checkSkillsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CheckSkills.class);
            startActivity(intent);
        });
    }
}
