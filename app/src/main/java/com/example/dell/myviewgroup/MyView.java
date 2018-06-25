package com.example.dell.myviewgroup;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.orhanobut.logger.Logger;

public class MyView extends View {
    private GestureDetector gestureDetector ;
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        gestureDetector =new GestureDetector(context,mSimpleOnGestureListener);

    }
private GestureDetector.SimpleOnGestureListener mSimpleOnGestureListener=new GestureDetector.SimpleOnGestureListener(){
    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Logger.d("singleTapUp");
        return super.onSingleTapUp(e);
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Logger.d("LongPress");
        super.onLongPress(e);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Logger.d("onScroll");
        return super.onScroll(e1, e2, distanceX, distanceY);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Logger.d("onDown");
        return super.onDown(e);
    }
};


    @Override
    public boolean onTouchEvent(MotionEvent event) {
    gestureDetector.onTouchEvent(event);
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                Logger.d("action down");
//                break;
//            case MotionEvent.ACTION_UP:
//                Logger.d("action up");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Logger.d("action move");
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                Logger.d("action cancael");
//                break;
//            case MotionEvent.ACTION_OUTSIDE:
//                Logger.d("action outside");
//                break;
//            case MotionEvent.ACTION_POINTER_DOWN:
//                Logger.d("action pointer_down");
//                break;
//            case MotionEvent.ACTION_POINTER_UP:
//                Logger.d("action pointer_up");
//                break;
//        }
        return true;
    }

}
