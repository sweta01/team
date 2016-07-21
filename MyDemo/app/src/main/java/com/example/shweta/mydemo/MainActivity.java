package com.example.shweta.mydemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private Button btnFullscreenAd;
    String str_duplicate[]={"1","2","2","3","5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("E8BCEFC40068C63BD18F1F9DCA661500")
                .build();
        mAdView.loadAd(adRequest);
        btnFullscreenAd = (Button) findViewById(R.id.btn_fullscreen_ad);
        btnFullscreenAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
//        find Duplicate Element in Array
        findDuplicateElement(str_duplicate);
        findDuplicateElementByHashset(str_duplicate);
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
    public void findDuplicateElement(String str_duplicate[]){
        for(int i=0;i<str_duplicate.length;i++){
            for(int j=0;j<str_duplicate.length;j++){
                if(str_duplicate[i].equals(str_duplicate[j])&& i!=j){
                    System.out.println("Duplicate Element "+ str_duplicate[i]);
                }
            }
        }
    }
    public void  findDuplicateElementByHashset(String str_duplicate[]){
        HashSet <String>hashset=new HashSet<String>();
        for(String str:str_duplicate){
            if(!hashset.add(str)){
                System.out.println("Duplicate Element By Using Hashset"+str);
            }
        }


    }
}
