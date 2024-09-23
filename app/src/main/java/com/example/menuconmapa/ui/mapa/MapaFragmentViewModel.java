package com.example.menuconmapa.ui.mapa;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.menuconmapa.MainActivity;
import com.example.menuconmapa.model.Farmacia;

import java.util.ArrayList;
import java.util.List;

public class MapaFragmentViewModel extends AndroidViewModel {

    public MapaFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public List<Farmacia> obtenerFarmacias() {

        return MainActivity.listaFarmacias;
    }
}

