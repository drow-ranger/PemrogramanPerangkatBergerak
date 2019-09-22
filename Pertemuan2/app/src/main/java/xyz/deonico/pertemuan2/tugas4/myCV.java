package xyz.deonico.pertemuan2.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import xyz.deonico.pertemuan2.R;

public class myCV extends AppCompatActivity {

    TextView mTextViewNIM;
    TextView mTextViewNama;
    TextView mTextViewAlamat;
    TextView mTextViewTelepon;
    TextView mTextViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cv);

        Intent intent=getIntent();
        ArrayList<String> dataCV = intent.getStringArrayListExtra("dataCV");

        mTextViewNIM = (TextView)findViewById(R.id.tvNIM);
        mTextViewNama = (TextView)findViewById(R.id.tvNama);
        mTextViewAlamat = (TextView)findViewById(R.id.tvAlamat);
        mTextViewTelepon = (TextView)findViewById(R.id.tvTelepon);
        mTextViewEmail = (TextView)findViewById(R.id.tvEmail);

        mTextViewNIM.setText(dataCV.get(0));
        mTextViewNama.setText(dataCV.get(1));
        mTextViewAlamat.setText(dataCV.get(2));
        mTextViewTelepon.setText(dataCV.get(3));
        mTextViewEmail.setText(dataCV.get(4));

        ImageView image = (ImageView)findViewById(R.id.ivProfilePhoto);
        image.setImageResource(R.drawable.photo);
    }

}
