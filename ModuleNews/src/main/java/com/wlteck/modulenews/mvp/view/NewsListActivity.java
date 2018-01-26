package com.wlteck.modulenews.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wlteck.modulenews.R;

/**
 * created by weiliu on 2018/1/26.
 * email: weiliugoo@gmail.com
 * description:
 */
@Route(path = "/view/newsListActivity")
public class NewsListActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);
    }
}
