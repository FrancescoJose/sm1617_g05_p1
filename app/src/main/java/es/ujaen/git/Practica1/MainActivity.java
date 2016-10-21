package es.ujaen.git.Practica1;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        android.support.v4.app.Fragment f = fm.findFragmentById(R.id.main_frame);


        //Guardamos los datos para no perderlos cuando cambia la configuracion
        if(f==null){
            AuthFragment au = AuthFragment.newInstance("Juan","12345","6000");
            //Se añade el fragmento a la vista
            ft.add(R.id.main_frame,au);
            //Se añade a la pila de procesos
            ft.addToBackStack(null);


        }


        ft.commit();



    }


    public void ejecutar_info (View view){
        Intent in = new Intent(this,InfoClase.class);

        startActivity(in);

    }



    public void Autenticacion(View view){

        final EditText txtNombre = (EditText)findViewById(R.id.user2);
        final EditText txtContra = (EditText)findViewById(R.id.pass);
        final EditText txtPuerto = (EditText)findViewById(R.id.puerto);

        Intent i = new Intent(this, Autenticado.class);
        i.putExtra("Nombre", txtNombre.getText().toString());
        i.putExtra("Contraseña", txtContra.getText().toString());
        i.putExtra("Puerto",txtPuerto.getText().toString());
        i.setClass(MainActivity.this,Autenticado.class);
        startActivity(i);



    }






}
