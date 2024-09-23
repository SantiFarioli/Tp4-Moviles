package com.example.menuconmapa;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.example.menuconmapa.model.Farmacia;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.menuconmapa.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    public static ArrayList<Farmacia> listaFarmacias = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listaFarmacias.add(new Farmacia("Farmacia Quintana", "Pte. Arturo Illia 216, San Luis Capital, San Luis", R.drawable.farmacia_quintana, "Horario: de 10:00 a 20:00", -33.280576, -66.332482));
        listaFarmacias.add(new Farmacia("Farmacia Los Alamos", "San Martín 502, Ciudad de San Luis, San Luis", R.drawable.farmacia_los_alamos, "Horario: de 10:00 a 20:00", -33.281576, -66.333482));
        listaFarmacias.add(new Farmacia("Farmacia San Isidro", "General Paz 443, Ciudad de San Luis, San Luis", R.drawable.farmacia_san_isidro, "Horario: de 10:00 a 20:00", -33.282576, -66.334482));
        listaFarmacias.add(new Farmacia("Farmacia Santa Maria", "Avenida Perón 1200, Juana Koslay, San Luis", R.drawable.farmacia_santa_maria, "Horario: de 10:00 a 20:00", -33.283576, -66.335482));
        listaFarmacias.add(new Farmacia("Farmacity San Luis", "Rivadavia 602", R.drawable.farmacity_san_luis, "Horario: de 10:00 a 20:00", -33.284576, -66.336482));



        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_salir, R.id.map, R.id.nav_farmacias)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}