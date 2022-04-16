package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1 = (EditText) findViewById(R.id.euname);
        EditText e2 = (EditText) findViewById(R.id.epassword);
        Button b1 = findViewById(R.id.bvalidate);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((e1.getText().toString().length() == 0) && (e2.getText().toString().length() == 0))
                {
                    Toast.makeText(MainActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                }
                else if (e1.getText().toString().matches("[a-zA-Z]+") &&
                        e2.getText().toString().matches("[0-9]+") &&
                        e2.getText().toString().length() == 4)
                {
                    Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                }
                else if(!(e1.getText().toString().matches("[a-zA-Z]+")))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();
                }

                else if(!(e2.getText().toString().matches("[0-9]+")))
                {
                    Toast.makeText(MainActivity.this, "Password must only contain numbers", Toast.LENGTH_SHORT).show();
                }

                else if(!(e2.getText().toString().length() == 4))
                {
                    Toast.makeText(MainActivity.this, "Password length must be 4", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}