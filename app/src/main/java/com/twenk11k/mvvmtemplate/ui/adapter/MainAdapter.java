package com.twenk11k.mvvmtemplate.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.twenk11k.mvvmtemplate.R;
import com.twenk11k.mvvmtemplate.data.model.Photo;
import com.twenk11k.mvvmtemplate.utils.StringUtils;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Photo> photoList;

    public MainAdapter(Context context, List<Photo> photoList) {
        this.context = context;
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder;

        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo, parent, false);
        viewHolder = new MainAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;

        Photo photo = photoList.get(position);
        String url = StringUtils.getPhotoUrl(photo.getFarm(), photo.getServer(), photo.getId(), photo.getSecret());
        Glide.with(context)
                .load(url)
                .optionalCenterCrop()
                .placeholder(R.drawable.placeholder)
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            imageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
