package com.example.task_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_rollno,et_name,et_phoneno,et_email,et_password;
    TextView tv;
    CheckBox ch_cse,ch_it,ch_ece,ch_chemical;
    RadioButton r_male,r_female;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_rollno=findViewById(R.id.rollno);
        et_name=findViewById(R.id.name);
        et_phoneno=findViewById(R.id.phoneno);
        et_email=findViewById(R.id.email);
        et_password=findViewById(R.id.password);
        r_male=findViewById(R.id.male);
        r_female=findViewById(R.id.female);
        ch_cse=findViewById(R.id.cse);
        ch_it=findViewById(R.id.it);
        ch_ece=findViewById(R.id.ece);
        ch_chemical=findViewById(R.id.chemical);
    }

    public void Submit(View view) {
        String rollno=et_rollno.getText().toString();
        String name=et_name.getText().toString();
        String phoneno=et_phoneno.getText().toString();
        String email=et_email.getText().toString();
        String password=et_password.getText().toString();

        if(r_male.isChecked()){
            gender=r_male.getText().toString();
        }
        if(r_female.isChecked()){
            gender=r_female.getText().toString();
        }
        StringBuilder builder=new StringBuilder();
        if(ch_cse.isChecked()){
            builder.append(ch_cse.getText().toString()+",");
        }
        if(ch_it.isChecked()){
            builder.append(ch_it.getText().toString()+",");
        }
        if(ch_ece.isChecked()){
            builder.append(ch_ece.getText().toString()+",");
        }
        if(ch_chemical.isChecked()){
            builder.append(ch_chemical.getText().toString()+",");
        }
        tv.setText(rollno+"\n"+name+"\n"+phoneno+"\n"+email+"\n"+password+"\n"+gender
                +"\n"+builder);


    }
}