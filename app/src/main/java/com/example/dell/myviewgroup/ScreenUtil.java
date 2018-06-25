package com.example.dell.myviewgroup;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ScreenUtil {

        private ScreenUtil() {
            /*cannot be instantiated*/
            throw new UnsupportedOperationException("cannot be instantiated");
        }

        /**
         * 获得屏幕宽度
         *
         * @param context
         * @return
         */
        public static int getScreenWidth(Context context) {
            WindowManager wm = (WindowManager) context
                    .getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics outMetrics = new DisplayMetrics();
            wm.getDefaultDisplay().getMetrics(outMetrics);
            return outMetrics.widthPixels;
        }

        /**
         * 获得屏幕高度
         *
         * @param context
         * @return
         */
        public static int getScreenHeight(Context context) {
            WindowManager wm = (WindowManager) context
                    .getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics outMetrics = new DisplayMetrics();
            wm.getDefaultDisplay().getMetrics(outMetrics);
            return outMetrics.heightPixels;
        }
    }

