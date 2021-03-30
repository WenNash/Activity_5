package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.NomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        switch (nama)
        {
            case "Adan":
                tvnama.setText("Adana S");
                tvnomor.setText("081327679253");
                break;
            case "Toni":
                tvnama.setText("Taufik Fatoni");
                tvnomor.setText("082250269747");
                break;
            case "Nopal":
                tvnama.setText("Nopal D");
                tvnomor.setText("082288416394");
                break;
            case "Wean":
                tvnama.setText("Wean N");
                tvnomor.setText("082293118119");
                break;
            case "Whildan":
                tvnama.setText("Whildan F");
                tvnomor.setText("085779401007");
                break;
            case "Maulana":
                tvnama.setText("Maulana J");
                tvnomor.setText("081657478698");
                break;
            case "Annisa":
                tvnama.setText("Annisa F");
                tvnomor.setText("089373112320");
                break;
            case "Intan":
                tvnama.setText("Intan P");
                tvnomor.setText("0897648765983");
                break;
            case "Damar":
                tvnama.setText("Damar S");
                tvnomor.setText("081289273467");
                break;
            case "Dahlan":
                tvnama.setText("Dahlan F");
                tvnomor.setText("085701373339");
                break;

        }
    }
}