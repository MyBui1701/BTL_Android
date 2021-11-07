package com.example.btl_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {
    Button btnplay;
    ImageButton btnmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HwAds.init(this);
        BannerView bannerView = findViewById(R.id.hw_banner_view);
        bannerView.setAdId("testw6vs28auh3");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

        btnplay = (Button) findViewById(R.id.choigame);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Choigame.class);
                startActivity(intent);
            }
        });

        btnmn = findViewById(R.id.menu);
        btnmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuintent = new Intent(MainActivity.this, Menu.class);
                startActivity(menuintent);
            }
        });
    }
}