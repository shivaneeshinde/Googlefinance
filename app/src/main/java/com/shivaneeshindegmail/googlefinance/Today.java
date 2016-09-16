package com.shivaneeshindegmail.googlefinance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Today extends AppCompatActivity {

    private static final String url = "http://www.vjtiorc.freeiz.com/todayn.php";


    //JSON Node Names
    private static final String TAG_USER = "user";
    private static final String sid="id";
    private static final String sl="l";

    JSONArray user = null;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today);

        // // Creating new JSON Parser
        JSONParser jParser = new JSONParser();

        // Getting JSON from URL
        JSONObject json = jParser.getJSONFromUrl(url);

        try {
            // Getting JSON Array
            user = json.getJSONArray(TAG_USER);
            JSONObject c = user.getJSONObject(0);

                // Storing  JSON item in a Variable

                String id = c.getString(sid);
                String lname1=c.getString(sl);

                //Importing TextView
                final TextView uid = (TextView)findViewById(R.id.uid);
                final TextView lname = (TextView)findViewById(R.id.lname);

                //Set JSON Data in TextView
                uid.setText(id);
                lname.setText(lname1);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}