package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert= new BeerExpert();
    private SignsExpert signs=new SignsExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer (View view){
        TextView brands =(TextView) findViewById(R.id.brands);
        //brands.setText("Gottle geer");
        Spinner color= (Spinner) findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem());
        List<String> brandslist = expert.getbrands(beerType);
        StringBuilder brandsFormatted= new StringBuilder();
        for (String brand: brandslist){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }

    public void onClickBuscarSeñal (View view){
        TextView señales =(TextView) findViewById(R.id.señales);
        Spinner clasificacion_SeñalesT= (Spinner) findViewById(R.id.clasificacion_SeñalesT);
        String señalType=String.valueOf(clasificacion_SeñalesT.getSelectedItem());
        List<String> señaleslist = signs.getseñales(señalType);
        StringBuilder señalesFormatted= new StringBuilder();
        for (String señal: señaleslist){
            señalesFormatted.append(señal).append('\n');
        }
        señales.setText(señalesFormatted);
    }

}