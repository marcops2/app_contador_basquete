package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Button voltar = (Button) findViewById(R.id.voltar);
        Intent intent = getIntent();
        Bundle resulfinal = intent.getExtras();
        String MsgAlerta = resulfinal.getString("resulfinal");

        AlertDialog.Builder alerta = new AlertDialog.Builder(SegundaTela.this);
        alerta
                .setTitle(getString(R.string.TitleResult))
                .setMessage(MsgAlerta)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        AlertDialog alertDialog = alerta.create();
        alertDialog.show();

        voltar.setOnClickListener(new Button.OnClickListener() {

                                      public void onClick(View i) {
                                          Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                                          startActivity(intent2);
                                      }
                                  }

        );

    }
}
