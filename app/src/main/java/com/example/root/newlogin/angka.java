package com.example.root.newlogin;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class angka extends AppCompatActivity {
    private ImageView imgangka;
    private ImageButton imgnext, imgback;
    private TextView txtangka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        imgangka = findViewById(R.id.imgangka);
        imgnext = findViewById(R.id.imgnext);
        imgback = findViewById(R.id.imgback);
        txtangka = findViewById(R.id.txtjdl);

        imgangka.setImageResource(R.drawable.angka);
        final int[] imageArray = {R.drawable.angka, R.drawable.angka1, R.drawable.angka2};


        imgnext.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View view) {
                imgangka.setImageResource(imageArray[i]);
                i++;
                /*
                final Handler handler = new Handler();
                Runnable runnable = new Runnable() {
                    int i =0;
                    @Override
                    public void run() {
                        imgangka.setImageResource(imageArray[i]);
                        i++;
                        if (i>imageArray.length -1){
                            i=0;
                        }
                        handler.postDelayed(this, 2000);
                    }
                };
                handler.postDelayed(runnable, 2000000000);*/
            }
        });
    }
}