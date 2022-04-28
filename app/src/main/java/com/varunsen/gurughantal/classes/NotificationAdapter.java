package com.varunsen.gurughantal.classes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.varunsen.gurughantal.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private List<NotificationModelList> list;

    public NotificationAdapter(List<NotificationModelList> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_demo_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewHolder holder, int position) {

        holder.setData(list.get(position).fruitName, list.get(position).qty);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTv, qtyTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTv = itemView.findViewById(R.id.firstTv);
            qtyTv = itemView.findViewById(R.id.secondTv);

        }

        public void setData(String title, int qty){
            titleTv.setText(title);
            qtyTv.setText("" + qty);
        }

    }
}
