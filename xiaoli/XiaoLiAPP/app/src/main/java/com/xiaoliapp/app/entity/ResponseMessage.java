package com.xiaoliapp.app.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaoliapp.app.utils.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by VennUser on 2015/8/15.
 */
public class ResponseMessage implements JSONParser,Parcelable{
	private String status;
	private String uid;
	private String mobile;
	private String data;

	public void parseJson(String json) throws JSONException {
		JSONObject jsonObject = new JSONObject(json);
		status = jsonObject.getString("status");
		uid = jsonObject.getString("userid");
		mobile = jsonObject.getString("mobile");
		data = jsonObject.getString("data");
	}

	public String getStatus() {
		return status;
	}

	public String getData() {
		return data;
	}

	public String getUid() {
		return uid;
	}

	public String getMobile() {
		return mobile;
	}

	public String toString() {
		return "ResponseMessage{" +
				"status='" + status + '\'' +
				", uid='" + uid + '\'' +
				", mobile='" + mobile + '\'' +
				", data='" + data + '\'' +
				'}';
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {

	}
}
