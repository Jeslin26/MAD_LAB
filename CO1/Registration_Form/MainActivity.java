package com.sam.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView n= (TextView) findViewById(R.id.name);
                TextView u=(TextView) findViewById(R.id.user);
                TextView j= (TextView) findViewById(R.id.job);
                TextView a=(TextView) findViewById(R.id.add);
                RadioGroup r = (RadioGroup) findViewById(R.id.radio);
                RadioButton r1 = (RadioButton) findViewById(R.id.male);
                CheckBox ja= (CheckBox) findViewById(R.id.java);
                CheckBox py= (CheckBox) findViewById(R.id.python);
                CheckBox cp= (CheckBox) findViewById(R.id.cpp);

                String name= String.valueOf(n.getText());
                String user= String.valueOf(u.getText());
                String job= String.valueOf(j.getText());
                String address= String.valueOf(a.getText());

                if(name.equals(""))
                {
                    Toast.makeText(MainActivity.this, "enter the name", Toast.LENGTH_SHORT).show();
                }

                if(user.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "enter the Username", Toast.LENGTH_SHORT).show();
                }
                if(job.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "enter the Job Title", Toast.LENGTH_SHORT).show();
                }
                if(address.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "enter the address", Toast.LENGTH_SHORT).show();
                }



                if (r.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(MainActivity.this, " gender not selected", Toast.LENGTH_SHORT).show();
                }



                if(!ja.isChecked() && !py.isChecked() && !cp.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Programing language Not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
