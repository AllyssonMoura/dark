package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaResultado extends AppCompatActivity {

    private TextView tvrespostanome;
    private TextView tvrespostaidade;
    private TextView tvrespostaemail;
    private TextView tvrespostasenha;
    private TextView tvrespostaconfisenha;
    private TextView tvrespostagenero;
    private TextView tvrespostapersonagens;
    private TextView tvrespostaparadoxos;
    private TextView tvrespostalinha;
    private TextView tvrespostaarvore;
    private Button btcerto;

    private Cadastro c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);

        buscarReferencias();
        preencherDados();
        telaLogin();
    }

    public void buscarReferencias() {
        tvrespostanome = (TextView) findViewById(R.id.tvrespostanome);
        tvrespostaidade = (TextView) findViewById(R.id.tvrespostaidade);
        tvrespostaemail = (TextView) findViewById(R.id.tvrespostaemail);
        tvrespostasenha = (TextView) findViewById(R.id.tvrespostasenha);
        tvrespostaconfisenha = (TextView) findViewById(R.id.tvrespostaconfisenha);
        tvrespostagenero = (TextView) findViewById(R.id.tvrespostagenero);
        tvrespostapersonagens = (TextView) findViewById(R.id.tvrespostapersonagens);
        tvrespostaparadoxos = (TextView) findViewById(R.id.tvrespostaparadoxos);
        tvrespostalinha = (TextView) findViewById(R.id.tvrespostalinha);
        tvrespostaarvore = (TextView) findViewById(R.id.tvrespostaarvore);
        btcerto = (Button) findViewById(R.id.btcerto);
    }

    public void preencherDados() {
        String prefpersonagens;
        String prefparadoxos;
        String preflinha;
        String prefarvore;

        c1 = new Cadastro();

        Bundle b1 = getIntent().getExtras();

        c1 = (Cadastro) b1.getSerializable("cadastro");

        tvrespostanome.setText(c1.getNome());
        tvrespostaidade.setText(String.valueOf(c1.getIdade()));
        tvrespostaemail.setText(c1.getEmail());
        tvrespostasenha.setText(c1.getSenha());
        tvrespostaconfisenha.setText(c1.getConfirmarSenha());

        if (c1.getGenero().equals("Masculino")) {
            tvrespostagenero.setText(c1.getGenero());
        } else {
            tvrespostagenero.setText(c1.getGenero());
        }

        if (c1.getAdicional().toString().contains("Personagens")) {
            prefpersonagens = "Personagens";
        } else {
            prefpersonagens = "Opção Não Selecionada";
        }
        if (c1.getAdicional().toString().contains("Paradoxos")) {
            prefparadoxos = "Paradoxos";
        } else {
            prefparadoxos = "Opção Não Selecionada";
        }
        if (c1.getAdicional().toString().contains("Linha do Tempo")) {
            preflinha = "Linha do Tempo";
        } else {
            preflinha = "Opção Não Selecionada";
        }
        if (c1.getAdicional().toString().contains("Árvore Genealógica")) {
            prefarvore = "Árvore Genealógica";
        } else {
            prefarvore = "Opção Não Selecionada";
        }

        tvrespostapersonagens.setText(prefpersonagens);
        tvrespostaparadoxos.setText(prefparadoxos);
        tvrespostalinha.setText(preflinha);
        tvrespostaarvore.setText(prefarvore);
    }

    public void telaLogin() {
        btcerto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(TelaResultado.this, TelaLogin.class);
                startActivity(it);
            }
        });
    }

}