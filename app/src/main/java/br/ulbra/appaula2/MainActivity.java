package br.ulbra.appaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edtEvento, edtValorTotal, edtQuantPessoas;

    Button btnCalcular;
    TextView txtResultado;

    String evento;
    double valorTotal, quantPessoas, valor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEvento = (EditText)findViewById(R.id.edtEvento);
        edtValorTotal = (EditText)findViewById(R.id.edtValorTotal);
        edtQuantPessoas = (EditText)findViewById(R.id.edtQuantPessoas);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                evento = edtEvento.getText().toString();
                valorTotal = Double.parseDouble(edtValorTotal.getText().toString());
                quantPessoas = Double.parseDouble(edtQuantPessoas.getText().toString());

                if(quantPessoas == 0 || quantPessoas < -1){
                    txtResultado.setText("Valor inválido");
                }else{
                    valor = valorTotal/quantPessoas;
                    txtResultado.setText("Resultado: O " + evento + " rachado entre " + quantPessoas + " pessoas no valor de R$" + valorTotal + " vai dar para cada pessoa o valor de: R$" + valor);
                }

            }
        });
    }
}