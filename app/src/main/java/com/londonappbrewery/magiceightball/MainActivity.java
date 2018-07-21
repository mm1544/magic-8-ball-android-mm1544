package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton;
        myButton = (Button) findViewById(R.id.askButton);

        final ImageView ballImage = (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballsArray = {R.drawable.ball1,
                                    R.drawable.ball2,
                                    R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randNumGenerator = new Random();

                int ballNumber = randNumGenerator.nextInt(5);

                ballImage.setImageResource(ballsArray[ballNumber]);

            }
        });




    }

}
