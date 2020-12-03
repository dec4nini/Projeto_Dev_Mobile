package com.example.trabalho2bimestre;

import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;

public class TelaPet {

    MainActivity act;
    TelaPrincipal telaPrincipal;
    RadioGroup rdgPets;
    Button btnEscolhaPet;

    public TelaPet(MainActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }

    public void CarregarTela(){
        act.setContentView(R.layout.pagina_pet);
        rdgPets = act.findViewById(R.id.rdgPets);

        btnEscolhaPet = act.findViewById(R.id.btnEscolha);

        btnEscolhaPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(act);

                msg.setTitle("Você escolheu: ");
                msg.setMessage(escolhaPet());
                msg.setNeutralButton("Fechar", null);
                msg.show();
            }
        });


    }

    public String escolhaPet(){
        int escolha = rdgPets.getCheckedRadioButtonId();

        if(escolha == R.id.rdbGato){
            return "Gato";
        } else if(escolha == R.id.rdbCachorro){
            return "Cachorro";
        } else if(escolha == R.id.rdbPassaro){
            return "Passaro";
        }
        return "";
    }
}
