package co.edu.unipiloto.beeradviser;


import java.util.ArrayList;
import java.util.List;

public class SignsExpert {

    List<String> getseñales(String clasificacion_SeñalesT) {
        List<String> señales = new ArrayList<>();
        if (clasificacion_SeñalesT.equals("Reglamentarias")) {
            señales.add("pare");
            señales.add("no pase");
            señales.add("doble via");
            señales.add("ciclovia");
            señales.add("prohibido parquear");
        } else {
            if (clasificacion_SeñalesT.equals("Preventivas")) {
                señales.add("semaforo");
                señales.add("curva peligrosa a la derecha");
                señales.add("ceda el paso");
                señales.add("riesgo de accidente");
            } else {
                if (clasificacion_SeñalesT.equals("Informativas")){
                    señales.add("hospedaje");
                    señales.add("paradero");
                    señales.add("restaurante");
                    señales.add("estacion de servicio");

                } else {
                    señales.add("obra en via");
                    señales.add("desvio");
                    señales.add("inicio de obra");
                    señales.add("fin de obra");

                }

            }
        }
        return señales;
    }
}
