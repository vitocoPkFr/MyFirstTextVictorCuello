package com.example.myfirsttextvictorcuello;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast
        public class MainActivity<view> extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onclick (View,view){
        Toast toast = Toast.makeText(this, "Toast Simple", Toast.LENGTH_LONG);
        toast.show();
    }
