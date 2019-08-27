package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtTempo;
    EditText txtVelocidade;
    EditText txtRendimento;
    TextView lblRDistancia;
    TextView lblConsumo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempo = findViewById(R.id.txtTempo);
        txtVelocidade = findViewById(R.id.txtVelocidade);
        txtRendimento = findViewById(R.id.txtRendimento);
        lblRDistancia = findViewById(R.id.lblRdistancia);
        lblConsumo = findViewById(R.id.lblConsumo);
    }

             public void onCalcular (View v){
                 double tg = Double.parseDouble(txtTempo.getText().toString());
                 double vm = Integer.parseInt(txtVelocidade.getText().toString());
                 double rm = Integer.parseInt(txtRendimento.getText().toString());

                double Distancia = tg*vm;
                lblRDistancia.setText(String.valueOf(Distancia));

                double Consumo = Distancia / rm;
                lblConsumo.setText(String.valueOf(Consumo));


    }
}





