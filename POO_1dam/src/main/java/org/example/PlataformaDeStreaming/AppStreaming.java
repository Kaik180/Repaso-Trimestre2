package org.example.PlataformaDeStreaming;

import java.util.ArrayList;

public class AppStreaming {
    static void main() {
        ArrayList<Suscripcion> Planes = new ArrayList<>();
        Suscripcion gratis = new PlanGratis("Plan gratis",0);
        Suscripcion basico = new PlanBasico("Plan: Basico", 9.99);
        Suscripcion Premiun = new PlanPremiun("Plan: Premiun", 14.99);
        Suscripcion Familiar = new PlanFamiliar("Plan: Familiar", 19.99);

        Planes.add(gratis);
        Planes.add(basico);
        Planes.add(Premiun);
        Planes.add(Familiar);

        for (Suscripcion s : Planes){
            s.mostrarInfo();
            s.obtenerBeneficios();
        }
    }
}
