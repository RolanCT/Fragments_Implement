package com.example.fragments_implement;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button firstFragmentbtn,secondFragmetbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragmentbtn= findViewById(R.id.fragment1btn);
        secondFragmetbtn=findViewById(R.id.fragmnet2btn);

        firstFragmentbtn.setOnClickListener(v -> replaceFragment(new Fragment1()));

        secondFragmetbtn.setOnClickListener(v -> replaceFragment(new Fragment2()));



    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }


}