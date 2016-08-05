package com.shivaneeshindegmail.googlefinance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class Display1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display1);

        Intent intent = getIntent();
        int a = intent.getIntExtra("id",-1);
        String b = intent.getStringExtra("t");
        String c = intent.getStringExtra("e");

        final EditText a1=(EditText)findViewById(R.id.a);
        final EditText b1=(EditText)findViewById(R.id.b);
        final EditText c1=(EditText)findViewById(R.id.c);

        a1.setText(a+"");
        b1.setText(b);
        c1.setText(c);
    }
}
