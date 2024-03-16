package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String Nama = "Nama";
    public static final String Nim = "Nim";
    public static final String Email = "Email";

    private TextView namaOut, nimOut, emailOut;
    private String nama;
    private String nim;
    private String email;

    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaOut = findViewById(R.id.namaOut);
        nimOut = findViewById(R.id.nimOut);
        emailOut = findViewById(R.id.emailOut);
        backBtn = (Button) findViewById(R.id.backBtn);

        Intent nextPage = getIntent();
        nama = nextPage.getStringExtra(Nama);
        nim = nextPage.getStringExtra(Nim);
        email = nextPage.getStringExtra(Email);

        namaOut.setText("Nama : " + nama);
        nimOut.setText("NIM : " + nim);
        emailOut.setText("Email : " + email);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backPage = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backPage);
            }
        });
    }
}