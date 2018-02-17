package com.example.android.customlistimage;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String tag = MainActivity.class.getSimpleName();
    private static final String url = "https://raw.githubusercontent.com/iCodersLab/Custom-ListView-Using-Volley/master/richman.json";
    private List<DataSet> list = new ArrayList<DataSet>();
    private ListView listView;
    private AdapterV adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        adapter = new AdapterV(this, list);
        listView.setAdapter(adapter);


        JsonArrayRequest jsonreq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        for (int i = 0; i < response.length(); i++) {
                            try {

                                JSONObject obj = response.getJSONObject(i);
                                DataSet dataSet = new DataSet();
                                dataSet.setName(obj.getString("name"));
                                dataSet.setImage(obj.getString("image"));
                                dataSet.setWorth(obj.getString("worth"));
                                dataSet.setYear(obj.getInt("InYear"));
                                dataSet.setSource(obj.getString("source"));
                                list.add(dataSet);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
//                        adapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                AlertDialog.Builder add = new AlertDialog.Builder(MainActivity.this);
                add.setMessage(error.getMessage()).setCancelable(true);
                AlertDialog alert = add.create();
                alert.setTitle("Error!!!");
                alert.show();
            }
        });
        Controller.getPermission().addToRequestQueue(jsonreq);
    }

}
