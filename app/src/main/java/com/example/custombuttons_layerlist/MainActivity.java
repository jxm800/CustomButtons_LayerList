package com.example.custombuttons_layerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageButton).setOnClickListener(this);
        findViewById(R.id.colorBackgroundButton).setOnClickListener(this);
        findViewById(R.id.drawableTopButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                Toast.makeText(getApplicationContext(), "ImageButton", Toast.LENGTH_SHORT).show();
                break;
            case R.id.colorBackgroundButton:
                Toast.makeText(getApplicationContext(), "Color Background button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.drawableTopButton:
                Toast.makeText(getApplicationContext(), "DrawableTop button", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    public void toSecond(View view) {
        Intent mainViewIntent = new Intent(this, SecondActivity.class);
        startActivity(mainViewIntent);
    }

    public void toThird(View view) {
        Intent mainViewIntent = new Intent(this, ThirdActivity.class);
        startActivity(mainViewIntent);
    }
}