package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickA=(Button)findViewById(R.id.buttonA);
        Button clickB=(Button)findViewById(R.id.buttonB);
        Button clickC=(Button)findViewById(R.id.buttonC);
        Button clickD=(Button)findViewById(R.id.buttonD);
        Button clickE=(Button)findViewById(R.id.buttonE);
        Button clickF=(Button)findViewById(R.id.buttonF);

        final MediaPlayer letterA= MediaPlayer.create(getApplicationContext(), R.raw.a);
        final MediaPlayer letterB=MediaPlayer.create(getApplicationContext(), R.raw.b);
        final MediaPlayer letterC=MediaPlayer.create(getApplicationContext(), R.raw.c);
        final MediaPlayer letterD=MediaPlayer.create(getApplicationContext(), R.raw.d);
        final MediaPlayer letterE=MediaPlayer.create(getApplicationContext(), R.raw.e);
        final MediaPlayer letterF=MediaPlayer.create(getApplicationContext(), R.raw.f);

        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.buttonA:
                        letterA.start();
                        break;
                    case R.id.buttonB:
                        letterB.start();
                        break;
                    case R.id.buttonC:
                        letterC.start();
                        break;
                    case R.id.buttonD:
                        letterD.start();
                        break;
                    case R.id.buttonE:
                        letterE.start();
                        break;
                    case R.id.buttonF:
                        letterF.start();
                        break;
                }
            }
        };

        clickA.setOnClickListener(elem);
        clickB.setOnClickListener(elem);
        clickC.setOnClickListener(elem);
        clickD.setOnClickListener(elem);
        clickE.setOnClickListener(elem);
        clickF.setOnClickListener(elem);


    }
}
