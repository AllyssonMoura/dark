package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TelaApresentacao extends AppCompatActivity {

    private MediaPlayer media;
    private Button btstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_apresentacao);

        media = MediaPlayer.create(TelaApresentacao.this, R.raw.abertura);
        media.start();

        buscarReferencias();
        stopMusic();
        stopMusica();
    }

    public void buscarReferencias() {
        btstop = (Button) findViewById(R.id.btstop);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
           return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id) {
            case R.id.menupersonagens:
                Intent it = new Intent(TelaApresentacao.this, TelaPersonagens.class);
                startActivity(it);
                break;
            case R.id.menuarvore:
                Intent at = new Intent(TelaApresentacao.this, TelaArvore.class);
                startActivity(at);
                break;
            case R.id.menuparadoxos:
                Intent et = new Intent(TelaApresentacao.this, TelaParadoxos.class);
                startActivity(et);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onStop() {
        if(media.isPlaying()) {
            media.stop();
        }
        super.onStop();
    }

    public void stopMusic() {
        btstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media = MediaPlayer.create(TelaApresentacao.this, R.raw.abertura);
                media.stop();
            }
        });
    }

    public void stopMusica() {
        btstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media = MediaPlayer.create(TelaApresentacao.this, R.raw.abertura);
                media.stop();
            }
        });
    }
}