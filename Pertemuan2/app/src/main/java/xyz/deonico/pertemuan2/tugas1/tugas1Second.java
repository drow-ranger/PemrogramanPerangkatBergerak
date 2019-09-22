package xyz.deonico.pertemuan2.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import xyz.deonico.pertemuan2.R;

public class tugas1Second extends AppCompatActivity {

    TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_second);

        mTextview = (TextView)findViewById(R.id.textView);

        mTextview.setText(getIntent().getStringExtra("sendText"));
    }
}
