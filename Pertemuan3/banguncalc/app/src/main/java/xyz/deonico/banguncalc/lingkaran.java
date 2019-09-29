package xyz.deonico.banguncalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        final EditText editText = (EditText)findViewById(R.id.editText);

        Button button = (Button)findViewById(R.id.button);

        final TextView textView3 = (TextView)findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();

                if(TextUtils.isEmpty(n1))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi menghitung luas berhasil", Toast.LENGTH_LONG).show();
                    float hasil = Float.parseFloat(n1) * Float.parseFloat(n1) * 22/7;
                    textView3.setText(String.valueOf("= " + hasil));
                }
            }
        });
    }
}
