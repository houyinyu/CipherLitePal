package com.hby.cashier;

import android.app.Application;
import org.litepal.LitePal;


/**
 * 功能介绍:
 * 调用方式:
 * 作   者: Hyy - 825129541@qq.com
 * 创建电脑: admin
 * 创建时间: 2022/3/17 15:47
 * 最后编辑: 2022/3/17 - Hyy
 *
 * @author HouYinYu
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this,"123456");
    }
}
