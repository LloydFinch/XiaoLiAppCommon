package com.xiaoliapp.app.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v4.app.FragmentActivity;
import com.xiaoliapp.app.R;

/**
 * 情礼提醒
 */
public class GiftsWarnActivity extends FragmentActivity {

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifts_warn_content);

        Intent intent = new Intent(Intent.ACTION_INSERT_OR_EDIT);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        startActivity(intent);
    }

}





































