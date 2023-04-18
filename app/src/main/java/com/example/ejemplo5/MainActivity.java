package com.example.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.txt_primerNumero);
        et2 = (EditText) findViewById(R.id.txt_segundoNumero);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        rb1 = (RadioButton) findViewById(R.id.rb_multiplicar);
        rb2 = (RadioButton) findViewById(R.id.rb_dividir);
        rb3 = (RadioButton) findViewById(R.id.rb_sumar);
        rb4 = (RadioButton) findViewById(R.id.rb_restar);
    }
    public void Calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1);
        int valor2_int = Integer.parseInt(valor2);

        if(rb1.isChecked() == true){

            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);
        }
        if(rb3.isChecked() == true){

            int sumar = valor1_int + valor2_int;
            String resultado = String.valueOf(sumar);
            tv1.setText(resultado);
        }
        if(rb4.isChecked() == true){

            int restar = valor1_int - valor2_int;
            String resultado = String.valueOf(restar);
            tv1.setText(resultado);
        }
        if (rb2.isChecked() == true) {
            if (valor2_int != 0) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                tv1.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor tiene que ser distinto de 0", Toast.LENGTH_SHORT).show();
            }
        }
    }
}