package com.example.myapp_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ET1, ET2;
    private TextView TV1;
    private RadioButton RB1, RB2,RB3,RB4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = (EditText)findViewById(R.id.Primer_número);
        ET2 = (EditText)findViewById(R.id.Segundo_número);
        TV1 = (TextView)findViewById(R.id.Resultado);
        RB1 = (RadioButton)findViewById(R.id.radioButton3);
        RB2 = (RadioButton)findViewById(R.id.radioButton4);
        RB3 = (RadioButton)findViewById(R.id.radioButton);
        RB4 = (RadioButton)findViewById(R.id.radioButton2);
    }

    //Método para el boton OBTENER
    public void Calcular (View ver) {
        String valor1_string = ET1.getText().toString();
        String valor2_string = ET2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if(RB1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            TV1 . setText(resultado);
        } else if(RB2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            TV1 . setText(resultado);
        } else if(RB3.isChecked() ==true) {
            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            TV1 . setText(resultado);
        } else if(RB4.isChecked() ==true) {

            if (valor2_int != 0) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                TV1.setText(resultado);
            } else {
                Toast.makeText(this, "la segunda cantidad debe ser mayor a cero", Toast.LENGTH_LONG) . show();
            }
        }
    }

}