package com.papps.goservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu_servicekomputer extends AppCompatActivity {

    private ImageView alamat,kewa,kewa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_menu_servicekomputer);

        initView();
        keurlalamat();
        keurlwa();
        keurlwa2();
    }

    private void keurlwa2() {
        kewa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlwa = "https://wa.me/6281213142495";
                Uri uriwa = Uri.parse(urlwa);
                startActivity(new Intent(Intent.ACTION_VIEW, uriwa));
            }
        });
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
                String urlwa = "https://api.whatsapp.com/send?phone=6281213142495&text=hallo saya ingin service komputer/laptop";
                Uri uriwa = Uri.parse(urlwa);
                startActivity(new Intent(Intent.ACTION_VIEW, uriwa));
            }
        });
    }


    private void initView() {
        alamat = findViewById(R.id.alamat);
        kewa = findViewById(R.id.kewa);
        kewa2 = findViewById(R.id.kewa2);
    }

    public void back(View view) {
        onBackPressed();
    }
}