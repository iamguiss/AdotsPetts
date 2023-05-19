package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPets, idMenuAlimentos,
            idMenuDoacoes, idMenuServicos,
            idMenuLocalizar, idMenuVacina;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuAlimentos = findViewById(R.id.idMenuAlimentos);
        idMenuDoacoes = findViewById(R.id.idMenuDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuVacina = findViewById(R.id.idMenuVacina);
        idMenuLocalizar = findViewById(R.id.idMenuLocalizar);

        idMenuPets.setOnClickListener(this);
        idMenuVacina.setOnClickListener(this);
        idMenuLocalizar.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuAlimentos.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idMenuPets:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuAlimentos:
                startActivity(new Intent(getApplicationContext(),
                        AlimentosActivity.class));
                break;
            case R.id.idMenuDoacoes:
                startActivity(new Intent(getApplicationContext(),
                        DoarActivity.class));
                break;
            case R.id.idMenuLocalizar:
                startActivity(new Intent(getApplicationContext(),
                        LocalizarActivity.class));
                break;
            case R.id.idMenuServicos:
                startActivity(new Intent(getApplicationContext(),
                        ServicoActivity.class));
                break;
            case R.id.idMenuVacina:
                startActivity(new Intent(getApplicationContext(),
                        VacinaActivity.class));
                break;
        }
    }
}