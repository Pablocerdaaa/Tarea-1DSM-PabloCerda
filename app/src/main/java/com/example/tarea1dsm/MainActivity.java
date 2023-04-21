package com.example.tarea1dsm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class MainActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private Button boton;
    private ListView lista;
    private EditText editTexto;
    private ArrayList<String> listaArray = new ArrayList<String>();
    private ArrayAdapter<String> adapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.enterBtn);
        boton.setOnClickListener(this);
        lista = findViewById(R.id.listView);
        lista.setOnItemClickListener(this);
        editTexto = findViewById(R.id.enterTxt);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enterBtn:
                String texto = editTexto.getText().toString().trim();
                listaArray.add(texto);
                editTexto.getText().clear();
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaArray);
                lista.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

    }
}
