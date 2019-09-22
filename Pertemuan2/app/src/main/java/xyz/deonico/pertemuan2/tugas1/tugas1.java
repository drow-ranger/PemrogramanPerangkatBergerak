package xyz.deonico.pertemuan2.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import xyz.deonico.pertemuan2.R;

public class tugas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);
    }

    public void send(View view) {
        Intent intent = new Intent(tugas1.this, tugas1Second.class);
        intent.putExtra("sendText","Pesan Diterima Lurd");
        startActivity(intent);
    }
}
