package xyz.deonico.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class toast extends AppCompatActivity {
    TextView tvCount;
    Button btnCount;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        tvCount = findViewById(R.id.textViewCount);
        btnCount = findViewById(R.id.buttonCount);

        tvCount.setText("0");

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                tvCount.setText(String.valueOf(counter));
                Toast.makeText(getApplicationContext(),
                        "Button clicked count is "+counter,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
