package com.khusainov.rinat.uitestsdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class UIAdapter extends RecyclerView.Adapter<UIAdapter.UIHolder> {


    @NonNull
    @Override
    public UIHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UIHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ui_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UIHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class UIHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public UIHolder(@NonNull View itemView) {
            super(itemView);

            mTextView= itemView.findViewById(R.id.ui_item_tv);
        }

        void bind(int position) {
            mTextView.setText(String.valueOf(position));
        }
    }
}
