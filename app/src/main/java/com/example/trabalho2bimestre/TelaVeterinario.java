package com.example.trabalho2bimestre;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class TelaVeterinario {

    MainActivity act;
    ListView lstVet;
    TelaPrincipal telaPrincipal;
    public TelaVeterinario(MainActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }

    public void CarregarTela(){

        act.setContentView(R.layout.pagina_vet);
        lstVet = (ListView) act.findViewById(R.id.lstVets);

        lstVet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nome = ((TextView) view).getText().toString();
                AlertDialog.Builder alert = new AlertDialog.Builder(act);
                alert.setTitle("Veterinario");
                alert.setMessage("Veterinario Selecionado: "+nome);
                alert.setNeutralButton("Fechar",null);
                alert.show();
            }
        });
    }

}
