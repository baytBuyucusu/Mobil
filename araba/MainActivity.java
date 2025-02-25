package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnCalistir,btnHizlan,btnYavasla,btnDurdur;
    private TextView tvDurum;
    private Araba araba;
    String durum =""; //Global olarak Tanımladık.Durum Bilgisinde Kulanıcaz.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        araba=new Araba(315,"Mersedes Benz","G-Serisi");
        durum="Durum:\n"+"Marka: "+araba.getMarka()+"\n"+"Model: "+araba.getModel()+"\n"+"Son Hız: "+araba.getSonHiz()+" km/h \n";

        btnCalistir=findViewById(R.id.btn_calistir);
        btnDurdur=findViewById(R.id.btn_durdur);
        btnHizlan=findViewById(R.id.btn_hizlan);
        btnYavasla=findViewById(R.id.btn_yavasla);
        tvDurum=findViewById(R.id.tv_durum);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDurum.setText(durum+araba.calistir());

            }

        });
        btnDurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnHizlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.hizlan(10);// parametre olarak verdiğimiz değer kadar hız artar.
                tvDurum.setText(durum+"Arabanın Hızı: "+araba.getAnlikHiz()+" km/h");
            }
        });

        btnYavasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.yavasla(10);
                tvDurum.setText(durum+"Arabanın Hızı: "+araba.getAnlikHiz()+" km/h");
            }
        });



    }
}