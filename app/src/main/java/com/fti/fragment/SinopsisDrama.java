package com.fti.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SinopsisDrama extends AppCompatActivity {

    ImageView ivposter;
    TextView tvjudul, tvsinopsis;

    String judul, sinopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis_drama);

        ivposter = findViewById(R.id.poster);
        tvjudul = findViewById(R.id.judul);
        tvsinopsis = findViewById(R.id.ringkasan);

        judul = getIntent().getStringExtra("Judul");
        sinopsis = getIntent().getStringExtra("Sinopis");

        tvjudul.setText(judul);
        tvsinopsis.setText(sinopsis);
        Glide.with(this).load(getIntent().getIntExtra("Poster",0)).into(ivposter);
    }
}