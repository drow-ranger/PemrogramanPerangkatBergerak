package xyz.deonico.materialme.Model;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.DrawableRes;

import xyz.deonico.materialme.DetailActivity;

public class Sport {
    private final String title;
    private final String info;
    private final int imageResource;

    public static final String TITLE_KEY = "Title";
    public static final String IMAGE_KEY = "Image Resource";

    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    public static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);
        return detailIntent;
    }
}
