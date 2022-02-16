package com.example.tictactoe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int player = 0;//0 is for the red player, 1 for yellow player

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tic(View view){
        //Toast.makeText(this,"I'm here",Toast.LENGTH_LONG).show(); testing if the onclick for all images is working

        ImageView tic = (ImageView) view;
        tic.setTranslationY(-1500);


        if(player == 0){
            tic.setImageResource(R.drawable.red);
            player = 1;
        }
        else{
            tic.setImageResource(R.drawable.yellow);
            player = 0;
        }

        tic.animate().translationYBy(1500).rotation(360*10).setDuration(600);

    }

}