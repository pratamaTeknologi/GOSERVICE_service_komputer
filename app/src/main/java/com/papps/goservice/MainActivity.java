package com.papps.goservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView alamat,kewa,keweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        initView();
        keurlalamat();
        keurlwa();
        keurlweb();
        imageSlider();
    }

    private void imageSlider() {
        ImageSlider imageSlider = findViewById(R.id.imageslider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.gambar1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.gambar2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.gambar3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.gambar4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        imageSlider.startSliding(3000);


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

    public void ketentangaplikasi(View view) {
        startActivity(new Intent(MainActivity.this,Tentang_aplikasi.class));
    }

    public void kemenuservicelaptop(View view) {
        startActivity(new Intent(MainActivity.this, Menu_servicekomputer.class));
    }

    public void kemenugantisprepart(View view) {
        startActivity(new Intent(MainActivity.this, Menu_gantisprepart.class));
    }

    public void kemenuinstalwindows(View view) {
        startActivity(new Intent(MainActivity.this, Menu_instalwindows.class));
    }

    public void kemenuinstaloffice(View view) {
        startActivity(new Intent(MainActivity.this, Menu_instaloffice .class));
    }
}