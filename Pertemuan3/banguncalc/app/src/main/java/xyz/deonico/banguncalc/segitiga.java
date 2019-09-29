package xyz.deonico.banguncalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);

        Button button = (Button)findViewById(R.id.button);

        final TextView textView4 = (TextView)findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();

                if(TextUtils.isEmpty(n1))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi menghitung luas berhasil", Toast.LENGTH_LONG).show();
                    float hasil = Float.parseFloat(n1) * Float.parseFloat(n2) * 1/2;
                    textView4.setText(String.valueOf("= " + hasil));
                }
            }
        });
    }
}
