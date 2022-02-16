package com.example.tictactoe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int player = 0;//0 is for the red player, 1 for yellow player
    int[] game_state = {-1,-1,-1,-1,-1,-1,-1,-1,-1,}; //-1 for empty state
    int[][] winning_states = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6},{0,3,6},{1,4,7},{2,5,8}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tic(View view){
        //Toast.makeText(this,"I'm here",Toast.LENGTH_LONG).show(); testing if the onclick for all images is working

        ImageView tic = (ImageView) view;
        tic.setTranslationY(-1500);

        Log.i("Tag", tic.getTag().toString());
        int tic_tag = Integer.parseInt(tic.getTag().toString());
        game_state[tic_tag] = player;

        if(player == 0){
            tic.setImageResource(R.drawable.red);
            player = 1;
        }
        else{
            tic.setImageResource(R.drawable.yellow);
            player = 0;
        }

        tic.animate().translationYBy(1500).rotation(360*10).setDuration(600);

        for(int[] winning_state : winning_states){ //for each loop
            if (game_state[winning_state[0]] == game_state[winning_state[1]] && game_state[winning_state[1]] == game_state[winning_state[2]] && game_state[winning_state[0]] != -1 ){
                if(player == 1){
                    Toast.makeText(this, "Red has won", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this, "Yellow has won", Toast.LENGTH_LONG).show();
                }
            }
        }

    }

}