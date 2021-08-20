package com.allyssonmoura.cadastrotelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class TelaPersonagens extends AppCompatActivity {

    private Spinner sppersonagensa;
    private Spinner sppersonagensb;
    private Spinner sppersonagensori;
    private Button btsic;
    private Button bterit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_personagens);

        buscarReferencias();
        buscarPersonagemA();
        buscarPersonagemB();
        buscarPersonagemOri();
        telaSic();
        telaErit();
    }

    public void buscarReferencias() {
        sppersonagensa = (Spinner) findViewById(R.id.sppersonagensa);
        sppersonagensb = (Spinner) findViewById(R.id.sppersonagensb);
        sppersonagensori = (Spinner) findViewById(R.id.sppersonagensori);
        btsic = (Button) findViewById(R.id.btsic);
        bterit = (Button) findViewById(R.id.bterit);
    }

    public void buscarPersonagemA() {
        sppersonagensa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                } else if (position == 1) {
                    Intent it = new Intent (TelaPersonagens.this, TelaAgnesA.class);
                    startActivity(it);
                } else if (position == 2) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBartoszA.class);
                    startActivity(it);
                } else if (position == 3) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBenjaminBernadetteA.class);
                    startActivity(it);
                } else if (position == 4) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBerndA.class);
                    startActivity(it);
                } else if (position == 5) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBorisAleksanderA.class);
                    startActivity(it);
                } else if (position == 6) {
                    Intent it = new Intent (TelaPersonagens.this, TelaCharlotteA.class);
                    startActivity(it);
                } else if (position == 7) {
                    Intent it = new Intent (TelaPersonagens.this, TelaClaudiaA.class);
                    startActivity(it);
                } else if (position == 8) {
                    Intent it = new Intent (TelaPersonagens.this, TelaClausenA.class);
                    startActivity(it);
                } else if (position == 9) {
                    Intent it = new Intent (TelaPersonagens.this, TelaDanielA.class);
                    startActivity(it);
                } else if (position == 10) {
                    Intent it = new Intent (TelaPersonagens.this, TelaDesconhecidoInfinito.class);
                    startActivity(it);
                } else if (position == 11) {
                    Intent it = new Intent (TelaPersonagens.this, TelaDorisA.class);
                    startActivity(it);
                } else if (position == 12) {
                    Intent it = new Intent (TelaPersonagens.this, TelaEgonA.class);
                    startActivity(it);
                } else if (position == 13) {
                    Intent it = new Intent (TelaPersonagens.this, TelaElisabethA.class);
                    startActivity(it);
                } else if (position == 14) {
                    Intent it = new Intent (TelaPersonagens.this, TelaFranziskaA.class);
                    startActivity(it);
                } else if (position == 15) {
                    Intent it = new Intent (TelaPersonagens.this, TelaGretaA.class);
                    startActivity(it);
                } else if (position == 16) {
                    Intent it = new Intent (TelaPersonagens.this, TelaGustavA.class);
                    startActivity(it);
                } else if (position == 17) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHGA.class);
                    startActivity(it);
                } else if (position == 18) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHannahA.class);
                    startActivity(it);
                } else if (position == 19) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHannoNoahA.class);
                    startActivity(it);
                } else if (position == 20) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHeinrichA.class);
                    startActivity(it);
                } else if (position == 21) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHeleneA.class);
                    startActivity(it);
                } else if (position == 22) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHelgeA.class);
                    startActivity(it);
                } else if (position == 23) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHermannA.class);
                    startActivity(it);
                } else if (position == 24) {
                    Intent it = new Intent (TelaPersonagens.this, TelaInesA.class);
                    startActivity(it);
                } else if (position == 25) {
                    Intent it = new Intent (TelaPersonagens.this, TelaJanaA.class);
                    startActivity(it);
                } else if (position == 26) {
                    Intent it = new Intent (TelaPersonagens.this, TelaJonasAdam.class);
                    startActivity(it);
                } else if (position == 27) {
                    Intent it = new Intent (TelaPersonagens.this, TelaKatharinaA.class);
                    startActivity(it);
                } else if (position == 28) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMadsA.class);
                    startActivity(it);
                } else if (position == 29) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMagnusA.class);
                    startActivity(it);
                } else if (position == 30) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMarthaA.class);
                    startActivity(it);
                } else if (position == 31) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMikkelMichaelA.class);
                    startActivity(it);
                } else if (position == 32) {
                    Intent it = new Intent (TelaPersonagens.this, TelaPeterA.class);
                    startActivity(it);
                } else if (position == 33) {
                    Intent it = new Intent (TelaPersonagens.this, TelaReginaA.class);
                    startActivity(it);
                } else if (position == 34) {
                    Intent it = new Intent (TelaPersonagens.this, TelaSebastianA.class);
                    startActivity(it);
                } else if (position == 35) {
                    Intent it = new Intent (TelaPersonagens.this, TelaSiljaA.class);
                    startActivity(it);
                } else if (position == 36) {
                    Intent it = new Intent (TelaPersonagens.this, TelaTorbenA.class);
                    startActivity(it);
                } else if (position == 37) {
                    Intent it = new Intent (TelaPersonagens.this, TelaTronteA.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent (TelaPersonagens.this, TelaUlrichA.class);
                    startActivity(it);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void buscarPersonagemB() {
        sppersonagensb.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                } else if (position == 1) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBartoszB.class);
                    startActivity(it);
                } else if (position == 2) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBenjaminB.class);
                    startActivity(it);
                } else if (position == 3) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBorisAleksanderB.class);
                    startActivity(it);
                } else if (position == 4) {
                    Intent it = new Intent (TelaPersonagens.this, TelaCharlotteB.class);
                    startActivity(it);
                } else if (position == 5) {
                    Intent it = new Intent (TelaPersonagens.this, TelaClaudiaB.class);
                    startActivity(it);
                } else if (position == 6) {
                    Intent it = new Intent (TelaPersonagens.this, TelaDesconhecidoInfinito.class);
                    startActivity(it);
                } else if (position == 7) {
                    Intent it = new Intent (TelaPersonagens.this, TelaEgonB.class);
                    startActivity(it);
                } else if (position == 8) {
                    Intent it = new Intent (TelaPersonagens.this, TelaElisabethB.class);
                    startActivity(it);
                } else if (position == 9) {
                    Intent it = new Intent (TelaPersonagens.this, TelaFranziskaB.class);
                    startActivity(it);
                } else if (position == 10) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHannahB.class);
                    startActivity(it);
                } else if (position == 11) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHannoNoahB.class);
                    startActivity(it);
                } else if (position == 12) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHelgeB.class);
                    startActivity(it);
                } else if (position == 13) {
                    Intent it = new Intent (TelaPersonagens.this, TelaKatharinaB.class);
                    startActivity(it);
                } else if (position == 14) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMadsB.class);
                    startActivity(it);
                } else if (position == 15) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMagnusB.class);
                    startActivity(it);
                } else if (position == 16) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMarthaEva.class);
                    startActivity(it);
                } else if (position == 17) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMikkelB.class);
                    startActivity(it);
                } else if (position == 18) {
                    Intent it = new Intent (TelaPersonagens.this, TelaPeterB.class);
                    startActivity(it);
                } else if (position == 19) {
                    Intent it = new Intent (TelaPersonagens.this, TelaReginaB.class);
                    startActivity(it);
                } else if (position == 20) {
                    Intent it = new Intent (TelaPersonagens.this, TelaTorbenB.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent (TelaPersonagens.this, TelaUlrichB.class);
                    startActivity(it);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void buscarPersonagemOri() {
        sppersonagensori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                } else if (position == 1) {
                    Intent it = new Intent (TelaPersonagens.this, TelaBenjaminBernadetteOri.class);
                    startActivity(it);
                } else if (position == 2) {
                    Intent it = new Intent (TelaPersonagens.this, TelaCharlotteOri.class);
                    startActivity(it);
                } else if (position == 3) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHGOri.class);
                    startActivity(it);
                } else if (position == 4) {
                    Intent it = new Intent (TelaPersonagens.this, TelaHannahOri.class);
                    startActivity(it);
                } else if (position == 5) {
                    Intent it = new Intent (TelaPersonagens.this, TelaKatharinaOri.class);
                    startActivity(it);
                } else if (position == 6) {
                    Intent it = new Intent (TelaPersonagens.this, TelaMarekOri.class);
                    startActivity(it);
                } else if (position == 7) {
                    Intent it = new Intent (TelaPersonagens.this, TelaPeterOri.class);
                    startActivity(it);
                } else if (position == 8) {
                    Intent it = new Intent (TelaPersonagens.this, TelaReginaOri.class);
                    startActivity(it);
                } else if (position == 9) {
                    Intent it = new Intent (TelaPersonagens.this, TelaSonjaOri.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent (TelaPersonagens.this, TelaTorbenOri.class);
                    startActivity(it);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
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
                Intent it = new Intent(TelaPersonagens.this, TelaApresentacao.class);
                startActivity(it);
                break;
            case R.id.menuarvore:
                Intent at = new Intent(TelaPersonagens.this, TelaArvore.class);
                startActivity(at);
                break;
            case R.id.menuparadoxos:
                Intent et = new Intent(TelaPersonagens.this, TelaParadoxos.class);
                startActivity(et);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void telaSic() {
        btsic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(TelaPersonagens.this, TelaSicMundus.class);
                startActivity(it);
            }
        });
    }

    public void telaErit() {
        bterit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(TelaPersonagens.this, TelaEritLux.class);
                startActivity(it);
            }
        });
    }
}