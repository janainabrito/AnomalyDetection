package com.example.janana.anomalydetection;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnPadrao;
    Button btnCPU;
    Button btnDisplay;
    Button btnGPU;
    Button btnGPS;
    Button btnMemory;
    Button btnWifi;
    Button btn3G;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPadrao = (Button) findViewById(R.id.btnPadrao);
        btnCPU = (Button) findViewById(R.id.btnCPU);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);
        btnGPU = (Button) findViewById(R.id.btnGPU);
        btnGPS = (Button) findViewById(R.id.btnGPS);
        btnMemory = (Button) findViewById(R.id.btnMemory);
        btnWifi = (Button) findViewById(R.id.btnWifi);
        btn3G = (Button) findViewById(R.id.btn3G);

    }

    public void mostrarPadrao(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Execução padrão");
        AlertDialog.setMessage("Aplicação executando no modo padrão");
        AlertDialog.show();

    }

    public void alteraCPU(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando CPU");
        AlertDialog.setMessage("Aplicação executando alteração na CPU");
        AlertDialog.show();

    }

    public void alteraDisplay(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando Display");
        AlertDialog.setMessage("Aplicação executando alteração no Display");
        AlertDialog.show();

    }

    public void alteraGPU(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando GPU");
        AlertDialog.setMessage("Aplicação executando alteração na GPU");
        AlertDialog.show();

    }

    public void alteraGPS(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando GPS");
        AlertDialog.setMessage("Aplicação executando alteração no GPS");
        AlertDialog.show();

    }

    public void alteraMemoryUsage(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando Memory Usage");
        AlertDialog.setMessage("Aplicação executando alteração no Memory Usage");
        AlertDialog.show();

    }

    public void alteraWifi(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando Wifi");
        AlertDialog.setMessage("Aplicação executando alteração no Wifi");
        AlertDialog.show();

    }

    public void altera3G(View view) {

        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Alterando 3G");
        AlertDialog.setMessage("Aplicação executando alteração no 3G");
        AlertDialog.show();

    }

}
