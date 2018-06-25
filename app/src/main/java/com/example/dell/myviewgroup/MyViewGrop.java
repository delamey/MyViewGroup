package com.example.dell.myviewgroup;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MyViewGrop extends ViewGroup {

    private final static int VIEW_MARGIN = 0;
    private Context mContext;

    public MyViewGrop(Context context) {
        super(context);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildren(widthMeasureSpec,heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) {
        final int size=getChildCount();
        for (int i=0;i<size;i++){
            View child=getChildAt(i);
            measureChild(child,widthMeasureSpec,heightMeasureSpec);

        }
    }

    @Override
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
//        final LayoutParams lp=child.getLayoutParams();
//        final  int childHeightMeasureSpec=getChildMeasureSpec(parentHeightMeasureSpec,child.getPaddingTop()+child.getPaddingBottom(),lp.height);
//        final int  childWidthMeasureSpec=getChildMeasureSpec(parentWidthMeasureSpec,child.getPaddingLeft()+child.getPaddingRight(),lp.width);
//        child.measure(childWidthMeasureSpec,childHeightMeasureSpec);
       child.measure(MeasureSpec.UNSPECIFIED,MeasureSpec.UNSPECIFIED);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
//        for(int j=0;j<getChildCount();j++){
//            View child=getChildAt(j);
//            if (child.getVisibility()!=GONE){
//                RelativeLayout.LayoutParams st= (RelativeLayout.LayoutParams) child.getLayoutParams();
//                child.layout(st.leftMargin,st.topMargin,st.rightMargin,st.bottomMargin);
//            }
//        }
        Log.d("TAG", "changed = " + b + " left = " + i + " top = " + i1
                + " right = " + i2 + " botom = " + i3);
        final int count = getChildCount();
        int row = 0;
        //当前宽度
        int lengthX = i;
        //当前高度
        int lengthY = i1;
        for (int k = 0; k < count; k++) {
            final View child = this.getChildAt(k);
            int width = child.getMeasuredWidth();
            int height = child.getMeasuredHeight();
            lengthX += width + VIEW_MARGIN;
            lengthY = row * (height + VIEW_MARGIN) + VIEW_MARGIN + height
                    + i1;
            if (lengthX > i2) {
                lengthX = width + VIEW_MARGIN + i;
                row++;
                lengthY = row * (height + VIEW_MARGIN) + VIEW_MARGIN + height
                        + i1;
            }
            child.layout(lengthX - width, lengthY - height, lengthX, lengthY);
        }
    }

}
