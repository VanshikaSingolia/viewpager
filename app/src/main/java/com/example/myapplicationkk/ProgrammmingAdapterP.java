package com.example.myapplicationkk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



class ProgrammingAdapterP extends RecyclerView.Adapter<ProgrammingAdapterP.ProgrammingViewHolder> {
    private String[] data,data1,data2,data3;
    public ProgrammingAdapterP(String[] data,String[] data1,String[] data2,String[] data3)
    {

        this.data=data;
        this.data1=data1;
        this.data2=data2;
        this.data3=data3;


    }




    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater=LayoutInflater.from(parent.getContext());
        View view=Inflater.inflate(R.layout.patientdetails,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.t1.setText(title);
        String title1=data1[position];
        holder.t2.setText(title1);
        String title2=data2[position];
        holder.t3.setText(title2);
        String title3=data3[position];
        holder.t4.setText(title3);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        TextView t1,t2,t3,t4;


        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.d1);
            t2=(TextView)itemView.findViewById(R.id.d2);
            t3=(TextView)itemView.findViewById(R.id.d3);
            t4=(TextView)itemView.findViewById(R.id.d4);






        }
    }
}

