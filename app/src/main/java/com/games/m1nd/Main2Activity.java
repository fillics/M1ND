package com.games.m1nd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnGuess, btnTentativi, btnBack;
    Button btnRandom;
    TextView tvInput1, tvInput2, tvInput3, tvInput4, tvTentativi, tvNumeroInserito, tvControllo;
    RelativeLayout buttons, errormessage, esito_layout;
    LinearLayout risultati;


    int[] casuali = new int[4];
    int[] utente = new int[4];
    int cont, i, occupati = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnGuess = findViewById(R.id.btnGuess);
        btnClear = findViewById(R.id.btnClear);
        btnRandom = findViewById(R.id.btnRandom);
        btnTentativi = findViewById(R.id.btnTentativi);
        btnBack = findViewById(R.id.btnBack);
        tvInput1 = findViewById(R.id.tvInput1); // casella di testo dove compare il numero inserito da tastiera
        tvInput2 = findViewById(R.id.tvInput2);
        tvInput3 = findViewById(R.id.tvInput3);
        tvInput4 = findViewById(R.id.tvInput4);
        tvTentativi = findViewById(R.id.tvTentativi); // casella di testo dove compaiono i tentativi
        buttons = findViewById(R.id.buttons); //layout dei bottoni
        risultati = findViewById(R.id.risultati); //layout dei tentativi, che dovrei chiamare "tentativi" al posto di "risultati"
        errormessage = findViewById(R.id.errormessage); //layout dell'errore riguardo all'inserire 4 cifre
        esito_layout = findViewById(R.id.esito_layout); //layout dell'esito
        tvNumeroInserito = findViewById(R.id.tvNumeroInserito); // casella di testo dove esce fuori il numero scritto dall'utente
        tvControllo = findViewById(R.id.tvControllo);   //casella di testo dove ti dice quanti ne hai azzeccati


        //Clear la casella dei numeri
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                occupati=0;
                tvInput1.setText("_");
                tvInput2.setText("_");
                tvInput3.setText("_");
                tvInput4.setText("_");
            }
        });


        //Premo il bottone dei numeri e il numero corrispondente viene scritto nella casella di testo
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("0");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("0");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("0");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("0");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("1");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("1");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("1");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("1");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("2");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("2");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("2");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("2");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("3");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("3");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("3");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("3");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("4");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("4");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("4");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("4");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("5");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("5");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("5");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("5");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("6");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("6");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("6");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("6");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("7");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("7");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("7");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("7");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("8");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("8");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("8");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("8");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(occupati){
                    case 0:
                        tvInput1.setText("");
                        tvInput1.setText("9");
                        occupati++;
                        break;
                    case 1:
                        tvInput2.setText("");
                        tvInput2.setText("9");
                        occupati++;
                        break;
                    case 2:
                        tvInput3.setText("");
                        tvInput3.setText("9");
                        occupati++;
                        break;
                    case 3:
                        tvInput4.setText("");
                        tvInput4.setText("9");
                        occupati++;
                        break;
                    default:
                        break;
                }
            }
        });

        // Genero numero casuale
        final Random rand = new Random();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(cont=0;cont<4;cont++){
                    casuali[cont]=rand.nextInt(10);
                    for(i=0;i<cont;i++){
                        if(casuali[i]==casuali[cont]){
                            cont--;
                        }
                    }
                }
                btnRandom.setText("Numero Casuale Generato");
                btnRandom.setClickable(false);

                //per visualizzare il numero generato casuale da indovinare
                //tvInput1.setText(String.valueOf(casuali[0]));
                //tvInput2.setText(String.valueOf(casuali[1]));
                //tvInput3.setText(String.valueOf(casuali[2]));
                //tvInput4.setText(String.valueOf(casuali[3]));

            }
        });


        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se non si inseriscono 4 cifre, viene visualizzato messaggio di errore
                if(occupati!=4 && buttons.getVisibility() == View.VISIBLE){
                    buttons.setVisibility(View.INVISIBLE);
                    esito_layout.setVisibility(View.INVISIBLE);
                    btnGuess.setVisibility(View.INVISIBLE);
                    btnTentativi.setVisibility(View.INVISIBLE);
                    errormessage.setVisibility(View.VISIBLE);
                    errormessage.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            errormessage.setVisibility(View.GONE);
                            btnTentativi.setVisibility(View.VISIBLE);
                            btnGuess.setVisibility(View.VISIBLE);
                            buttons.setVisibility(View.VISIBLE);
                        }
                    }, 1500);

                }
                if(buttons.getVisibility() == View.GONE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    esito_layout.setVisibility(View.GONE);
                    buttons.setVisibility(View.VISIBLE);
                }
                else if(occupati == 4) {
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);

                    buttons.setVisibility(View.GONE);
                    esito_layout.setVisibility(View.VISIBLE);

                    tvNumeroInserito.setText(tvInput1.getText());
                    tvNumeroInserito.append(tvInput2.getText());
                    tvNumeroInserito.append(tvInput3.getText());
                    tvNumeroInserito.append(tvInput4.getText());
                }
            }
        });

 // per visualizzare i tentativi che si sono fatti

        btnTentativi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttons.getVisibility() == View.GONE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    buttons.setVisibility(View.VISIBLE);
                    risultati.setVisibility(View.INVISIBLE);
                    esito_layout.setVisibility(View.INVISIBLE);
                }

                else if(buttons.getVisibility() == View.VISIBLE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    buttons.setVisibility(View.GONE);
                    esito_layout.setVisibility(View.INVISIBLE);
                    risultati.setVisibility(View.VISIBLE);
                    tvTentativi.setText(tvInput1.getText());
                    tvTentativi.append(tvInput2.getText());
                    tvTentativi.append(tvInput3.getText());
                    tvTentativi.append(tvInput4.getText());
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGuess.setVisibility(View.VISIBLE);
                btnTentativi.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.GONE);
                buttons.setVisibility(View.VISIBLE);
                esito_layout.setVisibility(View.INVISIBLE);
                risultati.setVisibility(View.INVISIBLE);
                //ciao

            }
        });
    }
}

