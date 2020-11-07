package com.paez.edwin.locomotor;

/**
 * Created by PC on 18/03/2018.
 */


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListaDosActivity extends Activity {

    private ListView listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_dos);

        this.listView2 = (ListView) findViewById(R.id.listView2);


        List items = new ArrayList();
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Monumento Locomotora",
                ""));
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Casa de la Cultura",
                ""));
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Puente Férreo",
                ""));
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Puente Ospina Pérez",
                ""));
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Camellón del Comercio",
                ""));
        items.add(new ListaDos(R.drawable.ic_arquitectonico, "Plaza de Mercado",
                ""));



        // Sets the data behind this ListView
        this.listView2.setAdapter(new ListaDosAdapter(this, items));



        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView2.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent51 = new Intent(ListaDosActivity.this, LocomotoraActivity.class);
                        startActivity(intent51);
                        break;
                    case 1:
                       Intent intent52 = new Intent(ListaDosActivity.this, EstacionTrenActivity.class);
                        startActivity(intent52);

                        break;
                    case 2:
                        Intent intent53 = new Intent(ListaDosActivity.this, PuenteFerreoActivity.class);
                        startActivity(intent53);
                        //Toast toast53 =
                             //   Toast.makeText(ListaDosActivity.this, "Estación Tren", Toast.LENGTH_LONG);
                       // toast53.show();
                        break;
                    case 3:
                        Intent intent54 = new Intent(ListaDosActivity.this, PuenteOspinaActivity.class);
                         startActivity(intent54);
                        //Toast toast54 =
                         //       Toast.makeText(ListaDosActivity.this, "Puente Férreo", Toast.LENGTH_LONG);
                        //toast54.show();
                        break;

                    case 4:
                        Intent intent55 = new Intent(ListaDosActivity.this, CamellonComercioActivity.class);
                        startActivity(intent55);
                        //Toast toast55 =
                         //       Toast.makeText(ListaDosActivity.this, "Puente Ospina Pérez", Toast.LENGTH_LONG);
                       //toast55.show();
                        break;
                    case 5:
                        Intent intent56 = new Intent(ListaDosActivity.this, PlazaMercadoActivity.class);
                        startActivity(intent56);
                       // Toast toast56 =
                         //       Toast.makeText(ListaDosActivity.this, "Camellón del Comercio", Toast.LENGTH_LONG);
                        //toast56.show();
                        break;
                    case 6:
                        //   Intent intent16 = new Intent(MenuUnoActivity.this, ListaSandwichActivity.class);
                        //    startActivity(intent16);
                        Toast toast57 =
                                Toast.makeText(ListaDosActivity.this, "Plaza de Mercado", Toast.LENGTH_LONG);
                        toast57.show();
                        break;
                    //case 7:
                        //    Intent intent17 = new Intent(MenuUnoActivity.this, ListaCarnesActivity.class);
                        //   startActivity(intent17);
                        //Toast toast8 =
                        //        Toast.makeText(ListaUnoActivity.this, "Servicios Médicos en Girardot", Toast.LENGTH_LONG);
                       // toast8.show();
                       // break;
                   // case 8:
                        //     Intent intent18 = new Intent(MenuUnoActivity.this, ListaAlbondigasActivity.class);
                        //    startActivity(intent18);
                      //  Toast toast9 =
                       //         Toast.makeText(ListaUnoActivity.this, "Atención Emergencias en Girardot", Toast.LENGTH_LONG);
                        //toast9.show();
                        //break;
                    //case 9:
                    //   Intent intent19 = new Intent(MenuUnoActivity.this, ListaPastaActivity.class);
                    //    startActivity(intent19);
                    //    break;
                    // case 10:
                    //    Intent intent20 = new Intent(MenuUnoActivity.this, ListaPerroActivity.class);
                    //    startActivity(intent20);
                    //   break;
                    // case 11:
                    //    Intent intent21 = new Intent(MenuUnoActivity.this, ListaChileActivity.class);
                    //     startActivity(intent21);
                    //    break;
                }
            }



        });
    }

}