package com.acc.apilibrary;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Aditya Chowta on 2/6/2017.
 */

public class ApiFunctions {
    public static JSONObject _response = null;

    public static JSONObject postFunction(String url, JSONObject body){

        try {
            final String URL = url;
            final JSONObject BODY = body;


            JsonObjectRequest req = new JsonObjectRequest(Request.Method.POST, URL, BODY,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            _response = response;
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                        }
                    });
            req.setRetryPolicy(new DefaultRetryPolicy(
                    9000,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            // add the request object to the queue to be executed
            ApplicationController.getInstance().addToRequestQueue(req);


        } catch (Exception e){
            e.printStackTrace();
        }
        return _response;
    }

}
