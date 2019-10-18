package xyz.deonico.latihanmenu.ui.nilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import xyz.deonico.latihanmenu.R;

public class NilaiHasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai_hasil);

        TextView mTextviewNama = (TextView) findViewById(R.id.textViewNama);
        TextView mTextviewNIM = (TextView) findViewById(R.id.textViewNIM);
        TextView mTextviewNilaiTugas = (TextView) findViewById(R.id.textViewNilaiTugas);
        TextView mTextviewNilaiUTS = (TextView) findViewById(R.id.textViewNilaiUTS);
        TextView mTextviewNilaiUAS = (TextView) findViewById(R.id.textViewNilaiUAS);

        mTextviewNama.setText(getIntent().getStringExtra("nama"));
        mTextviewNIM.setText(getIntent().getStringExtra("nim"));
        mTextviewNilaiTugas.setText(getIntent().getStringExtra("nilaiTugas") +
                " * 20%");
        mTextviewNilaiUTS.setText(getIntent().getStringExtra("nilaiUTS") +
                " * 35%");
        mTextviewNilaiUAS.setText(getIntent().getStringExtra("nilaiUAS") +
                " * 45%");

        String nilaiHuruf = "A";
        String predikat = "Apik";
        float hasil = (Float.parseFloat(getIntent().getStringExtra("nilaiTugas")) * 20/100) +
                (Float.parseFloat(getIntent().getStringExtra("nilaiUTS")) * 35/100) +
                (Float.parseFloat(getIntent().getStringExtra("nilaiUAS")) * 45/100);

        if(85 <= hasil && 100 >= hasil) {
            nilaiHuruf = "A";
            predikat = "Apik";
        } else if (70 <= hasil && 84 >= hasil) {
            nilaiHuruf = "B";
            predikat = "Baik";
        } else if (60 <= hasil && 69 >= hasil) {
            nilaiHuruf = "C";
            predikat = "Cukup";
        } else if (40 <= hasil && 59 >= hasil) {
            nilaiHuruf = "D";
            predikat = "Dablek";
        } else if (0 <= hasil && 39 >= hasil) {
            nilaiHuruf = "E";
            predikat = "Elek";
        }

        TextView mTextviewNilaiAkhir = (TextView) findViewById(R.id.textViewNilaiAkhir);
        TextView mTextviewNilaiHuruf = (TextView) findViewById(R.id.textViewNilaiHuruf);
        TextView mTextviewPredikat = (TextView) findViewById(R.id.textViewPredikat);

        mTextviewNilaiAkhir.setText(String.valueOf(hasil));
        mTextviewNilaiHuruf.setText(nilaiHuruf);
        mTextviewPredikat.setText(predikat);
    }
}
