package com.example.sirat.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.zip.Inflater;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button calculateButton, aboutButton;
    EditText maleText,femaleText;
    TextView showView;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculateButton= findViewById(R.id.calculateButton);
        aboutButton= findViewById(R.id.aboutMeButton);
        maleText= findViewById(R.id.male);
        femaleText= findViewById(R.id.female);
        showView= findViewById(R.id.showTextView);

        calculateButton.setOnClickListener(this);
        aboutButton.setOnClickListener(this);
        r= new Random(5);
        double d=r.nextDouble();




    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.calculateButton){
            try{
                String him= maleText.getText().toString();
                String her= femaleText.getText().toString();
                if(him.isEmpty() || him=="")
                {
                    Toast t= Toast.makeText(MainActivity.this,"Enter Him",Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER,0,0);
                    t.show();

                }

                showView.setText(""+him+" "+her);
            }catch (Exception ex){
               Toast t= Toast.makeText(MainActivity.this,"Enter Names",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }




        }
        if(v.getId()==R.id.aboutMeButton){
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.customToastId));

            Toast t=  new Toast(MainActivity.this);
            t.setGravity(Gravity.CENTER,0,0);
            t.setDuration(Toast.LENGTH_SHORT);
            t.setView(view);
            t.show();

        }





    }
}
