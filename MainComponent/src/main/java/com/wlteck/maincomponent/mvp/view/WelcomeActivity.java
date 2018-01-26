package com.wlteck.maincomponent.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wlteck.maincomponent.R;

/**
 * created by weiliu on 2018/1/26.
 * email: weiliugoo@gmail.com
 * description:
 */

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    private void init() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ARouter.getInstance().build("/view/newsListActivity").navigation();
            }
        }, 3000);
    }
}
