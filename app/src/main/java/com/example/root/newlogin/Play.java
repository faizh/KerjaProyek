package com.example.root.newlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Play extends AppCompatActivity {
    //private Button start, exit;
    private ImageButton start, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        start = findViewById(R.id.btn_start);
        exit = findViewById(R.id.btn_exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play.this, MainActivity.class);
                Play.this.startActivity(intent);
                finish();
            }
        });
    }
}
