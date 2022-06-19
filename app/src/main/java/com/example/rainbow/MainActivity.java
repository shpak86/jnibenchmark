package com.example.rainbow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button javaButton = findViewById(R.id.java_button);
        Button cppButton = findViewById(R.id.cpp_button);

        javaButton.setOnClickListener(v -> Executors.newSingleThreadExecutor().submit(() -> {
            System.out.println("Java exec");
            Sorter sorter = new Sorter(65536);
            long duration = sorter.bubble();
            System.out.println("Java run duration: " + duration + "ms");
        }));

        cppButton.setOnClickListener(v -> Executors.newSingleThreadExecutor().submit(() -> {
            System.out.println("C++ exec");
            CppSorter sorter = new CppSorter();
            long duration = sorter.bubble();
            System.out.println("C++ run duration: " + duration + "ms");
        }));
    }
}