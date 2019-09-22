package xyz.deonico.pertemuan1;

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

    public void clickHelloWorld(View view) {
        Intent intent = new Intent(MainActivity.this, helloworld.class);
        startActivity(intent);
    }

    public void clickToast(View view) {
        Intent intent = new Intent(MainActivity.this, toast.class);
        startActivity(intent);
    }

    public void clickInformation(View view) {
        Intent intent = new Intent(MainActivity.this, information.class);
        startActivity(intent);
    }

    public void clickScrolling(View view) {
        Intent intent = new Intent(MainActivity.this, scrollingtext.class);
        startActivity(intent);
    }
}
