package com.papps.goservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tentang_aplikasi extends AppCompatActivity {

    private ImageView alamat,kewa,keweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_tentang_aplikasi);

        initView();
        keurlalamat();
        keurlwa();
        keurlweb();
    }

    private void keurlalamat() {
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlalamat = "https://goo.gl/maps/RjDVa8nro8YufSGu7";
                Uri urialamat = Uri.parse(urlalamat);
                startActivity(new Intent(Intent.ACTION_VIEW, urialamat));
            }
        });
    }

    private void keurlwa() {
        kewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlwa = "https://wa.me/6281213142495";
                Uri uriwa = Uri.parse(urlwa);
                startActivity(new Intent(Intent.ACTION_VIEW, uriwa));
            }
        });
    }

    private void keurlweb() {
        keweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlweb = "https://servicelaptopterkenal.blogspot.com/";
                Uri uriweb = Uri.parse(urlweb);
                startActivity(new Intent(Intent.ACTION_VIEW, uriweb));
            }
        });
    }

    private void initView() {
        alamat = findViewById(R.id.alamat);
        kewa = findViewById(R.id.kewa);
        keweb = findViewById(R.id.keweb);
    }

    public void back(View view) {
        onBackPressed();
    }
}