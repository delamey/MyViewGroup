package com.example.dell.myviewgroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)  // 是否打印线程号,默认true
                .methodCount(5)         // 展示几个方法数,默认2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
//                .logStrategy(customLog) //是否更换打印输出,默认为logcat
                .tag("meee")   // 全局的tag
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        WindowManager.LayoutParams wmParams = new WindowManager.LayoutParams();
        wmParams.flags=WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
        PopupWindow popupWindow=new PopupWindow();
        popupWindow.setOutsideTouchable(true);

    }
}
