package com.example.diceroll;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button);
    }

    private void rollDice() {
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();
        ImageView diceImage = findViewById(R.id.imageView);
        int drawableResource;
        if(diceRoll==1){
            drawableResource = R.drawable.dice_1;
        }else if(diceRoll==2){
            drawableResource = R.drawable.dice_2;
        }else if(diceRoll==3){
            drawableResource = R.drawable.dice_3;
        }else if(diceRoll==4){
            drawableResource = R.drawable.dice_4;
        }else if(diceRoll==5){
            drawableResource = R.drawable.dice_5;
        }else {
            drawableResource = R.drawable.dice_6;
        }

    }

}

public class Dice {
    int numSides;

    public Dice(int numSides){
        this.numSides = numSides;
    }

    public int roll(){
        return (int) (Math.random()*numSides+1);
    }
}