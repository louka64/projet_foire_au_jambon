package com.example.corrigefoirejambon;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class RechercheActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
        Foire.init();


        Button boutonRechercher = (Button) findViewById(R.id.b_rechercher);


        boutonRechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nom = (EditText) findViewById(R.id.et_nom);
                EditText specialite = (EditText) findViewById(R.id.et_specialites);
                EditText zone = (EditText) findViewById(R.id.et_zone);


                if (!nom.getText().toString().isEmpty()) {
                    rechercherParNom(nom.getText().toString());
                } else {
                    if (!specialite.getText().toString().isEmpty()) {
                        rechercherParSpecialite(specialite.getText().toString());
                    } else {
                        if (!zone.getText().toString().isEmpty()) {
                            rechercherParZone(zone.getText().toString());
                        } else MessageAvertissementMonoCritere();

                    }
                }
            }

    public void rechercherParNom(String nomARechercher) {
        TextView resultat = (TextView) findViewById(R.id.tv_resultat);
        resultat.setText("");
        resultat.setTextColor(Color.BLUE);
        for (int i = 0; i < Foire.exposants.size(); i++) {
            if (Foire.exposants.get(i).getNom().toLowerCase().contains(nomARechercher.toLowerCase())) {
                resultat.setText(resultat.getText() + "\n" +
                        Foire.exposants.get(i).getCode() + " - " +
                        Foire.exposants.get(i).getNom() + " - " +
                        Foire.exposants.get(i).getSpecialites() +
                        Foire.exposants.get(i).getAnneeCreation());
            }
        }
        Log.d("Recherche", "Recherche par nom : "+nomARechercher);
    }

    public void rechercherParSpecialite(String specARechercher) {
        TextView resultat = (TextView) findViewById(R.id.tv_resultat);
        resultat.setText("");
        resultat.setTextColor(Color.BLUE);
        for (int i = 0; i < Foire.exposants.size(); i++) {
            if (Foire.exposants.get(i).getSpecialites().equals(specARechercher)) {
                resultat.setText(resultat.getText() + "\n" +
                        Foire.exposants.get(i).getCode() + " - " +
                        Foire.exposants.get(i).getNom() + " - " +
                        Foire.exposants.get(i).getSpecialites() +
                        Foire.exposants.get(i).getAnneeCreation());
            }
        }
        Log.d("Recherche", "Recherche par spec : "+specARechercher);
    }

}