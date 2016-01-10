package com.droidyue.navigationbarissue;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {
    private PopupWindow mPopupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.showPopupWindow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupWindow();
            }
        });
    }


    private void showPopupWindow() {
        if (mPopupWindow == null) {
            View contentView = LayoutInflater.from(this).inflate(R.layout.popup_window_content, null);
            mPopupWindow = new PopupWindow(contentView, LinearLayout.LayoutParams.MATCH_PARENT,500, true);
            mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
        }
        mPopupWindow.showAtLocation(findViewById(R.id.contentContainer), Gravity.BOTTOM, 0,0);
    }


}
