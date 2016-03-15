package com.example.emad.resume;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    // this function will load json from its local json file
      public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("resume.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
     public String getData() {

        String result = null;
        try {
            JSONObject parentobj = new JSONObject(loadJSONFromAsset());
            JSONArray parentArray = parentobj.getJSONArray("Resume");
            JSONObject nxtobj = parentArray.getJSONObject(0);
            ResumeModel rmodel = new ResumeModel();
             result = nxtobj.getString("Name");
            rmodel.setName(nxtobj.getString("Name"));
            rmodel.setEmail(nxtobj.getString("E-mail"));
            rmodel.setPhone(nxtobj.getString("Phone"));
            rmodel.setPhone(nxtobj.getString("Education"));
            rmodel.setEdu(nxtobj.getString("Education"));
            rmodel.setUni(nxtobj.getString("University"));
               //for technical skills
            ResumeModel.tskills skills = new ResumeModel.tskills();
            skills.setLanguage(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Languages"));
            skills.setOs(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Operating systems"));
            skills.setTechno(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Technologies"));
            skills.setWebd(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Web development"));
            skills.setMobilep(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Mobile Programming"));
            skills.setTypes(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Type setting"));
            //for projects
            ResumeModel.projects projects = new ResumeModel.projects();
            projects.setWebpro(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Languages"));
            projects.setAi(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Operating systems"));
            projects.setCrypto(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Technologies"));
            projects.setMl(nxtobj.getJSONArray("Technical skills").getJSONObject(0).getString("Web development"));


        } catch (JSONException e) {
            e.printStackTrace();
     }

        return result;

    }


      
  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
