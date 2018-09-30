package br.com.home.bancodedados;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Inicial extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        //Setar Atributos
        Button botao = (Button) findViewById(R.id.button);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText titulo = (EditText) findViewById(R.id.editText);
                EditText autor = (EditText) findViewById((R.id.editText2));
                EditText editora = (EditText) findViewById(R.id.editText3);
                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String resultado;

                resultado = crud.insereDado(tituloString, autorString, editoraString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}