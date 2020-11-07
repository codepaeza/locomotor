package com.paez.edwin.locomotor;

/**
 * Created by PC on 17/03/2018.
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

public class ListaUnoActivity extends Activity {

    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_uno);

        this.listView1 = (ListView) findViewById(R.id.listView1);


        List items = new ArrayList();
        items.add(new ListaUno(R.drawable.ic_arquitectonico, "Sitios Interés Histórico y Arquitectónico",
                ""));
        items.add(new ListaUno(R.drawable.ic_cultural, "Sitios Interés Cultural",
                ""));
        items.add(new ListaUno(R.drawable.ic_natural, "Atractivo Natural",
                ""));
        items.add(new ListaUno(R.drawable.ic_recreativo, "Turismo Recreativo",
                ""));
        items.add(new ListaUno(R.drawable.ic_restaurante, "Restaurantes y Comidas",
                ""));
        items.add(new ListaUno(R.drawable.ic_hotel, "Hospedaje",
                ""));
        items.add(new ListaUno(R.drawable.ic_taxi,
                "Transporte", ""));
        items.add(new ListaUno(R.drawable.ic_medicos,
                "Servicios Médicos", ""));
        items.add(new ListaUno(R.drawable.ic_emergencia,
                "Emergencias", ""));


        // Sets the data behind this ListView
        this.listView1.setAdapter(new ListaUnoAdapter(this, items));



        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView1.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(ListaUnoActivity.this, ListaDosActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(ListaUnoActivity.this, ListaTresActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                      //  Intent intent12 = new Intent(MenuUnoActivity.this, ListaFugazzaActivity.class);
                       // startActivity(intent12);
                    Toast toast3 =
                            Toast.makeText(ListaUnoActivity.this, "Atractivos Naturales de Girardot", Toast.LENGTH_LONG);
                    toast3.show();
                       break;
                   case 3:
                      //  Intent intent13 = new Intent(MenuUnoActivity.this, ListaGarlicActivity.class);
                       // startActivity(intent13);
                       Toast toast4 =
                               Toast.makeText(ListaUnoActivity.this, "Turismo Recreativo en Girardot", Toast.LENGTH_LONG);
                       toast4.show();
                      break;

                   case 4:
                     //   Intent intent14 = new Intent(MenuUnoActivity.this, ListaHamburguesaActivity.class);
                      //  startActivity(intent14);
                       Toast toast5 =
                               Toast.makeText(ListaUnoActivity.this, "Restaurantes y Comidas en Girardot", Toast.LENGTH_LONG);
                       toast5.show();
                      break;
                    case 5:
                     //   Intent intent15 = new Intent(MenuUnoActivity.this, ListaPapasActivity.class);
                     //   startActivity(intent15);
                        Toast toast6 =
                                Toast.makeText(ListaUnoActivity.this, "Hospedaje en Girardot", Toast.LENGTH_LONG);
                        toast6.show();
                        break;
                    case 6:
                     //   Intent intent16 = new Intent(MenuUnoActivity.this, ListaSandwichActivity.class);
                    //    startActivity(intent16);
                        Toast toast7 =
                                Toast.makeText(ListaUnoActivity.this, "Transporte en Girardot", Toast.LENGTH_LONG);
                        toast7.show();
                        break;
                    case 7:
                    //    Intent intent17 = new Intent(MenuUnoActivity.this, ListaCarnesActivity.class);
                     //   startActivity(intent17);
                        Toast toast8 =
                                Toast.makeText(ListaUnoActivity.this, "Servicios Médicos en Girardot", Toast.LENGTH_LONG);
                        toast8.show();
                        break;
                    case 8:
                   //     Intent intent18 = new Intent(MenuUnoActivity.this, ListaAlbondigasActivity.class);
                    //    startActivity(intent18);
                        Toast toast9 =
                                Toast.makeText(ListaUnoActivity.this, "Atención Emergencias en Girardot", Toast.LENGTH_LONG);
                        toast9.show();
                        break;
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