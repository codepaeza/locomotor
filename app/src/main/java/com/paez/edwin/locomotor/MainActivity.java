package com.paez.edwin.locomotor;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image=new ImageView(this);
        setContentView(image);
        TransitionDrawable transition=(TransitionDrawable)
                getResources().getDrawable(R.drawable.transicion);
        image.setImageDrawable(transition);
        transition.startTransition(4000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.config) {
            lanzarVisitarActivity(null);
            return true;

        }

        if (id == R.id.menu_buscar) {
            lanzarMapaActivity(null);
            return true;
        }


        //  if (id == R.id.acercaDe) {
        //     lanzarAcercadeActivity(null);
        //   return true;
        // }
        return super.onOptionsItemSelected(item);


    }


    public void lanzarVisitarActivity(View view) {

        Intent i = new Intent(MainActivity.this, ListaUnoActivity.class);
        startActivity(i);

        Toast toasti =
                Toast.makeText(MainActivity.this, "Seleccione el Tipo de Lugar", Toast.LENGTH_LONG);
        toasti.show();
    }

    public void lanzarMapaActivity(View view) {

        //Intent j = new Intent(MainActivity.this, SolicitarActivity.class);
       //startActivity(j);

        Toast toastj =
                Toast.makeText(MainActivity.this, "Busque en el Mapa", Toast.LENGTH_LONG);
        toastj.show();
    }


    // public void lanzarAcercadeActivity(View view) {

    //     Intent l = new Intent(MainActivity.this, AcercadeActivity.class);
    //     startActivity(l);
    // }

}

