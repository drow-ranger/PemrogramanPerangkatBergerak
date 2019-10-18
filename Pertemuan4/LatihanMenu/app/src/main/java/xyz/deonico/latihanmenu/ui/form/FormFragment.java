package xyz.deonico.latihanmenu.ui.form;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.snackbar.Snackbar;

import xyz.deonico.latihanmenu.MainActivity;
import xyz.deonico.latihanmenu.R;

public class FormFragment extends Fragment {
    private FormViewModel formViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        formViewModel =
                ViewModelProviders.of(this).get(FormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_form, container, false);
        final TextView textView = root.findViewById(R.id.text_form);
        formViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final Button button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("ALERT");
                alert.setMessage("Yakin Data Disimpan?");
                alert.setPositiveButton("OK", null);
                alert.setNegativeButton("Cancel", null);

                alert.show();
            }
        });

        return root;
    }
}
