package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class TempActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        if(savedInstanceState == null){
            StopwatchFragment stopwatch = new StopwatchFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.stopwatch_container,stopwatch);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
    }
}
