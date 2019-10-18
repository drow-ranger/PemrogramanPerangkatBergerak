package xyz.deonico.latihanmenu.ui.nilai;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import xyz.deonico.latihanmenu.R;

public class NilaiFragment extends Fragment {
    private NilaiViewModel nilaiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        nilaiViewModel =
                ViewModelProviders.of(this).get(NilaiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_nilai, container, false);
        final TextView textView = root.findViewById(R.id.text_nilai);
        nilaiViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final EditText editTextNama = root.findViewById(R.id.editText);
        final EditText editTextNIM = root.findViewById(R.id.editText2);
        final EditText editTextNilaiTugas = root.findViewById(R.id.editText3);
        final EditText editTextNilaiUTS = root.findViewById(R.id.editText4);
        final EditText editTextNilaiUAS = root.findViewById(R.id.editText5);

        final  Button button = root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextNama.getText().toString();
                String nim = editTextNIM.getText().toString();
                String nilaiTugas = editTextNilaiTugas.getText().toString();
                String nilaiUTS = editTextNilaiUTS.getText().toString();
                String nilaiUAS = editTextNilaiUAS.getText().toString();

                Intent intent = new Intent(getActivity(), NilaiHasil.class);
                intent.putExtra("nama",nama);
                intent.putExtra("nim",nim);
                intent.putExtra("nilaiTugas",nilaiTugas);
                intent.putExtra("nilaiUTS",nilaiUTS);
                intent.putExtra("nilaiUAS",nilaiUAS);
                startActivity(intent);

//                float hasil = (Float.parseFloat(nilaiTugas) * 20/100) + (Float.parseFloat(nilaiUTS) * 35/100) + (Float.parseFloat(nilaiUAS) * 45/100);
//
//                if(85 <= hasil && 100 >= hasil) {
//                    nilaiHuruf = "A";
//                    predikat = "Apik";
//                } else if (70 <= hasil && 84 >= hasil) {
//                    nilaiHuruf = "B";
//                    predikat = "Baik";
//                } else if (60 <= hasil && 69 >= hasil) {
//                    nilaiHuruf = "C";
//                    predikat = "Cukup";
//                } else if (40 <= hasil && 59 >= hasil) {
//                    nilaiHuruf = "D";
//                    predikat = "Dablek";
//                } else if (0 <= hasil && 39 >= hasil) {
//                    nilaiHuruf = "E";
//                    predikat = "Elek";
//                }
//
//                Snackbar.make(v, nilaiHuruf, Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        return root;
    }
}
