package com.gmail.cristobalhdez.android_semana1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listado = (ListView) this.findViewById(R.id.puppyList);
        String[] mascotas = {"Rocky", "Rambo","Deysi","Coco"};
        listado.setAdapter(new puppyAdapter(this, mascotas));

    }
}
