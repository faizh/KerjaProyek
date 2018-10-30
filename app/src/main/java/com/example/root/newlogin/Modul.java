package com.example.root.newlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Modul extends AppCompatActivity {
    //private Button angka, huruf, buah, hewan, warna, bentuk;
    private ImageButton angka, huruf, buah, hewan, warna, bentuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);

        angka = findViewById(R.id.btn_angka);
        huruf = findViewById(R.id.btn_huruf);
        buah = findViewById(R.id.btn_buah);
        hewan = findViewById(R.id.btn_hewan);
        warna = findViewById(R.id.btn_warna);
        bentuk = findViewById(R.id.btn_bentuk);

        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, angka.class);
                Modul.this.startActivity(intent);
            }
        });

        huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, huruf.class);
                Modul.this.startActivity(intent);
            }
        });

        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, buah.class);
                Modul.this.startActivity(intent);
            }
        });

        hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, hewan.class);
                Modul.this.startActivity(intent);
            }
        });

        huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, huruf.class);
                Modul.this.startActivity(intent);
            }
        });

        warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, warna.class);
                Modul.this.startActivity(intent);
            }
        });

        bentuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modul.this, bentuk.class);
                Modul.this.startActivity(intent);
            }
        });

    }


}
