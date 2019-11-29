package com.example.derscustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class kisiAdapter extends ArrayAdapter<kisiClass> {

   private kisiClass [] kisiliste;
   private int resource;

    public kisiAdapter(@NonNull Context context, int resource, @NonNull kisiClass[] kisiliste) {
        super(context, resource, kisiliste);
        this.resource=resource;
        this.kisiliste=kisiliste;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View satir;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        satir=layoutInflater.inflate(resource,null);

        TextView kisiad = (TextView)satir.findViewById(R.id.kisiad);
        TextView kisino = (TextView)satir.findViewById(R.id.kisino);
        ImageView kisifoto = (ImageView)satir.findViewById(R.id.kisifoto);

        kisiClass kisiler = kisiliste[position];
        kisiad.setText(kisiler.getKisiad());
        kisino.setText(String.valueOf(kisiler.getKisino()));
        kisifoto.setImageResource(kisiler.getKisifoto());

        return satir;

    }
}
