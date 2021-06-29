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
import com.example.bt_thuctap.API.APIResponePromotionModel;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.adapter.CustomerAdapter;
import com.example.bt_thuctap.adapter.PromotionAdapter;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.Promotion;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PromotionView extends AppCompatActivity {
    private Gson gson = new Gson();
    ArrayList<Promotion> customerArray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_view);
        ListView lv_km =findViewById(R.id.lv_km);

        String url = "http://192.168.1.54/api/promotion";

        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String jsonResponse = response.toString();
                APIResponePromotionModel apiResponseModel = gson.fromJson(jsonResponse, APIResponePromotionModel.class);

                ArrayList lsTest =apiResponseModel.getData();

                /*

                 */

                PromotionAdapter adapter=new PromotionAdapter(PromotionView.this,R.layout.promotion_row,lsTest);
                lv_km.setAdapter(adapter);

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