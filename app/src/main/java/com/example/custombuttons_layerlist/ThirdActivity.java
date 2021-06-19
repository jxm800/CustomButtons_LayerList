package com.example.custombuttons_layerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    Button disablebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        disablebtn = findViewById(R.id.disableButton);

        findViewById(R.id.CircleButton).setOnClickListener(this);
        findViewById(R.id.URButton).setOnClickListener(this);
        findViewById(R.id.DRButton).setOnClickListener(this);
        findViewById(R.id.ULButton).setOnClickListener(this);
        findViewById(R.id.DLButton).setOnClickListener(this);
        findViewById(R.id.gamesButton).setOnClickListener(this);
        findViewById(R.id.shopButton).setOnClickListener(this);
        findViewById(R.id.disableButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CircleButton:
                Toast.makeText(getApplicationContext(), "Circle button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.URButton:
                Toast.makeText(getApplicationContext(), "Food button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.DRButton:
                Toast.makeText(getApplicationContext(), "Add Meal button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ULButton:
                Toast.makeText(getApplicationContext(), "Recipe button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.DLButton:
                Toast.makeText(getApplicationContext(), "Meals button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBackgroundButton:
                Toast.makeText(getApplicationContext(), "Fingerprint button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.gamesButton:
                Toast.makeText(getApplicationContext(), "Games button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shopButton:
                Toast.makeText(getApplicationContext(), "Shop button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.disableButton:
                disableFunction();
                break;
            default:
                break;
        }
    }

    private void disableFunction() {
        disablebtn.setEnabled(false);
        disablebtn.setBackgroundResource(R.drawable.basicdisabled_shape);
        Toast.makeText(getApplicationContext(), "Button disabled", Toast.LENGTH_SHORT).show();

        new CountDownTimer(2000, 2000) {
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                disablebtn.setEnabled(true);
                disablebtn.setBackgroundResource(R.drawable.basicenabled_shape);
            }
        }.start();
    }
}