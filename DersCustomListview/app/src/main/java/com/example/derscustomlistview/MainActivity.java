package com.example.derscustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView goster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goster = (ListView)findViewById(R.id.listview);

        kisiClass[] kisiler = new kisiClass[] {
                new kisiClass("AYŞE",895,R.drawable.aaaaaaaa),
                new kisiClass("FATMA",9,R.drawable.a),
                new kisiClass("HAYRİYE",69895,R.drawable.b),
                new kisiClass("AHMET",51295,R.drawable.c),

        };

        kisiAdapter adapter=new kisiAdapter(getApplicationContext(),R.layout.customlist,kisiler);
        goster.setAdapter(adapter);
    }
}
