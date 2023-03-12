package com.example.coinexchange;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.coinexchange.databinding.ActivityMainBinding;

public class tp extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        final Button usd = findViewById(R.id.usd);
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.Input)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.Output);
                resultAgain.setText(Double.parseDouble(initialAmount) * 0.097 + "");
            }
        });
        final Button eur = findViewById(R.id.eur);
        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.Input)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.Output);
                resultAgain.setText(Double.parseDouble(initialAmount) * 0.091 + "");
            }
        });
        final Button php = findViewById(R.id.php);
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.Input)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.Output);
                resultAgain.setText(Double.parseDouble(initialAmount) * 5.34 + "");
            }
        });

    }


}