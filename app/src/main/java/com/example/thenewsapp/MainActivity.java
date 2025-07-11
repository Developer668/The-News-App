package com.example.thenewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> newsCompanyNames = new ArrayList<>();

    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, newsCompanyNames);

        listView.setAdapter(arrayAdapter);

        newsCompanyNames.add("Times of India");

        newsCompanyNames.add("BBC news");

        newsCompanyNames.add("Hindustan Times");

        newsCompanyNames.add("India Today");

        newsCompanyNames.add("CNN news");

        newsCompanyNames.add("NDTV news");

        arrayAdapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Activity2.class);

                intent.putExtra("newsCompanyNames", position);

                startActivity(intent);

            }
        });

    }
}