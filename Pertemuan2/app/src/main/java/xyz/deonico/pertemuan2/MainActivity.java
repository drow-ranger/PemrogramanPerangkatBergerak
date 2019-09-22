package xyz.deonico.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import xyz.deonico.pertemuan2.tugas1.tugas1;
import xyz.deonico.pertemuan2.tugas2.implicitIntents;
import xyz.deonico.pertemuan2.tugas3.lifecycleCallbackTwoActivities;
import xyz.deonico.pertemuan2.tugas4.myCV;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tugas1(View view) {
        Intent intent = new Intent(MainActivity.this, tugas1.class);
        startActivity(intent);
    }

    public void tugas2(View view) {
        Intent intent = new Intent(MainActivity.this, implicitIntents.class);
        startActivity(intent);
    }

    public void tugas3(View view) {
        Intent intent = new Intent(MainActivity.this, lifecycleCallbackTwoActivities.class);
        startActivity(intent);
    }

    public void tugas4(View view) {
        List<String> dataCV = new ArrayList<String>();
        dataCV.add("A11.2017.10530");
        dataCV.add("Deo Fibrianico");
        dataCV.add("Semarang");
        dataCV.add("085640510412");
        dataCV.add("nico26deo@gmail.com");
        dataCV.add("photo.JPG");

        Intent intent = new Intent(MainActivity.this, myCV.class);
        intent.putStringArrayListExtra("dataCV", (ArrayList<String>) dataCV);
        startActivity(intent);
    }

}
