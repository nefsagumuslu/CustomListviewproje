package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity4 extends AppCompatActivity {
    TextView ogrencigiristext, ogrencigiristc, ogrencigirissifre;
    Button button, button3, button4;
    ImageView imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);

        ogrencigiristext=findViewById(R.id.ogrencigiristext);
        ogrencigiristc=findViewById(R.id.ogrencigiristc);
        ogrencigirissifre=findViewById(R.id.ogrencigirissifre);
        button=findViewById(R.id.button);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        imageViews=findViewById(R.id.imageViews);

    }
}
