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

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button Save_Button = (Button) findViewById(R.id.Save_Button);
        Button load_Saved_Button = (Button) findViewById(R.id.load_Saved_Button);

        Save_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.inputText);
                String textVal = text.getText().toString();
                String fileName = "savedInfo.txt";

                Context context = getApplicationContext();

                //creating the file
                File file = new File(context.getFilesDir(), fileName);
                text.setText("File Created", TextView.BufferType.EDITABLE);

                //opening an output stream
                FileOutputStream outputStream;

                //attempting to direct the output stream to the created file, then write into it.
                try {
                    outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
                    outputStream.write(textVal.getBytes());
                    outputStream.close();
                    text.setText("Text Saved", TextView.BufferType.EDITABLE);
                } catch (Exception e) {
                    e.printStackTrace();
                    text.setText("Did Not Save", TextView.BufferType.EDITABLE);
                }
            }
        });

        load_Saved_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.inputText);
                String fileName = "savedInfo.txt";
                String textVal;

                Context context = getApplicationContext();

                //opening an output stream
                try {
                    FileInputStream inputStream = openFileInput(fileName);

                    try {
                        textVal = getFileContent(inputStream);
                        inputStream.close();
                        text.setText(textVal, TextView.BufferType.EDITABLE);
                    } catch (Exception e) {
                        e.printStackTrace();
                        text.setText("Did Not Load", TextView.BufferType.EDITABLE);
                    }
                }
                catch (IOException e){
                    text.setText("Failed to locate file " + context, TextView.BufferType.EDITABLE);
                }
            }
        });
    }


    public static String getFileContent(FileInputStream fis) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(fis, "US-ASCII")))
        {
            StringBuilder sb = new StringBuilder();
            String line;
            while(( line = br.readLine()) != null ) {
                sb.append( line );
                sb.append( '\n' );
            }
            return sb.toString();
        }
    }
}
