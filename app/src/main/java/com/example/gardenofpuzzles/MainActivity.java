
package com.example.gardenofpuzzles;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //buttons
    Button upButt;
    Button downButt;
    Button leftButt;
    Button rightBut;
    Button puzzButton;
    // views
    ImageView farmer;
    TextView position;
    //nums
    int positionNum = 0;
    long animationDeration = 1000; // millis
    //make questions
    static MultipleChoiceQuestion quest1=new MultipleChoiceQuestion(4, 1, "All bunnies like vegetables. A watermelon is a fruit. Which statement(s) are correct?",
            "neither", "All bunnies like watermelon", "No bunnies like watermelon", "both");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        // set buttons
        upButt = findViewById(R.id.upButton);
        downButt = findViewById(R.id.downButton);
        leftButt = findViewById(R.id.leftButton);
        rightBut = findViewById(R.id.rightButton);
        puzzButton = findViewById(R.id.puzButton);
        // set views
        position = findViewById(R.id.location);
        farmer = findViewById(R.id.farmerImage);

        // the positions that have gardens are 1,2,5,6,8
        //garden=puzzlecode(puzzletype); 1=1(Chess); 2=2(Fill Cup); 5=3(River); 6=4(Syllogism); 8=5(Truth)

        // each button gets a switch statement to handle all positions
        upButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (positionNum) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        positionNum = 0;
                        ObjectAnimator animatorY2 = ObjectAnimator.ofFloat(farmer, "y", 0f);
                        AnimatorSet animatiorSet2 = new AnimatorSet();
                        animatiorSet2.playTogether( animatorY2);
                        animatiorSet2.start();
                        break;
                    case 3:
                        positionNum = 1;
                        ObjectAnimator animatorY3 = ObjectAnimator.ofFloat(farmer, "y", 0f);
                        AnimatorSet animatiorSet3 = new AnimatorSet();
                        animatiorSet3.playTogether( animatorY3);
                        animatiorSet3.start();
                        break;
                    case 4:
                        positionNum = 3;
                        // fix
                        ObjectAnimator animatorY4 = ObjectAnimator.ofFloat(farmer, "y", 420f);
                        AnimatorSet animatiorSet4 = new AnimatorSet();
                        animatiorSet4.playTogether( animatorY4);
                        animatiorSet4.start();
                        break;
                    case 5:
                        positionNum = 2;
                        ObjectAnimator animatorY5 = ObjectAnimator.ofFloat(farmer, "y", 420f);
                        AnimatorSet animatiorSet5 = new AnimatorSet();
                        animatiorSet5.playTogether( animatorY5);
                        animatiorSet5.start();
                        break;
                    case 6:
                        positionNum = 4;
                        ObjectAnimator animatorY6 = ObjectAnimator.ofFloat(farmer, "y", 840f);
                        AnimatorSet animatiorSet6 = new AnimatorSet();
                        animatiorSet6.playTogether( animatorY6);
                        animatiorSet6.start();
                        break;
                    case 7:
                        positionNum = 6;
                        ObjectAnimator animatorY7 = ObjectAnimator.ofFloat(farmer, "y", 1000f);
                        AnimatorSet animatiorSet7 = new AnimatorSet();
                        animatiorSet7.playTogether( animatorY7);
                        animatiorSet7.start();
                        break;
                    case 8:
                        positionNum = 5;
                        ObjectAnimator animatorY8 = ObjectAnimator.ofFloat(farmer, "y", 840);
                        AnimatorSet animatiorSet8 = new AnimatorSet();
                        animatiorSet8.playTogether(animatorY8);
                        animatiorSet8.start();
                        break;
                }
                position.setText(String.valueOf(positionNum));
            }
        });

        downButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (positionNum) {
                    case 0:
                        positionNum = 2;
                        // code to add animation (need animator and animatiorSet1)
                        ObjectAnimator animatorY1 = ObjectAnimator.ofFloat(farmer, "y", 420f);
                        AnimatorSet animatiorSet1 = new AnimatorSet();
                        animatiorSet1.playTogether(animatorY1);
                        animatiorSet1.start();
                        break;
                    case 1:
                        positionNum = 3;
                        ObjectAnimator animatorY5 = ObjectAnimator.ofFloat(farmer, "y", 420f);
                        AnimatorSet animatiorSet5 = new AnimatorSet();
                        animatiorSet5.playTogether( animatorY5);
                        animatiorSet5.start();
                        break;
                    case 2:
                        positionNum = 5;
                        ObjectAnimator animatorY2 = ObjectAnimator.ofFloat(farmer, "y", 840f);
                        AnimatorSet animatiorSet2 = new AnimatorSet();
                        animatiorSet2.playTogether( animatorY2);
                        animatiorSet2.start();
                        break;
                    case 3:
                        positionNum = 4;
                        ObjectAnimator animatorY4 = ObjectAnimator.ofFloat(farmer, "y", 840f);
                        AnimatorSet animatiorSet4 = new AnimatorSet();
                        animatiorSet4.playTogether( animatorY4);
                        animatiorSet4.start();
                        break;
                    case 4:
                        positionNum = 6;
                        ObjectAnimator animatorY6 = ObjectAnimator.ofFloat(farmer, "y", 1000f);
                        AnimatorSet animatiorSet6 = new AnimatorSet();
                        animatiorSet6.playTogether( animatorY6);
                        animatiorSet6.start();
                        break;
                    case 5:
                        positionNum = 8;
                        ObjectAnimator animatorY3 = ObjectAnimator.ofFloat(farmer, "y", 1260f);
                        AnimatorSet animatiorSet3 = new AnimatorSet();
                        animatiorSet3.playTogether( animatorY3);
                        animatiorSet3.start();
                        break;
                    case 6:
                        positionNum = 7;
                        ObjectAnimator animatorY7 = ObjectAnimator.ofFloat(farmer, "y", 1260f);
                        AnimatorSet animatiorSet7 = new AnimatorSet();
                        animatiorSet7.playTogether( animatorY7);
                        animatiorSet7.start();
                        break;
                    case 7:
                        positionNum = 7;
                        break;
                }
                position.setText(String.valueOf(positionNum));
            }
        });

        leftButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (positionNum) {
                    case 0:
                        break;
                    case 1:
                        positionNum = 0;
                        ObjectAnimator animatorX1 = ObjectAnimator.ofFloat(farmer, "x", 0f);
                        animatorX1.setDuration(animationDeration);
                        AnimatorSet animatiorSet1 = new AnimatorSet();
                        animatiorSet1.playTogether(animatorX1);
                        animatiorSet1.start();
                        break;
                    case 2:
                        break;
                    case 3:
                        positionNum = 2;
                        ObjectAnimator animatorX2 = ObjectAnimator.ofFloat(farmer, "x", 0f);
                        animatorX2.setDuration(animationDeration);
                        AnimatorSet animatiorSet2 = new AnimatorSet();
                        animatiorSet2.playTogether(animatorX2);
                        animatiorSet2.start();
                        break;
                    case 4:
                        positionNum = 5;
                        ObjectAnimator animatorX3 = ObjectAnimator.ofFloat(farmer, "x", 0f);
                        animatorX3.setDuration(animationDeration);
                        AnimatorSet animatiorSet3 = new AnimatorSet();
                        animatiorSet3.playTogether(animatorX3);
                        animatiorSet3.start();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        positionNum = 8;
                        ObjectAnimator animatorX4 = ObjectAnimator.ofFloat(farmer, "x", 0f);
                        animatorX4.setDuration(animationDeration);
                        AnimatorSet animatiorSet4 = new AnimatorSet();
                        animatiorSet4.playTogether(animatorX4);
                        animatiorSet4.start();
                        break;
                    case 8:
                        break;
                }
                position.setText(String.valueOf(positionNum));
            }
        });

        rightBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (positionNum) {
                    case 0:
                        positionNum = 1;
                        ObjectAnimator animatorX1 = ObjectAnimator.ofFloat(farmer, "x", 820f);
                        animatorX1.setDuration(animationDeration);
                        AnimatorSet animatiorSet1 = new AnimatorSet();
                        animatiorSet1.playTogether(animatorX1);
                        animatiorSet1.start();
                        break;
                    case 1:
                        break;
                    case 2:
                        positionNum = 3;
                        ObjectAnimator animatorX2 = ObjectAnimator.ofFloat(farmer, "x", 820f);
                        animatorX2.setDuration(animationDeration);
                        AnimatorSet animatiorSet2 = new AnimatorSet();
                        animatiorSet2.playTogether(animatorX2);
                        animatiorSet2.start();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        positionNum = 4;
                        ObjectAnimator animatorX3 = ObjectAnimator.ofFloat(farmer, "x", 820f);
                        animatorX3.setDuration(animationDeration);
                        AnimatorSet animatiorSet3 = new AnimatorSet();
                        animatiorSet3.playTogether(animatorX3);
                        animatiorSet3.start();
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        positionNum = 7;
                        ObjectAnimator animatorX4 = ObjectAnimator.ofFloat(farmer, "x", 820f);
                        animatorX4.setDuration(animationDeration);
                        AnimatorSet animatiorSet4 = new AnimatorSet();
                        animatiorSet4.playTogether(animatorX4);
                        animatiorSet4.start();
                        break;
                }
                position.setText(String.valueOf(positionNum));
            }

        });

        //button to take us to puzzle screen
        puzzButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),PuzzleOptionsScreen.class);
                startActivity(intent);
            }
        });
    }

    public static MultipleChoiceQuestion getQuestion(int puzType){
        return quest1;
    }
}