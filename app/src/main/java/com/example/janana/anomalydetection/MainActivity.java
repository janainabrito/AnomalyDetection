package com.example.janana.anomalydetection;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnPadrao;
    Button btnDisplay;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPadrao = (Button) findViewById(R.id.btnPadrao);

        alteraDisplay();
    }

    public void mostrarPadrao(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Execução padrão");
        AlertDialog.setMessage("Aplicação executando no modo padrão");
        AlertDialog.show();

    }

    public void alteraDisplay() {
        btnDisplay = (Button) findViewById(R.id.btnDisplay);
        btnDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,display.class);
                startActivity(toy);
            }
        });
    }


}
