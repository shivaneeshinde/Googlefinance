package com.shivaneeshindegmail.googlefinance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import helper.SessionManager;
import android.app.ProgressDialog;
import android.support.v7.app.AlertDialog;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Startingpoint extends AppCompatActivity {


    private Button appllink;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startingpoint);
        final Button appllink= (Button) findViewById(R.id.btn);
        final EditText name1=(EditText) findViewById(R.id.txt);
        final TextView out = (TextView)findViewById(R.id.out);

        appllink.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                final String name=name1.getText().toString();

                // Response received from the server
                Response.Listener<String> responseListener= new Response.Listener<String>(){
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse= new JSONObject(response);
                            boolean success= jsonResponse.getBoolean("success");

                            if(success){
                                int id =jsonResponse.getInt("id");
                                String t = jsonResponse.getString("t");
                                String e =jsonResponse.getString("e");
                                String l =jsonResponse.getString("l");
                                String l_fix =jsonResponse.getString("l_fix");
                                String l_cur =jsonResponse.getString("l_cur");
                                String s =jsonResponse.getString("s");
                                String ltt =jsonResponse.getString("ltt");
                                String lt =jsonResponse.getString("lt");
                                String lt_dts =jsonResponse.getString("lt_dts");
                                String c =jsonResponse.getString("c");
                                String c_fix =jsonResponse.getString("c_fix");
                                String cp =jsonResponse.getString("cp");
                                String cp_fix =jsonResponse.getString("cp_fix");
                                String ccol =jsonResponse.getString("ccol");
                                String pcls_fix =jsonResponse.getString("pcls_fix");

                                Intent intent= new Intent(Startingpoint.this,Display.class);
                                intent.putExtra("id",id);
                                intent.putExtra("t",t);
                                intent.putExtra("e",e);
                                intent.putExtra("l",l);
                                intent.putExtra("l_fix",l_fix);
                                intent.putExtra("l_cur",l_cur);
                                intent.putExtra("s",s);
                                intent.putExtra("ltt",ltt);
                                intent.putExtra("lt",lt);
                                intent.putExtra("lt_dts",lt_dts);
                                intent.putExtra("c",c);
                                intent.putExtra("c_fix",c_fix);
                                intent.putExtra("cp",cp);
                                intent.putExtra("cp_fix",cp_fix);
                                intent.putExtra("ccol",ccol);
                                intent.putExtra("pcls_fix",pcls_fix);
                                Startingpoint.this.startActivity(intent);
                            }else {
                                AlertDialog.Builder builder= new AlertDialog.Builder(Startingpoint.this);
                                builder.setMessage("retriving data was Failed")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();
                            }

                        } catch(JSONException e) {
                            e.printStackTrace();

                        }

                    }
                };

                Fetch fetch_request=new Fetch(name,responseListener);
                RequestQueue queue= Volley.newRequestQueue(Startingpoint.this);
                queue.add(fetch_request);
            }

        });
    }
}
