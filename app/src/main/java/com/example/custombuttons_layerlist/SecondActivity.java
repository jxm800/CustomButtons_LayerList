package com.example.custombuttons_layerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.tricolorButton).setOnClickListener(this);
        findViewById(R.id.radialButton).setOnClickListener(this);
        findViewById(R.id.calculatorButton).setOnClickListener(this);
        findViewById(R.id.recipeButton).setOnClickListener(this);
        findViewById(R.id.mealsButton).setOnClickListener(this);
        findViewById(R.id.addMealButton).setOnClickListener(this);
        findViewById(R.id.imageBackgroundButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tricolorButton:
                Toast.makeText(getApplicationContext(), "Tricolor button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radialButton:
                Toast.makeText(getApplicationContext(), "Radial button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.calculatorButton:
                Toast.makeText(getApplicationContext(), "Calculator button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.recipeButton:
                Toast.makeText(getApplicationContext(), "Recipe button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mealsButton:
                Toast.makeText(getApplicationContext(), "Meals button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.addMealButton:
                Toast.makeText(getApplicationContext(), "Add Meal button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBackgroundButton:
                Toast.makeText(getApplicationContext(), "Image Background button", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}