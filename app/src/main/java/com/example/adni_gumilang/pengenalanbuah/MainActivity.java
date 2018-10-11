package com.example.adni_gumilang.pengenalanbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Object LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt_tebak_buah(View view) {
        Toast.makeText(MainActivity.this, "Game Mengenal Buah", Toast.LENGTH_SHORT).show();
    }

    public void btn_alpukat(View view) {
        Intent apk = new Intent(MainActivity.this, ActivityAlpukat.class);
        startActivity(apk);
    }

    public void btn_apel(View view) {
        Intent apl = new Intent(MainActivity.this, activity_apel.class);
        startActivity(apl);
    }

    public void btn_jeruk(View view) {
        Intent jrk = new Intent(MainActivity.this, activity_jeruk.class);
        startActivity(jrk);
    }
    public void btn_anggur(View view) {
        Intent agr = new Intent(MainActivity.this, activity_anggur.class);
        startActivity(agr);
    }
}





