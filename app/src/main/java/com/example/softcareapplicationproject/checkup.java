package com.example.softcareapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class checkup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_checkup);

        final EditText pname = findViewById(R.id.pname);
        final EditText padd = findViewById(R.id.padd);
        final EditText page = findViewById(R.id.page);
        final EditText pnum = findViewById(R.id.pnum);
        final EditText pweight = findViewById(R.id.pweight);
        final EditText pheight = findViewById(R.id.pheight);
        final EditText ptemp = findViewById(R.id.ptemp);
        Button btn = findViewById(R.id.submit_btn);
        DAOPatient dao = new DAOPatient();
        btn.setOnClickListener(v->
        {
            Patient pat = new Patient(pname.getText().toString(),padd.getText().toString(),page.getText().toString(),pnum.getText().toString(),pweight.getText().toString(),pheight.getText().toString(),ptemp.getText().toString());
            dao.add(pat).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Record Submitted", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}