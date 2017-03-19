package com.example.lenovo_lap.a1st;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView mytextView = (TextView) findViewById(R.id.textView);
                ImageView myimageView = (ImageView) findViewById(R.id.photo_image_view);
                mytextView.setText("An image (^_^) ");
                myimageView.setImageResource(R.drawable.kba);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,TadaActivity.class);
                startActivity(i);
                            }
        });
    }
}