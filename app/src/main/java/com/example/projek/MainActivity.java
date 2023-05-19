package com.example.projek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cvdada;
    CardView cvkardio;
    CardView cvkaki;
    CardView cvperut;
    CardView cvback;
    CardView cvtangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvdada = (CardView) findViewById(R.id.cvdada);
        cvdada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,dada.class );
                startActivity(intent);
            }
        });

        cvkardio = (CardView) findViewById(R.id.cvkardio);
        cvkardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,kardio.class );
                startActivity(intent);
            }
        });

        cvkaki = (CardView) findViewById(R.id.cvkaki);
        cvkaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,dada.class );
                startActivity(intent);
            }
        });

        cvperut = (CardView) findViewById(R.id.cvperut);
        cvperut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,dada.class );
                startActivity(intent);
            }
        });

        cvback = (CardView) findViewById(R.id.cvback);
        cvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,dada.class );
                startActivity(intent);
            }
        });

        cvtangan = (CardView) findViewById(R.id.cvtangan);
        cvtangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,dada.class );
                startActivity(intent);
            }
        });

    }
}