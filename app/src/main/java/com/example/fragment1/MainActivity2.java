package com.example.fragment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends FragmentActivity implements View.OnClickListener {

    Button home, about, contact, galeri;

    HomeFragment Fragmenthome;
    Tentang Fragmentabout;
    Kontak Fragmentcontact;
    Galeri Fragmentgaleri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        home = findViewById(R.id.home);
        about = findViewById(R.id.about);
        contact = findViewById(R.id.contact);
        galeri = findViewById(R.id.galeri);

        home.setOnClickListener(this);
        about.setOnClickListener(this);
        contact.setOnClickListener(this);
        galeri.setOnClickListener(this);
    }

    void menuHome() {
        Fragmenthome = new HomeFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Fragmenthome);
        ft.commit();
    }

    void menuAbout() {
        Fragmentabout = new Tentang();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Fragmentabout);
        ft.commit();
    }

    void menuContact() {
        Fragmentcontact = new Kontak();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Fragmentcontact);
        ft.commit();
    }

    void menuGaleri() {
        Fragmentgaleri = new Galeri();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, Fragmentgaleri);
        ft.commit();
    }

    @Override
    public void onClick(View v) {

        if (v == home) {
            menuHome();
        }
        if (v == about) {
            menuAbout();
        }
        if (v == contact) {
            menuContact();
        }
        if (v == galeri) {
            menuGaleri();
        }

    }
}