package com.example.appsmanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_entrar;
    EditText edt_login, edt_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        edt_login = (EditText) findViewById(R.id.edt_login);
        edt_senha = (EditText) findViewById(R.id.edt_senha);
        btn_entrar = (Button) findViewById(R.id.btn_entrar);

    }

    public void valida (View view){
        if (edt_login.equals("admin")&& edt_senha.equals("admin")){
            startActivity(new Intent(MainActivity.this, Tela_Principal.class));
        }
        else
            Toast.makeText(this, "usuário ou senha inválido", Toast.LENGTH_LONG).show();
    }
}
