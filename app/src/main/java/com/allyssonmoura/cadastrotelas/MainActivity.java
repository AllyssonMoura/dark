package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btcadastrar;
    private Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscarReferencias();
        telaLogin();
        telaCadastro();
    }

    public void buscarReferencias() {
        btcadastrar = (Button) findViewById(R.id.btcadastrar);
        btlogin = (Button) findViewById(R.id.btlogin);
    }

    public void telaLogin() {
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(MainActivity.this, TelaLogin.class);
                startActivity(it);
            }
        });
    }

    public void telaCadastro() {
        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(MainActivity.this, TelaCadastro.class);
                startActivity(it);
            }
        });
    }
}