package com.example.trabalho2bimestre;

public class TelaPrincipal {
    MainActivity act;
    TelaPet telaPet;
    TelaService telaService;
    TelaVeterinario telaVeterinario;
    MapsActivity mapsActivity;

    public TelaPrincipal(MainActivity act){this.act = act;}

    public void setTelaPet(TelaPet telaPet){this.telaPet = telaPet;}

    public void setTelaService(TelaService telaService){this.telaService = telaService;}

    public void setTelaVeterinario(TelaVeterinario telaVeterinario){this.telaVeterinario = telaVeterinario;}

    public void setTelaMapsActitivy(MapsActivity mapsActivity){this.mapsActivity = mapsActivity;}
}
