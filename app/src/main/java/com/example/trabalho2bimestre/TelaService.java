package com.example.trabalho2bimestre;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AlertDialog;

public class TelaService {

    MainActivity act;
    TelaPrincipal telaPrincipal;
    CheckBox ckbTosa, ckbBanho, ckbPasseio;
    Button btnEscolhaSvc;
    public TelaService(MainActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
    }

    public void CarregarTela(){
        act.setContentView(R.layout.pagina_svc);
        ckbBanho = act.findViewById(R.id.ckbBanho);
        ckbTosa = act.findViewById(R.id.ckbTosa);
        ckbPasseio = act.findViewById(R.id.ckbPasseio);
        btnEscolhaSvc = act.findViewById(R.id.btnEscolhaSvc);



        btnEscolhaSvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(act);
                msg.setTitle("Serviços escolhidos");
                msg.setMessage(escolhaServices(ckbBanho, ckbTosa, ckbPasseio));
                msg.setNeutralButton("Fechar", null);
                msg.show();
            }
        });
    }

    public String escolhaServices(CheckBox ckbBanho, CheckBox ckbTosa, CheckBox ckbPasseio){

        String escolhas = "";
        if(ckbBanho.isChecked()){ escolhas += "Banho" + "\n";}
        if(ckbTosa.isChecked()){ escolhas += "Tosa" + "\n";}
        if(ckbPasseio.isChecked()){ escolhas += "Passeio" + "\n";}
        return escolhas;
    }
}
