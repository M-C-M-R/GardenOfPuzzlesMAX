package com.example.gardenofpuzzles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PuzzleOptionsScreen extends AppCompatActivity {
    Button playBut,instBut,backBut;
    TextView title,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.options_screen_puzzle);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.bkrdColor));

        playBut = findViewById(R.id.playButton);
        instBut = findViewById(R.id.instructionsButton);
        backBut = findViewById(R.id.optMenuBackButton);
        title = findViewById(R.id.puzType);
        desc = findViewById(R.id.puzDesc);

        backBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        playBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),MultipleChoicePuzzle.class);
                MultipleChoiceQuestion question = MainActivity.getQuestion(1);
                intent.putExtra("QUESTION", question);
                startActivity(intent);
            }
        });

    }
}
