package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findingbeer(View view){
        TextView types = (TextView) findViewById(R.id.types);
        Spinner color = (Spinner) findViewById(R.id.color);
        String cheesetype = String.valueOf(color.getSelectedItem());

        List<String> brandsList = expert.getBrands(cheesetype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        types.setText(brandsFormatted);
    }
}
