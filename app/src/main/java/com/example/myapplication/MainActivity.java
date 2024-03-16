package com.example.myapplication;

import static com.example.myapplication.MainActivity2.Nama;
import static com.example.myapplication.MainActivity2.Nim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText namaInput, nimInput, emailInput;
    Button saveBtn;

    private String nama, nim, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaInput = findViewById(R.id.namaInput);
        nimInput = findViewById(R.id.nimInput);
        emailInput = findViewById(R.id.emailInput);
        saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });

    }
    public void sendData() {
        nama = namaInput.getText().toString().trim();
        nim = nimInput.getText().toString().trim();
        email = emailInput.getText().toString().trim();

        Intent nextPage = new Intent(MainActivity.this, MainActivity2.class);

        nextPage.putExtra(MainActivity2.Nama, nama);
        nextPage.putExtra(MainActivity2.Nim, nim);
        nextPage.putExtra(MainActivity2.Email, email);


        startActivity(nextPage);
    }
}