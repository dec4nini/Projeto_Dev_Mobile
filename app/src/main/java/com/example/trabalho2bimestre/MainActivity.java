package com.example.trabalho2bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends AppCompatActivity {


    TelaPrincipal telaPrincipal;
    TelaPet telaPet;
    TelaService telaService;
    TelaVeterinario telaVeterinario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telaPrincipal = new TelaPrincipal(this);

        telaPet = new TelaPet(this, telaPrincipal);
        telaPrincipal.setTelaPet(telaPet);

        telaService = new TelaService(this, telaPrincipal);
        telaPrincipal.setTelaService(telaService);

        telaVeterinario = new TelaVeterinario(this, telaPrincipal);
        telaPrincipal.setTelaVeterinario(telaVeterinario);


    }

    public void CarregarTelaMain(){
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.imn1)
        {
            CarregarTelaMain();
        }
        if(id == R.id.imn2)
        {
            telaPet.CarregarTela();
        }
        if(id == R.id.imn3)
        {
            telaService.CarregarTela();
        }
        if(id == R.id.imn4)
        {
            telaVeterinario.CarregarTela();
        }
        if(id == R.id.imn5)
        {
            setContentView(R.layout.activity_mapa);

        }

        return super.onOptionsItemSelected(item);
    }
}