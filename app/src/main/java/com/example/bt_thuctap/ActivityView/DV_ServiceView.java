package com.example.bt_thuctap.ActivityView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.adapter.DV_ServiceAdapter;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.API.APIResponeDV_serviceModel;
import com.example.bt_thuctap.model.DV_Service;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DV_ServiceView extends AppCompatActivity {


    private Gson gson = new Gson();
    ArrayList<DV_Service> dv_serviceArray = new ArrayList<>();
    DV_ServiceAdapter dv_serviceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dv_service_view);

        ListView lv_dichvu;
        lv_dichvu=findViewById(R.id.listview_dv_service);

        String url = "http://192.168.1.54/api/service";

        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String jsonResponse = response.toString();
                APIResponeDV_serviceModel apiResponseModel = gson.fromJson(jsonResponse, APIResponeDV_serviceModel.class);

                ArrayList lsTest =apiResponseModel.getData();

                DV_ServiceAdapter adapter=new DV_ServiceAdapter(DV_ServiceView.this,R.layout.dv_service_row,lsTest);

                lv_dichvu.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TEST", error.getMessage());
            }
        }){
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> header = new HashMap<>();
                header.put("Accept", "*/*");
                header.put("Authorization", "Bearer " + Constant.TOKEN);
                return header;
            }
        };

        RequestQueue requestQueue =Volley.newRequestQueue(this);
        requestQueue.add(JsonObjectRequest);



        SearchView searchView_dv;
        searchView_dv=findViewById(R.id.search_dv);
        //cau hinh file xml serchview
        SearchManager searchManager=(SearchManager)getSystemService(Context.SEARCH_SERVICE);
        searchView_dv.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView_dv.setMaxWidth(Integer.MAX_VALUE);

        //bat su kien search view
        searchView_dv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
               //dv_serviceAdapter.getFilter().filter(query);
                Toast.makeText(getApplication(),query,Toast.LENGTH_SHORT).show();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                dv_serviceAdapter.getFilter().filter(newText);

                return false;
            }
        });

    }

    }
