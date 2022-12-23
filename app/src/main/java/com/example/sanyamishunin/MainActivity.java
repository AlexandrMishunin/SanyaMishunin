package com.example.sanyamishunin;
//AlexandrMishunin

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat32 = new Cat(1, "Simple");
        cat32.talk();
        Cat cat33 = new Cat(5, "Markeloff");
        cat33.talk();
        Cat cat34 = new Cat(8, "Zeus");
        cat34.talk();

    }

}