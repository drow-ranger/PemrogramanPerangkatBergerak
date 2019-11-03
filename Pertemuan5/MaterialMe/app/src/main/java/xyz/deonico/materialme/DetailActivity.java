package xyz.deonico.materialme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import xyz.deonico.materialme.Model.Sport;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = (TextView)findViewById(R.id.titleDetail);
        ImageView sportsImage = (ImageView)findViewById(R.id.sportsImageDetail);

        Drawable drawable = ContextCompat.getDrawable
                (this,getIntent().getIntExtra(Sport.IMAGE_KEY, 0));

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.GRAY);

        if(drawable!=null) {
            gradientDrawable.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }

        sportsTitle.setText(getIntent().getStringExtra(Sport.TITLE_KEY));

        Glide.with(this).load(getIntent().getIntExtra(Sport.IMAGE_KEY,0))
                .placeholder(gradientDrawable).into(sportsImage);
    }
}
