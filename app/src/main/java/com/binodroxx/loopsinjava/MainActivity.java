package com.binodroxx.loopsinjava;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        String helloWorldtxt =" ";
        int counter=1;
        while(counter<=10){
            Log.i("MyTag","Hello World "+ counter);
            helloWorldtxt = helloWorldtxt+"hello world"+counter+"\n";
            counter=counter+1;
        }
        TextView texthelloworld=findViewById(R.id.texthelloworld);
        texthelloworld.setText(helloWorldtxt);*/

    /*   String HelloWorldTxt="";

        for (int count=0;count<20;count++){
            Log.i("MyTag","hello world "+count);
            HelloWorldTxt=HelloWorldTxt+"hello world "+count+"\n";
         }
        TextView texthelloworld=findViewById(R.id.texthelloworld);
        texthelloworld.setText(HelloWorldTxt);*/

        }
    public void  buttonIsclicked(View buttonview){
        EditText texthelloworld=findViewById(R.id.texthelloworld);
        TextView textView=findViewById(R.id.textView);
        String reverse="";
      String word=texthelloworld.getText().toString();
      char[] wordArray=word.toCharArray();
        for (int i=wordArray.length-1;i>=0;i--){

            reverse=reverse+wordArray[i]+"";
        }
        textView.setText(reverse);

    }


}

