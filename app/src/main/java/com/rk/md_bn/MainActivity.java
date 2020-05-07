package com.rk.md_bn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView BNV_1_IDJAVA;
    TextView TV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BNV_1_IDJAVA = findViewById(R.id.BNV_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);

        BNV_1_IDJAVA.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.Menu_1_IDXML:
                        TV_1_IDJAVA.setText("Chat");
                        break;
                    case R.id.Menu_2_IDXML:
                        TV_1_IDJAVA.setText("Kontak");
                        break;
                    case R.id.Menu_3_IDXML:
                        TV_1_IDJAVA.setText("Penyimpanan");
                        break;
                }
                return true;
            }
        });

    }
}
