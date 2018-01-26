package com.wlteck.commoncomponent.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wlteck.commoncomponent.BuildConfig;

/**
 * created by weiliu on 2018/1/26.
 * email: weiliugoo@gmail.com
 * description:
 */

public class CommonComponentApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter(){
        if (BuildConfig.showARouterLog) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
