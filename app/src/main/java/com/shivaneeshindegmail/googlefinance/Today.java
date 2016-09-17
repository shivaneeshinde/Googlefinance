package com.shivaneeshindegmail.googlefinance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import helper.SessionManager;
import android.app.ProgressDialog;
import android.support.v7.app.AlertDialog;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import android.app.Activity;
import android.widget.TextView;

import com.shivaneeshindegmail.googlefinance.JSONParser;

public class Today extends AppCompatActivity {

    private static final String url = "http://www.vjtiorc.freeiz.com/todayn.php";


    //JSON Node Names
    private static final String TAG_USER = "user";
    private static final String sl="l";
    private static final String sltt="ltt";
    private static final String sc="c";
    private static final String scfix="cp_fix";

    JSONArray user = null;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        // // Creating new JSON Parser
        JSONParser jParser = new JSONParser();

        // Getting JSON from URL
        JSONObject json = jParser.getJSONFromUrl(url);

        try {
            // Getting JSON Array
            user = json.getJSONArray(TAG_USER);
            JSONObject c = user.getJSONObject(0);

                // Storing  JSON item in a Variable

                String l1=c.getString(sl);
                String ltt1 = c.getString(sltt);
                String c1 = c.getString(sc);
                String cfix1 = c.getString(scfix);

                //Importing TextView
                final TextView l = (TextView)findViewById(R.id.lname);
                final TextView ltt = (TextView)findViewById(R.id.ltt);
                final TextView cp = (TextView)findViewById(R.id.cp);
                final TextView cp_fix = (TextView)findViewById(R.id.cp_fix);

                //Set JSON Data in TextView
                l.setText(l1);
                ltt.setText(ltt1);
                cp.setText(c1);
                cp_fix.setText(cfix1);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}