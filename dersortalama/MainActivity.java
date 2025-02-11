package com.example.dersortalama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etDersAdi,etNot1,etNot2;
    Button btnEkle;
    ListView lvDersler;

    ArrayList<String> dersListesi;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDersAdi=findViewById(R.id.et_dersAdi);
        etNot1=findViewById(R.id.et_not1);
        etNot2=findViewById(R.id.et_not2);
        btnEkle=findViewById(R.id.btn_ekle);
        lvDersler=findViewById(R.id.lv_dersler);

        dersListesi=new ArrayList<>();
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dersListesi);
        lvDersler.setAdapter(adapter);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dersAdi=etDersAdi.getText().toString();
                int yazili1=Integer.parseInt(etNot1.getText().toString());
                int yazili2=Integer.parseInt(etNot2.getText().toString());

                Ders ders=new Ders(dersAdi,yazili1,yazili2);

                double ortalama=ders.getOrtalama();
                String durum=ders.getDurum();

                String bilgi=ders.dersBilgi();
                dersListesi.add(bilgi);
                adapter.notifyDataSetChanged();

                //Toast.makeText(MainActivity.this, "Ortalama: "+ortalama, Toast.LENGTH_SHORT).show();

                temizle();


            }
        });




    }

    private void temizle() {
        etDersAdi.setText("");
        etNot1.setText("");
        etNot2.setText("");
    }
}