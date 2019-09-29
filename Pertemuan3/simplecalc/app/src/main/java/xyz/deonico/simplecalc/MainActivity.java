package xyz.deonico.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        final TextView textView = (TextView)findViewById(R.id.textView);

        Button button = (Button)findViewById(R.id.button);
        Button button1 = (Button)findViewById(R.id.button2);
        Button button2 = (Button)findViewById(R.id.button3);
        Button button3 = (Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();

                if(TextUtils.isEmpty(n1) && TextUtils.isEmpty(n2))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi penjumlahan berhasil", Toast.LENGTH_LONG).show();
                    int hasil = Integer.parseInt(n1) + Integer.parseInt(n2);
                    textView.setText(String.valueOf("= " + hasil));
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();

                if(TextUtils.isEmpty(n1) && TextUtils.isEmpty(n2))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi pengurangan berhasil", Toast.LENGTH_LONG).show();
                    int hasil = Integer.parseInt(n1) - Integer.parseInt(n2);
                    textView.setText(String.valueOf("= " + hasil));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();

                if(TextUtils.isEmpty(n1) && TextUtils.isEmpty(n2))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi pembagian berhasil", Toast.LENGTH_LONG).show();
                    int hasil = Integer.parseInt(n1) / Integer.parseInt(n2);
                    textView.setText(String.valueOf("= " + hasil));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();

                if(TextUtils.isEmpty(n1) && TextUtils.isEmpty(n2))
                {
                    Toast.makeText(getApplicationContext(), "nilai yang dihitung kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Operasi perkalian berhasil", Toast.LENGTH_LONG).show();
                    int hasil = Integer.parseInt(n1) * Integer.parseInt(n2);
                    textView.setText(String.valueOf("= " + hasil));
                }
            }
        });
    }
}
