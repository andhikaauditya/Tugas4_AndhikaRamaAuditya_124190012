package com.example.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class partadapter extends RecyclerView.Adapter<partadapter.viewholder> {

    private Context context;
    ArrayList partmodels = new ArrayList<partmodel>();

    public partadapter(ArrayList<partmodel> listdata, Context context) {
        this.context = context;
        this.partmodels = listdata;
    }

    public Context getContext() {

        return context;
    }

    public void setContext(Context context) {

        this.context = context;
    }

    public ArrayList<partmodel> getPartmodels() {

        return partmodels;
    }

    public void setPartmodels(ArrayList<partmodel> partmodels) {

        this.partmodels = partmodels;
    }


    @NonNull
    @Override
    public partadapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempart,parent,false);

        return new viewholder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull partadapter.viewholder holder, int position) {
        Glide.with(context).load(getPartmodels().get(position).getGambarpart()).into(holder.gambar);
        holder.text.setText(getPartmodels().get(position).getNamapart()) ;
    }

    @Override
    public int getItemCount() {

        return getPartmodels().size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.iv_cetakgambar);
            text = itemView.findViewById(R.id.textgambar);
        }
    }
}