package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;


public class BeerExpert {

    List<String> getbrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("jack amber");
            brands.add("red moose");
        } else {
            if (color.equals("craft")) {
                brands.add("Bogota comp");
                brands.add("montanera");
            } else {
                brands.add(" jail pale ale");
                brands.add("gout stout");
            }
        }
        return brands;
    }

}
