package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class TelaCadastro extends AppCompatActivity {

    private EditText etnome;
    private EditText etidade;
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private RadioGroup rggenero;
    private RadioButton rbmasculino;
    private RadioButton rbfeminino;
    private CheckBox cbpersonagens;
    private CheckBox cbparadoxos;
    private CheckBox cblinha;
    private CheckBox cbarvore;
    private Button btfinalizar;
    private Button btlimpar;
    private Button btdados;
    private ArrayList<String> adicionais;

    private Cadastro c1;

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        buscarReferencia();
        conexaoBD();
        telaDados();
        cadastrar();
        limpar();
    }

    public void buscarReferencia() {
        etnome = (EditText) findViewById(R.id.etnome);
        etidade = (EditText) findViewById(R.id.etidade);
        e1 = (EditText) findViewById(R.id.etemail);
        e2 = (EditText) findViewById(R.id.etsenha);
        e3 = (EditText) findViewById(R.id.etconfisenha);
        rggenero = (RadioGroup) findViewById(R.id.rggenero);
        rbmasculino = (RadioButton) findViewById(R.id.rbmasculino);
        rbfeminino = (RadioButton) findViewById(R.id.rbfeminino);
        cbpersonagens = (CheckBox) findViewById(R.id.cbpersonagens);
        cbparadoxos = (CheckBox) findViewById(R.id.cbparadoxos);
        cblinha = (CheckBox) findViewById(R.id.cblinha);
        cbarvore = (CheckBox) findViewById(R.id.cbarvore);
        btfinalizar = (Button) findViewById(R.id.btfinalizar);
        btlimpar = (Button) findViewById(R.id.btlimpar);
        btdados = (Button) findViewById(R.id.btdados);
    }

    public void conexaoBD() {
        db = new DatabaseHelper(this);
    }

    public void telaDados() {
        btdados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c1 = new Cadastro();

                c1.setNome(etnome.getText().toString());
                c1.setSenha(e2.getText().toString());
                c1.setConfirmarSenha(e3.getText().toString());
                c1.setEmail(e1.getText().toString());
                c1.setIdade(Byte.parseByte(etidade.getText().toString()));

                if (rggenero.getCheckedRadioButtonId() == R.id.rbmasculino) {
                    c1.setGenero(rbmasculino.getText().toString());
                } else {
                    c1.setGenero(rbfeminino.getText().toString());
                }

                adicionais = new ArrayList<>();
                if(cbpersonagens.isChecked()){
                    adicionais.add(cbpersonagens.getText().toString());
                }
                if(cbparadoxos.isChecked()){
                    adicionais.add(cbparadoxos.getText().toString());
                }
                if(cblinha.isChecked()){
                    adicionais.add(cblinha.getText().toString());
                }
                if(cbarvore.isChecked()){
                    adicionais.add(cbarvore.getText().toString());
                }
                c1.setAdicional(adicionais);

                Intent it = new Intent(TelaCadastro.this, TelaResultado.class);
                it.putExtra("cadastro", c1);
                startActivity(it);
            }
        });

    }

    public void cadastrar() {
        btfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c1 = e1.getText().toString();
                String c2 = e2.getText().toString();
                String c3 = e3.getText().toString();
                if (c1.equals("")||c2.equals("")||c3.equals("")) {
                    Toast.makeText(getApplicationContext(), "Campos Estão Vazios!",
                            Toast.LENGTH_LONG).show();
                } else {
                    if(c2.equals(c3)) {
                        Boolean verifiemail = db.verifiemail(c1);
                        if (verifiemail == true) {
                            Boolean insert = db.insert(c1, c2, c3);
                            if (insert == true) {
                                Toast.makeText(getApplicationContext(), "Registrado com Sucesso!",
                                        Toast.LENGTH_SHORT).show();
                                Intent it = new Intent (TelaCadastro.this, TelaApresentacao.class);
                                startActivity(it);
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Email Já Cadastrado!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }

    public void limpar() {
        btlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etnome.setText("");
                e2.setText("");
                e3.setText("");
                e1.setText("");
                etidade.setText("");
                rbmasculino.setChecked(true);
                cbpersonagens.setChecked(false);
                cbparadoxos.setChecked(false);
                cblinha.setChecked(false);
                cbarvore.setChecked(false);
                etnome.requestFocus();
            }
        });
    }
}