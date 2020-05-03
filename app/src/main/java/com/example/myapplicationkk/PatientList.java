package com.example.myapplicationkk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.StrictMode;

public class PatientList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list);
        setTitle("Patients");
        RecyclerView rv=(RecyclerView)findViewById(R.id.patient_rc);
        rv.setLayoutManager(new LinearLayoutManager(this));
        String[] languages={"Tom","Mack","Jack","John"};
        String[] no={"1","2","3","4"};
        String[] id={"AS11231","AQ12352","AQ12453","D345G54"};
        String[] status={"Active","Discharged","Active"};


        rv.setAdapter(new ProgrammingAdapterP(no,languages,id,status));
    }
}
