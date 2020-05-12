package com.games.m1nd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nuova_partita, partite_recenti, impostazioni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nuova_partita = findViewById(R.id.nuovapartita_btn);
        partite_recenti = findViewById(R.id.partiterecenti_btn);
        impostazioni = findViewById(R.id.impostazioni_btn);



        // Bottone per iniziare nuova partita
        nuova_partita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });


        // Bottone per visualizzare le partite recenti
        partite_recenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PartiteRecentiActivity.class);
                startActivity(intent);

            }
        });

        // Bottone per visualizzare impostazioni
        impostazioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImpostazioniActivity.class);
                startActivity(intent);

            }
        });




    }

    }
