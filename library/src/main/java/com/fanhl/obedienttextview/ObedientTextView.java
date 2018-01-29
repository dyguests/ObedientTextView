package com.fanhl.obedienttextview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * desc: 优先wrap_content，如果超出父布局，则截断多余的部分
 *
 * date: 2018/1/29
 *
 * @author fanhl
 */
public class ObedientTextView extends android.support.v7.widget.AppCompatTextView {
    public ObedientTextView(Context context) {
        super(context);
    }

    public ObedientTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ObedientTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //此段代码的逻辑是分别计算 warp 和 width=0&weight=1 时的宽度，然后取最小值

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthWrap = getMeasuredWidth();

        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);

        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widthSize, View.MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        int widthWeight1 = getMeasuredWidth();

        if (widthWeight1 > widthWrap) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
