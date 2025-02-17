package net.middledleeast.tamm.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import net.middledleeast.tamm.R;
import net.middledleeast.tamm.fragments.TammFamilyFragment;
import net.middledleeast.tamm.sevice.MyService;

import java.util.Date;

public class WelcomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    private Date currentDate;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                Intent intent = new Intent(WelcomeActivity.this, MyService.class);
                startService(intent);
                return null;
            }
        }.execute();





        toolbar = findViewById(R.id.welcome_toolbar);
        setSupportActionBar(toolbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.welcome_container, new TammFamilyFragment())
                .commit();
    }
}
