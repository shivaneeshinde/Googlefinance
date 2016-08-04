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
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class Display extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        final TextView a1=(TextView)findViewById(R.id.a);
        final TextView b1=(TextView)findViewById(R.id.b);
        final TextView c1=(TextView)findViewById(R.id.c);
        final TextView d1=(TextView)findViewById(R.id.d);
        final TextView e1=(TextView)findViewById(R.id.e);
        final TextView f1=(TextView)findViewById(R.id.f);
        final TextView h1=(TextView)findViewById(R.id.h);
        final TextView i1=(TextView)findViewById(R.id.i);
        final TextView g1=(TextView)findViewById(R.id.i);
        final TextView j1=(TextView)findViewById(R.id.j);
        final TextView k1=(TextView)findViewById(R.id.k);
        final TextView l1=(TextView)findViewById(R.id.l);
        final TextView m1=(TextView)findViewById(R.id.m);
        final TextView n1=(TextView)findViewById(R.id.n);
        final TextView o1=(TextView)findViewById(R.id.o);
        final TextView p1=(TextView)findViewById(R.id.p);

        Intent intent = getIntent();
        final int a = intent.getIntExtra("id",-1);
        final String b = intent.getStringExtra("t");
        final String c = intent.getStringExtra("e");
        final String d = intent.getStringExtra("l");
        final String e = intent.getStringExtra("l_fix");
        final String f = intent.getStringExtra("l_cur");
        final String g = intent.getStringExtra("s");
        final String h = intent.getStringExtra("ltt");
        final String i = intent.getStringExtra("lt");
        final String j = intent.getStringExtra("lt_dts");
        final String k = intent.getStringExtra("c");
        final String l = intent.getStringExtra("c_fix");
        final String m = intent.getStringExtra("cp");
        final String n = intent.getStringExtra("cp_fix");
        final String o = intent.getStringExtra("ccol");
        final String p = intent.getStringExtra("pcls_fix");

        a1.setText(a);
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
