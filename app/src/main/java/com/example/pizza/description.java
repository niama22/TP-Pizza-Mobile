package com.example.pizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description extends AppCompatActivity {
    private TextView nom,descp,ingr,prepa;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description);
        nom=findViewById(R.id.nom);
        descp=findViewById(R.id.textdesc);
        ingr=findViewById(R.id.textindgr);
        img=findViewById(R.id.imageView);
        prepa=findViewById(R.id.textpreaparation);

        nom.setText(getIntent().getStringExtra("nom"));
        descp.setText(getIntent().getStringExtra("descrption"));
        ingr.setText(getIntent().getStringExtra("ingr"));
        prepa.setText(getIntent().getStringExtra("prepa"));
        int id=getIntent().getIntExtra("Photo",0);
        img.setImageResource(id);


    }
}