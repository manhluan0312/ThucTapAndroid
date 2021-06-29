package com.example.bt_thuctap.ActivityView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.API.APIResponeDangKiDVModel;
import com.example.bt_thuctap.API.APIResponseCustomerModel;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.adapter.CustomerAdapter;
import com.example.bt_thuctap.adapter.DangKiDVAdapter;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.DangKiDV;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DangKiDVView extends AppCompatActivity {
    private Gson gson = new Gson();
    ArrayList<DangKiDV> customerArray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_dvview);
        ListView lv_dkdv=findViewById(R.id.listview_dK_goi_DV);

        String url = "http://192.168.1.54/api/register";

        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String jsonResponse = response.toString();
                APIResponeDangKiDVModel apiResponseModel = gson.fromJson(jsonResponse, APIResponeDangKiDVModel.class);

                ArrayList lsTest =apiResponseModel.getData();

                /*

                 */

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
                header.put("Authorization", "Bearer " + Constant.TOKEN);
                return header;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(JsonObjectRequest);
    }
}