package com.games.m1nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnGuess, btnTentativi, btnBack;
    Button btnRandom;
    TextView tvInput1, tvInput2, tvInput3, tvInput4, tvTentativi, tvNumeroInserito, tvControllo;
    RelativeLayout buttons_layout, errormessage_layout;
    LinearLayout tentativi_layout;
    ImageView iwPallino1, iwPallino2, iwPallino3, iwPallino4;
    ConstraintLayout esito_layout;


    int[] casuali = new int[4];
    int[] utente = new int[4];
    int[] confronto = new int[4];
    int cont, i, cont1, occupati = 0;
    int presente = 0;
    int giusto = 0;
    int pallini = 0;
    boolean trovato = false;

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
        tvTentativi = findViewById(R.id.tvTentativi); // casella di testo dove compaiono i tentativi_layout
        buttons_layout = findViewById(R.id.buttons); //layout dei bottoni
        tentativi_layout = findViewById(R.id.tentativi); //layout dei tentativi_layout
        errormessage_layout = findViewById(R.id.errormessage); //layout dell'errore riguardo all'inserire 4 cifre
        esito_layout = findViewById(R.id.esito_layout); //layout dell'esito
        tvNumeroInserito = findViewById(R.id.tvNumeroInserito); // casella di testo dove esce fuori il numero scritto dall'utente
        tvControllo = findViewById(R.id.tvControllo);   //casella di testo dove ti dice quanti ne hai azzeccati
        iwPallino1 = findViewById(R.id.iwPallino1); // per visualizzare pallini che indicano quante cifre azzeccate
        iwPallino2 = findViewById(R.id.iwPallino2);
        iwPallino3 = findViewById(R.id.iwPallino3);
        iwPallino4 = findViewById(R.id.iwPallino4);


        // Genero numero casuale
        final Random rand = new Random();
        for(cont=0;cont<4;cont++){
            casuali[cont]=rand.nextInt(10);
            for(i=0;i<cont;i++){
                if(casuali[i]==casuali[cont]){
                    cont--;
                }
            }
        }


        //Clear la casella dei numeri
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                occupati=0;
                presente = 0;
                giusto = 0;
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


         btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
                presente = 0;
                giusto = 0;
                pallini = 0;
                iwPallino1.setImageResource(android.R.color.transparent);
                iwPallino2.setImageResource(android.R.color.transparent);
                iwPallino3.setImageResource(android.R.color.transparent);
                iwPallino4.setImageResource(android.R.color.transparent);

                //se non si inseriscono 4 cifre, viene visualizzato messaggio di errore
                if(occupati!=4 && buttons_layout.getVisibility() == View.VISIBLE){
                    buttons_layout.setVisibility(View.INVISIBLE);
                    esito_layout.setVisibility(View.INVISIBLE);
                    btnGuess.setVisibility(View.INVISIBLE);
                    btnTentativi.setVisibility(View.INVISIBLE);
                    errormessage_layout.setVisibility(View.VISIBLE);
                    errormessage_layout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            errormessage_layout.setVisibility(View.GONE);
                            btnTentativi.setVisibility(View.VISIBLE);
                            btnGuess.setVisibility(View.VISIBLE);
                            buttons_layout.setVisibility(View.VISIBLE);
                        }
                    }, 1500);

                }
                if(buttons_layout.getVisibility() == View.GONE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    esito_layout.setVisibility(View.GONE);
                    buttons_layout.setVisibility(View.VISIBLE);
                }
                else if(occupati == 4) {
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);


                    utente[0] = Integer.parseInt(tvInput1.getText().toString());
                    utente[1] = Integer.parseInt(tvInput2.getText().toString());
                    utente[2] = Integer.parseInt(tvInput3.getText().toString());
                    utente[3] = Integer.parseInt(tvInput4.getText().toString());

                    //confronta l'array utente e l'array casuali generato all'inizio
                    //se il numero è nel posto giusto il corrispondente in confronto viene messo a 2 altrimenti a 0
                    for(cont=0;cont<4;cont++){
                        if(utente[cont]==casuali[cont]){
                            confronto[cont]=2;
                        }
                        else{
                            confronto[cont]=0;
                        }
                    }
                    //qui riempie con 1 confronto se il numero è nel posto sbagliato
                    for(cont1=0;cont1<4;cont1++){
                        trovato=false;
                        if(confronto[cont1]!=2){
                            cont=0;
                            do{
                                if(utente[cont1]==casuali[cont]){
                                    confronto[cont]=1;
                                    trovato=true;
                                }
                                cont++;
                            }while((cont<4)&&(!trovato));
                        }
                    }
                    //conta quanti sono al posto giusto e al posto sbagliato
                    for(cont=0;cont<4;cont++){

                        switch(confronto[cont]){
                            case 1:
                                presente++;
                                break;
                            case 2:
                                giusto++;
                                break;
                            default:
                                break;
                        }
                    }

                    if(giusto==4){
                        //qui il gioco deve finire o deve uscire un schermata per una nuova partita
                        tvControllo.setText("Hai vinto!");
                    }
                    else{
                        //qui viene detto a parole ma possiamo fargli inserire pallini pieni e vuoti come nel gioco classico
                        tvControllo.setText("");
                        tvControllo.append(""+presente+" numeri al posto sbagliato e "+giusto+" numeri al posto giusto");

                        switch (giusto){
                            case 1:
                                iwPallino1.setImageResource(R.drawable.pallino_full);
                                break;

                            case 2:
                                iwPallino1.setImageResource(R.drawable.pallino_full);
                                iwPallino2.setImageResource(R.drawable.pallino_full);
                                break;

                            case 3:
                                iwPallino1.setImageResource(R.drawable.pallino_full);
                                iwPallino2.setImageResource(R.drawable.pallino_full);
                                iwPallino3.setImageResource(R.drawable.pallino_full);
                                break;
                        }

                        switch (presente){
                            case 1:
                                if (giusto == 0){
                                    iwPallino1.setImageResource(R.drawable.pallino_empty);
                                }
                                if (giusto == 1){
                                    iwPallino2.setImageResource(R.drawable.pallino_empty);
                                }
                                if (giusto == 2){
                                    iwPallino3.setImageResource(R.drawable.pallino_empty);
                                }
                                break;

                            case 2:
                                if (giusto == 0){
                                    iwPallino1.setImageResource(R.drawable.pallino_empty);
                                    iwPallino2.setImageResource(R.drawable.pallino_empty);
                                }
                                if (giusto == 1){
                                    iwPallino2.setImageResource(R.drawable.pallino_empty);
                                    iwPallino3.setImageResource(R.drawable.pallino_empty);
                                }
                                if (giusto == 2){
                                    iwPallino3.setImageResource(R.drawable.pallino_empty);
                                    iwPallino4.setImageResource(R.drawable.pallino_empty);
                                }
                                break;

                            case 3:
                                if (giusto == 1){
                                    iwPallino2.setImageResource(R.drawable.pallino_empty);
                                    iwPallino3.setImageResource(R.drawable.pallino_empty);
                                    iwPallino4.setImageResource(R.drawable.pallino_empty);
                                }
                                break;
                        }

                    }

                    buttons_layout.setVisibility(View.GONE);
                    esito_layout.setVisibility(View.VISIBLE);

                    tvNumeroInserito.setText(tvInput1.getText());
                    tvNumeroInserito.append(tvInput2.getText());
                    tvNumeroInserito.append(tvInput3.getText());
                    tvNumeroInserito.append(tvInput4.getText());

                    tvTentativi.append(("\n"));
                    tvTentativi.append(tvNumeroInserito.getText());
                    tvTentativi.append(("\n"));
                    tvTentativi.append(tvControllo.getText());

                    tvInput1.setText("_");
                    tvInput2.setText("_");
                    tvInput3.setText("_");
                    tvInput4.setText("_");
                    occupati = 0;
                }

            }
        });


 // per visualizzare i tentativi_layout che si sono fatti
        btnTentativi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(buttons_layout.getVisibility() == View.GONE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    buttons_layout.setVisibility(View.VISIBLE);
                    tentativi_layout.setVisibility(View.INVISIBLE);
                    esito_layout.setVisibility(View.INVISIBLE);
                }

                else if(buttons_layout.getVisibility() == View.VISIBLE){
                    btnGuess.setVisibility(View.GONE);
                    btnTentativi.setVisibility(View.GONE);
                    btnBack.setVisibility(View.VISIBLE);
                    buttons_layout.setVisibility(View.GONE);
                    esito_layout.setVisibility(View.INVISIBLE);
                    tentativi_layout.setVisibility(View.VISIBLE);


                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGuess.setVisibility(View.VISIBLE);
                btnTentativi.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.GONE);
                buttons_layout.setVisibility(View.VISIBLE);
                esito_layout.setVisibility(View.INVISIBLE);
                tentativi_layout.setVisibility(View.INVISIBLE);

            }
        });
    }
}

