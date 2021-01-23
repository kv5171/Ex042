package com.example.ex042;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ex042.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageView iV;
    Random rnd;
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        iV = (ImageView) findViewById(R.id.iV);

        rnd  = new Random();
    }

    public void makeRandom(View view) {
        randomNumber = rnd.nextInt(3) + 1;

        switch (randomNumber)
        {
            case 1:
                iV.setImageResource(R.drawable.one);
                imageButton.setImageResource(R.drawable.one);
                break;
            case 2:
                iV.setImageResource(R.drawable.two);
                imageButton.setImageResource(R.drawable.two);
                break;
            case 3:
                iV.setImageResource(R.drawable.three);
                imageButton.setImageResource(R.drawable.three);
                break;
        }
    }
}