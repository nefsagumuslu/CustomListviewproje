package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {

    TextView textogretmen, textogrtc, textogrsifre;
    Button ogretmentcbuton,ogretmensifrebuton, ogretmengirisb;
    ImageView prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        textogretmen=findViewById(R.id.textogretmen);
        textogrtc=findViewById(R.id.textogrtc);
        textogrsifre=findViewById(R.id.textogrsifre);
        ogretmentcbuton=findViewById(R.id.ogretmentcbuton);
        ogretmensifrebuton=findViewById(R.id.ogretmensifrebuton);
        ogretmengirisb=findViewById(R.id.ogretmengirisb);
        prof=findViewById(R.id.prof);
    }
}
