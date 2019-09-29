package xyz.deonico.banguncalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View view) {
        Intent intent = new Intent(MainActivity.this, persegi.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(MainActivity.this, segitiga.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, lingkaran.class);
        startActivity(intent);
    }

    public void kubus(View view) {
        Intent intent = new Intent(MainActivity.this, kubus.class);
        startActivity(intent);
    }
}
