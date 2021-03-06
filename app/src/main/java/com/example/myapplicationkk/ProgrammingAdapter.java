package com.example.myapplicationkk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
    private String[] data;
    public ProgrammingAdapter(String[] data)
    {

        this.data=data;
    }




    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater=LayoutInflater.from(parent.getContext());
        View view=Inflater.inflate(R.layout.ward_details,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.t2.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        TextView t1;
        TextView t2;
        TextView t3;
        TextView t4;
        TextView t5;
        TextView t6;
        TextView t7;
        TextView t8;

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.tt1);
            t2=(TextView)itemView.findViewById(R.id.d1);
            t3=(TextView)itemView.findViewById(R.id.tt3);
            t4=(TextView)itemView.findViewById(R.id.d2);
            t5=(TextView)itemView.findViewById(R.id.t5);
            t6=(TextView)itemView.findViewById(R.id.d3);
            t7=(TextView)itemView.findViewById(R.id.t7);
            t8=(TextView)itemView.findViewById(R.id.d4);





        }
    }
}

