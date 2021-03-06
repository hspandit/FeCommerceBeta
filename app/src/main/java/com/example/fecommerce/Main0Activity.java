package com.example.fecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main0Activity extends AppCompatActivity {
    Button joinBut,LogBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        onJoinListner();
        onLoginListner();
        onFarmerLoginListner();
    }

    private void onJoinListner() {
        joinBut=(Button)findViewById(R.id.main_join_now_btn);
        joinBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main0Activity.this,Customer_Registration.class);
            startActivity(i);
            }
        });
    }
    public void onLoginListner(){
        LogBut = (Button)findViewById(R.id.main_login_btn);
        LogBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main0Activity.this,Customer_login.class);
                startActivity(i);
            }
        });
    }
    public void onFarmerLoginListner(){
        ImageButton farlog=(ImageButton)findViewById(R.id.imageButton);
        farlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main0Activity.this, F_Login_Or_Register.class);
                startActivity(intent);
            }
        });

    }

}
