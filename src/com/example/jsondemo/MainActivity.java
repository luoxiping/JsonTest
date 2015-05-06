package com.example.jsondemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private String oneJsonStr = "{" + "\"single\" : " + "{" + "\"id\" : 1, \"name\" : \"tom\" , \"gender\" : \"��\" " + "}" + "}";
	private String twoJsonStr = "{" + "\"singers\" : " + 
        "[{" + "\"id\" : 2, \"name\" : \"tom\", \"gender\" : \"��\" " + "}," + 
        "{" + "\"id\" : 3, \"name\" : \"tom\", \"gender\" : \"��\" " + "}," +
        "{" + "\"id\" : 4, \"name\" : \"tom\", \"gender\" : \"��\" " + "}," + 
        "{" + "\"id\" : 5, \"name\" : \"tom\", \"gender\" : \"��\" " + "}]" + "}";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
			JSONObject jsonObject = new JSONObject(oneJsonStr);
			JSONObject jsonObject2 = jsonObject.getJSONObject("single");
			int id1 = jsonObject2.getInt("id");
			Log.e("��һ��", id1 + "");
			JSONObject jsonObject3 = new JSONObject(twoJsonStr);
			JSONArray jsonArray = jsonObject3.getJSONArray("singers");
			for (int i = 0; i < jsonArray.length(); i++) {
				int id2 = jsonArray.getJSONObject(i).getInt("id");
				Log.e("��" + i + "��", id2 + "");
			}
		} catch (JSONException e) {
			 Log.e("��һ��", "aaaaaaaaaaaaaaaaaaa");
			e.printStackTrace();
		}
    }

}
