package com.example.adni_gumilang.pengenalanbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

class activity_jeruk extends AppCompatActivity {
    EditText editTextJeruk;
    Button bt_proses;
    TextView hasil;
    String benar = "jeruk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeruk);

        editTextJeruk = (EditText)findViewById(R.id.edt_buah_jeruk);
        bt_proses = (Button)findViewById(R.id.bt_proses_jeruk);
        hasil = (TextView)findViewById(R.id.hasil_jeruk);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextJeruk.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextJeruk.getText().toString(); //mengambil nilai dari editTextAlpukat
                    if (jawaban.equals(benar)){ // membandingkat masukan dengan ketentuan benar  ".equals()" membandingkan nilai String yang tersimpan.
                        String keterangan = "Anda benar";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }
}


