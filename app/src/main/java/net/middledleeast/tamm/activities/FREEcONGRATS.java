package net.middledleeast.tamm.activities;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import net.middledleeast.tamm.R;

public class FREEcONGRATS extends AppCompatActivity {

    Button button;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.free_congrats);

    button = findViewById(R.id.continueTo);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(FREEcONGRATS.this , RenewAccount.class));


        }
    });


    }
}
