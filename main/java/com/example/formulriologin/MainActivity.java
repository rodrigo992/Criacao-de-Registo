package com.example.formulriologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_username, et_password;
    Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        bt_login= findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if(username.equals("user") && password.equals("pass")){
                    Toast.makeText(MainActivity.this,"Login válido!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Login inválido!", Toast.LENGTH_SHORT).show();

                    et_username.setText("");
                    et_password.setText("");

                }
            }
        });
    }
}