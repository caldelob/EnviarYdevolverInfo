package com.example.a03_enviarydevolverinformacin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtPassword;
    private Button btnDescifrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();


        btnDescifrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtPassword.getText().toString();
                Intent intent = new Intent(MainActivity.this, DescifrarActivity.class);
                Bundle bundle = new Bundle();
                //dentro del Bundle entro la info que quiero enviar a otra actividad
                bundle.putString("PASS",password); //"PASS" es el nombre que le ponemos a la String  Key, podemos elegir cualquier nombre, es como si fuera el código
                intent.putExtras(bundle); //aquí carga la info antes de llevársela
                startActivity(intent);
            }
        });
    }

    private void inicializarVistas() {

        txtPassword=  findViewById(R.id.txtPasswordLine); //deberia ser "Main", pero me equivoqué y puse "Line"
        btnDescifrar = findViewById(R.id.btnDescifrarMain);
    }
}