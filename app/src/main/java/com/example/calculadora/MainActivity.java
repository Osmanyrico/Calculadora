package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.window.OnBackInvokedDispatcher;

public class MainActivity extends AppCompatActivity {
    //Capturar lod edittext
    private EditText n1;
    private EditText n2;
    //textview
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //relacion
        this.n1 = findViewById(R.id.txtNumero1);
        this.n2 = findViewById(R.id.txtNumero2);
        this.resultado  = findViewById(R.id.txtresultado);

    }
    public void onClick(View View){
        //aqui captura los eventos de la vista
        if(View.getId() == R.id.btnSuma){
        resultado.setText("El resultado de la suma es: " + suma());
        } else if (View.getId() ==  R.id.btnRestar) {
            resultado.setText("El resultado de la resta es" + restar());
        }else if (View.getId() ==  R.id.btnMultiplicar) {
            resultado.setText("El resultado de la multiplicacion es" + multiplicar());
        }  else if (View.getId() ==  R.id.btnDividir) {
            resultado.setText("El resultado de la division es" + Dividir());
        }
    }

    //metodo sumar
    public double suma(){
        double resultado = 0;
        resultado =  Double.parseDouble(this.n1.getText().toString().trim()) + Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    //metodo restar
    public double restar(){
        double resultado = 0;
        resultado =  Double.parseDouble(this.n1.getText().toString().trim()) - Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    //metodo multiplicar
    public double multiplicar(){
        double resultado = 0;
        resultado =  Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    //metodo dividir
    public double Dividir(){
        double resultado = 0;
        resultado =  Double.parseDouble(this.n1.getText().toString().trim()) / Double.parseDouble(this.n2.getText().toString().trim());
        return resultado;
    }
    //metodo dividir
    public double dividir(){
        double resultado = 0;
        double numero1 = 0;
        double numero2 = 0;
        numero1 = Double.parseDouble(this.n1.getText().toString().trim());
        numero2 = Double.parseDouble(this.n2.getText().toString().trim());
        if (numero2 == 0){
            Toast.makeText(this, "No es posible dividir un numero entre 0",Toast.LENGTH_LONG).show();
        }else {
            resultado = numero1 / numero2;
        }
        return resultado;
    }
}