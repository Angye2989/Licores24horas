package com.cdp.licores24horas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Metodos para botones */

    public void irIniciar(View view){
        Intent i= new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrar(View view){
        Intent i= new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }

    public void irHistoria(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.purace-cauca.gov.co/MiMunicipio/Paginas/Pasado-Presente-y-Futuro.aspx"));
        startActivity(i);

    }

    public void irSitiosturisticos(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sitiosturisticoscolombia.com/parque-nacional-natural-purace/"));
        startActivity(i);

    }

    public void irfaunayflora(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/site/parquenacionalpurace/fauna-y-flora"));
        startActivity(i);

    }

    public void irgastronomia(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://anterior.cauca.gov.co/noticias/los-sabores-y-saberes-se-tomaron-al-municipio-de-purace-con-la-primera-muestra-gastronomica"));
        startActivity(i);

    }



}
