package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;


public class BeerExpert {

    List<String> getbrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("ambar")) {
            brands.add("jack amber");
            brands.add("red moose");
            brands.add("Van Steenberge");
            brands.add("kondaira");
        } else {
            if (color.equals("craft")) {
                brands.add("Bogota comp");
                brands.add("montanera");
                brands.add("cameron");
                brands.add("adagio");
            } else {
                if (color.equals("light")){
                    brands.add("St. Bernardus Abt 12");
                    brands.add("Gulden Draak Russian Imperial Sout");
                    brands.add("Chimay Azul");

                } else {
                    brands.add(" jail pale ale");
                    brands.add("gout stout");
                    brands.add("Tyris");
                    brands.add("Comala Brewing");
                }

            }
        }
        return brands;
    }

}
