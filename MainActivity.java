package com.example.gow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button button1;
    private Button button2;

    private Button button3;

    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.buttonInfo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2 = findViewById(R.id.buttonPersonage);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button3 = findViewById(R.id.buttonitens);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        button4 = findViewById(R.id.buttonMensagem);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, HistoriaActivity.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, ActivityPersonagem.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, ActivityArmas.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, ActivityMensagem.class);
        startActivity(intent);
    }
}