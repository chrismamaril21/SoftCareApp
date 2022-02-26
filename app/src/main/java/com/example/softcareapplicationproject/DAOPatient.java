package com.example.softcareapplicationproject;

import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOPatient {

    private DatabaseReference databaseReference;

    public DAOPatient()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Patient.class.getSimpleName());
    }

    public Task<Void> add(Patient pat)

    {
        return databaseReference.push().setValue(pat);

    }
}
