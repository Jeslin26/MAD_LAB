package com.sam.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Button chatbutton=findViewById(R.id.b1);
        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.frag,fragment_1.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("")
                        .commit();


            }


        });
        Button stsbutton=findViewById(R.id.b2);
        stsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.frag,fragment_2.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("")
                        .commit();
            }
        });

        Button callsbutton=findViewById(R.id.b3);
        callsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.frag,fragment_3.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("")
                        .commit();
            }
        });

    }
}