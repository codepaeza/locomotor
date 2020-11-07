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

public class ListaTresActivity extends Activity {

    private ListView listView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_tres);

        this.listView3 = (ListView) findViewById(R.id.listView3);


        List items = new ArrayList();
        items.add(new ListaTres(R.drawable.ic_cultural, "Parque Bolívar",
                ""));
        items.add(new ListaTres(R.drawable.ic_cultural, "Catedral Inmaculado Corazón de María",
                ""));
        items.add(new ListaTres(R.drawable.ic_cultural, "Biblioteca Banco de la República",
                ""));
        items.add(new ListaTres(R.drawable.ic_cultural, "Iglesia San Miguel Arcángel",
                ""));
        items.add(new ListaTres(R.drawable.ic_cultural, "Monumento El Boga",
                ""));
        items.add(new ListaTres(R.drawable.ic_cultural, "Monumento El León",
                ""));



        // Sets the data behind this ListView
        this.listView3.setAdapter(new ListaTresAdapter(this, items));




        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView3.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent101 = new Intent(ListaTresActivity.this, ParqueBolivarActivity.class);
                        startActivity(intent101);
                        break;
                    case 1:
                        Intent intent102 = new Intent(ListaTresActivity.this, CatedralActivity.class);
                       startActivity(intent102);

                        break;
                    case 2:
                        Intent intent103 = new Intent(ListaTresActivity.this, BanrepActivity.class);
                      startActivity(intent103);
                        //Toast toast53 =
                        //   Toast.makeText(ListaDosActivity.this, "Estación Tren", Toast.LENGTH_LONG);
                        // toast53.show();
                        break;
                    case 3:
                        Intent intent104 = new Intent(ListaTresActivity.this, IglesiaSanmiguelActivity.class);
                       startActivity(intent104);
                        //Toast toast54 =
                        //       Toast.makeText(ListaDosActivity.this, "Puente Férreo", Toast.LENGTH_LONG);
                        //toast54.show();
                        break;

                    case 4:
                        Intent intent105 = new Intent(ListaTresActivity.this, MonumBogaActivity.class);
                        startActivity(intent105);
                        //Toast toast55 =
                        //       Toast.makeText(ListaDosActivity.this, "Puente Ospina Pérez", Toast.LENGTH_LONG);
                        //toast55.show();
                        break;
                    case 5:
                       Intent intent106 = new Intent(ListaTresActivity.this, MonumLeonActivity.class);
                        startActivity(intent106);
                        // Toast toast56 =
                        //       Toast.makeText(ListaDosActivity.this, "Camellón del Comercio", Toast.LENGTH_LONG);
                        //toast56.show();
                        break;
                    case 6:
                        //   Intent intent16 = new Intent(MenuUnoActivity.this, ListaSandwichActivity.class);
                        //    startActivity(intent16);
                      //  Toast toast57 =
                          //      Toast.makeText(ListaDosActivity.this, "Plaza de Mercado", Toast.LENGTH_LONG);
                       // toast57.show();
                      //  break;
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