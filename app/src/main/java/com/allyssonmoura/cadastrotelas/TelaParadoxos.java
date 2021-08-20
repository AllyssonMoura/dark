package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class TelaParadoxos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_paradoxos);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id) {
            case R.id.menuinicial:
                Intent it = new Intent(TelaParadoxos.this, TelaApresentacao.class);
                startActivity(it);
                break;
            case R.id.menupersonagens:
                Intent at = new Intent(TelaParadoxos.this, TelaPersonagens.class);
                startActivity(at);
                break;
            case R.id.menuarvore:
                Intent et = new Intent(TelaParadoxos.this, TelaArvore.class);
                startActivity(et);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}