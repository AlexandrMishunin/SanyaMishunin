package com.example.sanyamishunin;
//AlexandrMishunin

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(3, "Barsik", "Simple", "black");
        myCat.talk();

        Cat murzik = new Cat(4, "Murzik", "Markeloff", "white");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "Zeus";
        glasha.color = "brown";
        glasha.talk();
    }
}