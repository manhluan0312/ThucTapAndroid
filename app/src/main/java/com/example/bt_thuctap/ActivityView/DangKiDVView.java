package com.example.bt_thuctap.ActivityView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.API.APIResponeDangKiDVModel;
import com.example.bt_thuctap.Detail.Customer_Detail;
import com.example.bt_thuctap.Detail.DangKiDV_Detail;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.adapter.DangKiDVAdapter;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.DangKiDV;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.Serializable;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DangKiDVView extends AppCompatActivity {

    public static final String TITLE1="Thôngtinchitiếtdangkidichvu";
    private Gson gson = new Gson();

    ArrayList<DangKiDV> dangKiDVArray = new ArrayList<>();
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_dvview);
        ListView lv_dkdv=findViewById(R.id.listview_dK_goi_DV);

        sharedPreferences=getSharedPreferences("datatoken",MODE_PRIVATE);

        String url = "http://192.168.1.54/api/register";

        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String jsonResponse = response.toString();
                APIResponeDangKiDVModel apiResponseModel = gson.fromJson(jsonResponse, APIResponeDangKiDVModel.class);

                ArrayList lsTest =apiResponseModel.getData();
                DangKiDVAdapter adapter=new DangKiDVAdapter(DangKiDVView.this,R.layout.dangkidv_row,lsTest);
                lv_dkdv.setAdapter(adapter);

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
                header.put("Authorization", "Bearer " + sharedPreferences.getString("token",""));
                return header;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(JsonObjectRequest);


        lv_dkdv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //DangKiDV dangKiDV =dangKiDVArray.get(position);
                //Intent intent =new Intent(DangKiDVView.this, DangKiDV_Detail.class);
                //startActivity(intent);
            }
        });
    }
    }
