package com.example.harry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class escolha extends AppCompatActivity {
    private TextView resposta;
    private Button btnTreiler, btnMusica;
    private WebView imagens;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        resposta = findViewById(R.id.resposta);
        btnMusica = findViewById(R.id.btnMusica);
        btnTreiler = findViewById(R.id.btnTreiler);
        imagens = findViewById(R.id.imagens);

        String recebe = getIntent().getStringExtra("dados");
        resposta.setText(recebe);

        WebSettings gif = imagens.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/hpgif.gif";
        imagens.loadUrl(caminho);

        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMusica();
            }
        });
        btnTreiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTreiler();
            }
        });
        
    }

    public void abrirMusica() {
        Intent janelaM = new Intent(this, som.class);
        startActivity(janelaM);
    }
    public void abrirTreiler() {
        Intent janelaT = new Intent(this, teaser.class);
        startActivity(janelaT);
    }
}