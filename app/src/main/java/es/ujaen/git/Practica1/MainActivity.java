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
        AuthFragment au = AuthFragment.newInstance("Juan","12345","6000");
        ft.add(R.id.main_frame,au);
        ft.addToBackStack(null);
        ft.commit();



    }

    //private String user;
    //private String pass;

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
