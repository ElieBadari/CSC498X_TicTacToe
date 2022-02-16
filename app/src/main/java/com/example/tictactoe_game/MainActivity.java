package com.example.tictactoe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tic(View view){
        //Toast.makeText(this,"I'm here",Toast.LENGTH_LONG).show(); testing if the onclick for all images is working
        ImageView tic = (ImageView) view;
        tic.setImageResource(R.drawable.yellow);
        tic.setTranslationY(-1500);
        tic.animate().translationYBy(1500).setDuration(600);

    }

}