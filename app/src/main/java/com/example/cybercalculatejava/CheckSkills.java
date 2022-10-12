package com.example.cybercalculatejava;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class CheckSkills extends AppCompatActivity {
    private Button resultFirstPlayerButton;
    private Button resultSecondPlayerButton;
    private TextView resultFirstPlayerTextView;
    private TextView resultSecondPlayerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_skills);
        initViews();
        resultFirstPlayerButton.setOnClickListener(view -> sumFirstPlayer());
        resultSecondPlayerButton.setOnClickListener(view -> sumSecondPlayer());
    }

    private void sumFirstPlayer() {
        Random random = new Random();
        int dice = random.nextInt((10) + 1);
        EditText parameterFirstPlayerEditText = findViewById(R.id.parameter_first_player_edit_text);
        String valueParameter = parameterFirstPlayerEditText.getText().toString();
        int p1 = Integer.parseInt(valueParameter);
        EditText skillFirstPlayerEditText = findViewById(R.id.skill_first_player_edit_text);
        String valueSkill = skillFirstPlayerEditText.getText().toString();
        int s1 = Integer.parseInt(valueSkill);
        EditText modifierFirstPlayerEditText = findViewById(R.id.modifier_first_player_edit_text);
        String valueModifier = modifierFirstPlayerEditText.getText().toString();
        int m1 = Integer.parseInt(valueModifier);
        int result1 = p1 + s1 +dice - m1;
        if(dice ==10){
            int resultSuccess = result1+dice;
            Toast.makeText(this, "Бахнул крит!!", Toast.LENGTH_SHORT).show();
            resultFirstPlayerTextView.setText(String.valueOf(resultSuccess));
        }else {
            resultFirstPlayerTextView.setText(String.valueOf(result1));
        }
        if (dice ==1){
            int resultFailure = result1 - dice;
            Toast.makeText(this, "Критическая неудача", Toast.LENGTH_SHORT).show();
            resultFirstPlayerTextView.setText(String.valueOf(resultFailure));
        }else{
            resultFirstPlayerTextView.setText(String.valueOf(result1));
        }
    }
    private void sumSecondPlayer() {
        Random random = new Random();
        int dice = random.nextInt((10) + 1);
        EditText parameterSecondPlayerEditText = findViewById(R.id.parameter_second_player_edit_text);
        String valueParameter = parameterSecondPlayerEditText.getText().toString();
        int p1 = Integer.parseInt(valueParameter);
        EditText skillSecondPlayerEditText = findViewById(R.id.skill_second_player_edit_text);
        String valueSkill = skillSecondPlayerEditText.getText().toString();
        int s1 = Integer.parseInt(valueSkill);
        EditText modifierSecondPlayerEditText = findViewById(R.id.modifier_second_player_edit_text);
        String valueModifier = modifierSecondPlayerEditText.getText().toString();
        int m1 = Integer.parseInt(valueModifier);
        int result2 = p1 + s1 + dice - m1;
        if(dice ==10){
            int resultSuccess = result2+dice;
            Toast.makeText(this, "Бахнул крит!!", Toast.LENGTH_SHORT).show();
            resultSecondPlayerTextView.setText(String.valueOf(resultSuccess));
        }else {
            resultSecondPlayerTextView.setText(String.valueOf(result2));
        }
        if (dice ==1){
            int resultFailure = result2 - dice;
            Toast.makeText(this, "Критическая неудача", Toast.LENGTH_SHORT).show();
            resultSecondPlayerTextView.setText(String.valueOf(resultFailure));
        }else{
            resultSecondPlayerTextView.setText(String.valueOf(result2));
        }
    }
    private void initViews() {
        resultFirstPlayerButton = findViewById(R.id.result_first_player_button);
        resultSecondPlayerButton = findViewById(R.id.result_second_player_button);
        resultFirstPlayerTextView = findViewById(R.id.result_first_player_text_view);
        resultSecondPlayerTextView = findViewById(R.id.result_second_player_text_view);
    }
}