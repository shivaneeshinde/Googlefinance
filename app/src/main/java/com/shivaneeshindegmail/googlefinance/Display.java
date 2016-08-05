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

public class Display extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        final EditText a1=(EditText)findViewById(R.id.a);
        final EditText b1=(EditText)findViewById(R.id.b);
        final EditText c1=(EditText)findViewById(R.id.c);
        final EditText d1=(EditText)findViewById(R.id.d);
        final EditText e1=(EditText)findViewById(R.id.e);
        final EditText f1=(EditText)findViewById(R.id.f);
        final EditText h1=(EditText)findViewById(R.id.h);
        final EditText i1=(EditText)findViewById(R.id.i);
        final EditText g1=(EditText)findViewById(R.id.i);
        final EditText j1=(EditText)findViewById(R.id.j);
        final EditText k1=(EditText)findViewById(R.id.k);
        final EditText l1=(EditText)findViewById(R.id.l);
        final EditText m1=(EditText)findViewById(R.id.m);
        final EditText n1=(EditText)findViewById(R.id.n);
        final EditText o1=(EditText)findViewById(R.id.o);
        final EditText p1=(EditText)findViewById(R.id.p);

        Intent intent = getIntent();
         int a = intent.getIntExtra("id",-1);
         String b = intent.getStringExtra("t");
         String c = intent.getStringExtra("e");
         String d = intent.getStringExtra("l");
         String e = intent.getStringExtra("l_fix");
         String f = intent.getStringExtra("l_cur");
         String g = intent.getStringExtra("s");
         String h = intent.getStringExtra("ltt");
         String i = intent.getStringExtra("lt");
         String j = intent.getStringExtra("lt_dts");
         String k = intent.getStringExtra("c");
         String l = intent.getStringExtra("c_fix");
         String m = intent.getStringExtra("cp");
         String n = intent.getStringExtra("cp_fix");
         String o = intent.getStringExtra("ccol");
         String p = intent.getStringExtra("pcls_fix");

        a1.setText(a+"");
        b1.setText(b);
        c1.setText(c);
        d1.setText(d);
        e1.setText(e);
        f1.setText(f);
        g1.setText(g);
        h1.setText(h);
        i1.setText(i);
        j1.setText(j);
        k1.setText(k);
        l1.setText(l);
        m1.setText(m);
        n1.setText(n);
        o1.setText(o);
        p1.setText(p);
    }
}
