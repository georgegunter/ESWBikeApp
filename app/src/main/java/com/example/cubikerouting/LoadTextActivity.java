package com.example.cubikerouting;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoadTextActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_load_text);
//
//            EditText text = (EditText) findViewById(R.id.inputText);
//            String fileName = "savedInfo.txt";
//            String textVal;
//
//            Context context = getApplicationContext();
//
//            //opening an output stream
//            try {
//                FileInputStream inputStream = openFileInput(fileName);
//
//                try {
//                    textVal = getFileContent(inputStream);
//                    inputStream.close();
//                    text.setText(textVal, TextView.BufferType.EDITABLE);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    text.setText("Did Not Load", TextView.BufferType.EDITABLE);
//                }
//            }
//            catch (IOException e){
//                text.setText("Failed to locate file " + context, TextView.BufferType.EDITABLE);
//            }
//
//
//
//        public static String getFileContent(FileInputStream fis) throws IOException
//        {
//            try(BufferedReader br = new BufferedReader(new InputStreamReader(fis, "US-ASCII")))
//            {
//                StringBuilder sb = new StringBuilder();
//                String line;
//                while(( line = br.readLine()) != null ) {
//                    sb.append( line );
//                    sb.append( '\n' );
//                }
//                return sb.toString();
//            }
//        }
//    }
}
