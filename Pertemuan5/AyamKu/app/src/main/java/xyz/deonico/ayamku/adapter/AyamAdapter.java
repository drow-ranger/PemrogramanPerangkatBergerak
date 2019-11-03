package xyz.deonico.ayamku.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.deonico.ayamku.R;
import xyz.deonico.ayamku.model.ResponseAyam;

public class AyamAdapter extends
        RecyclerView.Adapter<AyamAdapter.ViewHolder> {

    private static final String TAG = ResponseAyam.class.getSimpleName();

    private OnItemClickListener mListener;
    private Context context;
    private List<ResponseAyam> list;
    private AdapterCallback mAdapterCallback;

    public AyamAdapter(Context context, List<ResponseAyam> list,
                       AdapterCallback adapterCallback) {
        this.context = context;
        this.list = list;
        this.mAdapterCallback = adapterCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_repo,
                parent, false);
        return new ViewHolder(view, mListener);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ResponseAyam item = list.get(position);

        String base_image_url = "http://toko.deonico.xyz/img/ayam/";
        DateTime dateTime  = DateTime.parse(item.getCreatedAt(), DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

        String id = item.getId();
        String name = item.getName();
        String description = item.getDescription();
        String createdAt = dateTime.toString("dd/MMM/yy hh:mm:ss aa");
        String price = "Rp. " + item.getPrice();
        String url_photo = item.getUrlPhoto();

        Picasso.get().load(base_image_url+url_photo).into(holder.ivPhoto);
        holder.tvName.setText(name);
        holder.tvDescription.setText(description);
        holder.tvCreatedAt.setText(createdAt);
        holder.tvPrice.setText(price);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void clear() {
        int size = this.list.size();
        this.list.clear();
        notifyItemRangeRemoved(0, size);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvDescription)
        TextView tvDescription;
        @BindView(R.id.tvCreatedAt)
        TextView tvCreatedAt;
        @BindView(R.id.tvPrice)
        TextView tvPrice;
        @BindView(R.id.ivPhoto)
        ImageView ivPhoto;

        public ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            ivPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public interface AdapterCallback {
        void onRowClicked(int position);
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
}
