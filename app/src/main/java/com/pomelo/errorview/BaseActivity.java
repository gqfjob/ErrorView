package com.pomelo.errorview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.plmelo.varyview.VaryViewHelper;

/**
 * Created by Administrator on 2017/8/23.
 */

public abstract class BaseActivity extends AppCompatActivity implements VaryViewUtil.VaryView{
    //varyViewHelper对象
    protected VaryViewHelper varyViewHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public abstract View getVaryView();

    @Override
    public abstract void reGetData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //释放资源
        varyViewHelper.releaseVaryView();
    }
}