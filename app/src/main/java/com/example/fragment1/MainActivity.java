package com.example.fragment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ID, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ID = (EditText) findViewById(R.id.ID);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = ID.getText().toString();
                String pass = password.getText().toString();

                if (email.equals("Admin") && pass.equals("123456789")) {
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(" ID dan Password Anda Salah").setNegativeButton("Coba Lagi", null).create().show();
                    ID.setText("");
                    password.setText("");


                }
            }
        });
    }
}