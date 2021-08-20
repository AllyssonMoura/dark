package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    private EditText e1;
    private EditText e2;
    private Button b1;

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        e1 = (EditText) findViewById(R.id.etemaillog);
        e2 = (EditText) findViewById(R.id.etsenhalog);
        b1 = (Button) findViewById(R.id.btlogando);
        db = new DatabaseHelper(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = e1.getText().toString();
                String password = e2.getText().toString();

                Boolean confiemailsenha = db.emailpassword(email, password);
                if (confiemailsenha == true) {
                    Intent it = new Intent(TelaLogin.this, TelaApresentacao.class);
                    startActivity(it);
                } else
                    Toast.makeText(getApplicationContext(), "Dados Incorretos!",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
}
