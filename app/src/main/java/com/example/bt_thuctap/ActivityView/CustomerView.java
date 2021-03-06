package com.example.bt_thuctap.ActivityView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.Detail.Customer_Detail;
import com.example.bt_thuctap.LoginActivity;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.adapter.CustomerAdapter;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.API.APIResponseCustomerModel;
import com.example.bt_thuctap.model.Customer;
import com.google.gson.Gson;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CustomerView extends AppCompatActivity {

    public static final String TITLE="Thôngtinchitiếtkháchhàng ";

    private Gson gson = new Gson();
    ArrayList<Customer> customerArray = new ArrayList<>();

   // @RequiresApi(api = Build.VERSION_CODES.M)
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khach_hang);
        ListView lv_khachhang;
        lv_khachhang = findViewById(R.id.listview_khachhang);

        sharedPreferences=getSharedPreferences("datatoken",MODE_PRIVATE);

         String url = "http://192.168.1.54/api/customers";
         //String url="http://localhost/api/customers";
        JsonObjectRequest JsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                String jsonResponse = response.toString();
                APIResponseCustomerModel apiResponseModel = gson.fromJson(jsonResponse, APIResponseCustomerModel.class);

                ArrayList lsTest =apiResponseModel.getData();
                CustomerAdapter adapter=new CustomerAdapter(CustomerView.this,R.layout.khachhang_row,lsTest);
                lv_khachhang.setAdapter(adapter);
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

        RequestQueue requestQueue =Volley.newRequestQueue(this);
        requestQueue.add(JsonObjectRequest);


        lv_khachhang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Customer customer=customerArray.get(position);
                Intent intent =new Intent(CustomerView.this, Customer_Detail.class);
                startActivity(intent);
            }
        });
      }
}