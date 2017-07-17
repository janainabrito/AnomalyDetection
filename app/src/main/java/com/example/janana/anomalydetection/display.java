package com.example.janana.anomalydetection;

import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class display extends AppCompatActivity {

    SeekBar lightBar;
    Context context;
    int SBrightness;
    private TextView[] txtnum;
    private Handler handler = new Handler();
    int loop=0,n;
    int qtd = 1000; //qtd entradas
    private int []numbers = {9,3,7,2,1};
    private int []array =  new int[qtd];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        txtnum = new TextView[numbers.length];
        txtnum[0] = (TextView) findViewById(R.id.txtnum1);
        txtnum[1] = (TextView) findViewById(R.id.txtnum2);
        txtnum[2] = (TextView) findViewById(R.id.txtnum3);
        txtnum[3] = (TextView) findViewById(R.id.txtnum4);
        txtnum[4] = (TextView) findViewById(R.id.txtnum5);

        for (int i = 0; i < numbers.length; i++) {
            txtnum[i].setText(String.valueOf(numbers[i]));
        }

        ((TextView) findViewById(R.id.ssort)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertionsort();
                array = generateArray();
                insertionSort(array);
            }
        });

        lightBar = (SeekBar) findViewById(R.id.seekBarDisplay);
        context = getApplicationContext();

        SBrightness = Settings.System.getInt(context.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, 0);

        lightBar.setProgress(SBrightness);
        lightBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Settings.System.getInt(context.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void insertionsort(){
        animateInsertion(1);
    }

    public void animateInsertion(final int m){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(m!=n){
                    String temp = txtnum[m].getText().toString();
                    for(int k=m;k>n;k--){
                        txtnum[k].setText(txtnum[k-1].getText().toString());
                    }
                    txtnum[n].setText(temp);
                }
                txtnum[m].setBackgroundResource(R.drawable.circle_shape_blue);
                txtnum[n].setBackgroundResource(R.drawable.circle_shape_blue);

                int i=m+1;
                if(i<numbers.length) {
                    animateInsertion(i);
                }
            }
        },3000);

        txtnum[m].setBackgroundResource(R.drawable.circle_shape_blue);

        n = findInsertMin(m);
        Log.e("n ",""+n);
        txtnum[n].setBackgroundResource(R.drawable.circle_shape_blue);
    }

    public void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public int[] generateArray() {
        array = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            array[i] =  (int)(Math.random() * qtd);
        }
        return array;
    }

    int findInsertMin(int v){
        int mi=v;
        for(int k=0;k<=mi;k++) {
            if (Integer.valueOf(txtnum[k].getText().toString()) > Integer.valueOf(txtnum[mi].getText().toString())) {
                mi = k;
            }
        }
        return mi;
    }
}
