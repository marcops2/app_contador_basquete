package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pont;
    int pontt;
    int ponta = 0;
    int pontb = 0;
    String resultadofinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String mensagem = getString(R.string.mensagem);
        final String mensagemb = getString(R.string.mensagemb);
        final TextView numa0 = (TextView) findViewById(R.id.numa0);
        final TextView numb0 = (TextView) findViewById(R.id.numb0);
        final TextView resultado = (TextView) findViewById(R.id.button_resultado);
        final String empate = getString(R.string.empate);
        final String result = getString(R.string.resultado);

        Button button_3pontos = (Button) findViewById(R.id.button_3pontos);
        Button button_2pontos = (Button) findViewById(R.id.button_2pontos);
        Button button_tirolivre = (Button) findViewById(R.id.button_tirolivre);
        Button button_3pontos3 = (Button) findViewById(R.id.button_3pontos3);
        Button button_2pontos2 = (Button) findViewById(R.id.button_2pontos2);
        Button button_tirolivre2 = (Button) findViewById(R.id.button_tirolivre2);
        Button button_resultado = (Button) findViewById(R.id.button_resultado);
        Button reset = (Button) findViewById(R.id.reset);


        button_3pontos.setOnClickListener(new Button.OnClickListener() {

                                              public void onClick(View a) {
                                                  ponta = ponta + 3;
                                                  pont = ponta;

                                                  numa0.setText(String.valueOf(pont));

                                              }

                                          }

        );

        button_2pontos.setOnClickListener(new Button.OnClickListener() {

                                              public void onClick(View c) {
                                                  ponta = ponta + 2;
                                                  pont = ponta;
                                                  numa0.setText(String.valueOf(pont));
                                              }
                                          }

        );

        button_tirolivre.setOnClickListener(new Button.OnClickListener() {

                                                public void onClick(View d) {
                                                    ponta = ponta + 1;
                                                    pont = ponta;
                                                    numa0.setText(String.valueOf(pont));
                                                }

                                            }


        );

        button_3pontos3.setOnClickListener(new Button.OnClickListener() {


                                               public void onClick(View b) {
                                                   pontb = pontb + 3;
                                                   pontt = pontb;
                                                   numb0.setText(String.valueOf(pontt));
                                               }
                                           }
        );

        button_2pontos2.setOnClickListener(new Button.OnClickListener() {

                                               public void onClick(View e) {
                                                   pontb = pontb + 2;
                                                   pontt = pontb;
                                                   numb0.setText(String.valueOf(pontt));

                                               }

                                           }
        );

        button_tirolivre2.setOnClickListener(new Button.OnClickListener() {
                                                 public void onClick(View f) {
                                                     pontb = pontb + 1;
                                                     pontt = pontb;
                                                     numb0.setText(String.valueOf(pontt));

                                                 }
                                             }

        );

        button_resultado.setOnClickListener(new Button.OnClickListener() {
                                                public void onClick(View g) {


                                                    if (pont > pontt) {

                                                        resultadofinal = mensagem;

                                                    } else if (pont == pontt) {

                                                        resultadofinal = empate;

                                                    } else {

                                                        resultadofinal = mensagemb;

                                                    }
                                                    Intent intent = new Intent(getApplicationContext(), SegundaTela.class);
                                                    Bundle resulfinal = new Bundle();
                                                    resulfinal.putString("resulfinal", resultadofinal);
                                                    intent.putExtras(resulfinal);
                                                    startActivity(intent);

                                                }


                                            }

        );

        reset.setOnClickListener(new Button.OnClickListener() {
                                     public void onClick(View h) {
                                         numa0.setText(String.valueOf(0));
                                         numb0.setText(String.valueOf(0));
                                         resultado.setText(result);
                                         pont = 0;
                                         pontt = 0;
                                         ponta = 0;
                                         pontb = 0;

                                     }

                                 }
        );


    }

}
