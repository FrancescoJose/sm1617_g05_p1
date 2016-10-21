package es.ujaen.git.Practica1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Francisco on 25/09/2016.
 */
public class  Autenticado extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticado);

        TextView txtSaludo = (TextView)findViewById(R.id.txtAuth);

        TextView txtPort = (TextView)findViewById(R.id.txtPort);
        Bundle b = this.getIntent().getExtras();
        txtSaludo.setText("Usuario: "+b.getString("Nombre"));
        txtPort.setText("Puerto: "+b.getString("Puerto"));


    }
}
