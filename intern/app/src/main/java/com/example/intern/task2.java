package com.example.intern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.net.Proxy.Type.HTTP;

public class task2 extends AppCompatActivity {

    EditText editText;
    EditText editText1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        editText=findViewById(R.id.user);
        editText1=findViewById(R.id.pass);
        button=findViewById(R.id.buttonlog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals(getString(R.string.user_sun))){
                    if(editText1.getText().toString().equals(getString(R.string.user_pass))){
                        Toast.makeText(getApplicationContext(),"Everything is correct",Toast.LENGTH_SHORT).show();


                    }
                    else{
                        if(editText1.getText().toString().equals("")){
                            Toast.makeText(getApplicationContext(),"No password entered",Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Wrong password",Toast.LENGTH_SHORT).show();

                        }
                    }
                }
                else {
                    if(editText.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"No username entered",Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"No such username ",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}
