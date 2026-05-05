package com.example.corrigefoirejambon;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv_exposants ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_exposants = findViewById(R.id.tv_exposants);
        //charger dans l'appli mobile le catalogue des 4 produits
        Foire.init();

        actualiser();
        Button boutonActu = (Button) findViewById(R.id.b_actualiser);

        boutonActu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualiser();
            }
        });

        Button boutonEnregistrer = (Button) findViewById(R.id.b_enregistrer);

        boutonEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enregistrer();
            }
        });
    }

    public void actualiser(){
        tv_exposants.setText("");
        for (int i=0 ; i<Foire.exposants.size() ; i++) {
            tv_exposants.setText(tv_exposants.getText()+Foire.exposants.get(i).getCode()
                    + " / " + Foire.exposants.get(i).getNom()
                    + " / " + Foire.exposants.get(i).getSpecialites()
                    + " / " + Foire.exposants.get(i).getAnneeCreation()
                    + " / " + Foire.exposants.get(i).getLaCaseta().getNum()
                    + " / " + Foire.exposants.get(i).getLaCaseta().getLaZone()
                    + " \n ");
            Log.d("AfficheExposant", Foire.exposants.get(i).toString());
        }
    }

    public void enregistrer(){
        EditText code = (EditText) findViewById(R.id.et_code);
        EditText nom = (EditText) findViewById(R.id.et_nom);
        EditText specialite = (EditText) findViewById(R.id.et_specialites);
        EditText anneeCreation = (EditText) findViewById(R.id.et_anneeCreation);

        Zone zoneE = new Zone("E","Port","Port central de Bayonne");
        Caseta cas70 = new Caseta(70,18.5f,"allée transversale 2",zoneE);

        /*verifier que les zones de saisies ne soient pas vide
        avant de fabriquer un objet de type Exposant à ajouter au
        catalogue des exposants */

        if( ! code.getText().toString().isBlank()
                && ! nom.getText().toString().isBlank()
                && ! specialite.getText().toString().isBlank()) {
            Exposant expo = new Exposant(code.getText().toString(),nom.getText().toString(), specialite.getText().toString(), Integer.valueOf(anneeCreation.getText().toString()),cas70);
            Foire.exposants.add(expo);
            Log.d("ajout exposant", "exposant ajouté : "+expo.toString());
        }
    }

}
