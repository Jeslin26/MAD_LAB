package com.sam.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             TextView t= (TextView) findViewById(R.id.user);
             TextView p= (TextView) findViewById(R.id.pass);
             String u= String.valueOf(t.getText());
             String pa=String.valueOf(p.getText());
             if(u.equals("jeslin") && (pa.equals("123456")))
             {
                 Toast.makeText(MainActivity.this, "validated", Toast.LENGTH_SHORT).show();
             }
             else{
                 Toast.makeText(MainActivity.this, "Not validated", Toast.LENGTH_SHORT).show();
             }




          }
      });

    }


}
