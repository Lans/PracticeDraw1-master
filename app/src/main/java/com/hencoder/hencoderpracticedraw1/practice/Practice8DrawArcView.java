package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF rectF = new RectF(200, 200, 350, 330);
    private RectF rectF2 = new RectF(230, 200, 430, 350);
    private RectF rectF3 = new RectF(200, 250, 430, 380);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        //画线
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 180, 90, false, mPaint);

        //画扇形
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF2, 250, 100, true, mPaint);

        canvas.drawArc(rectF3, 0, 180, true, mPaint);

    }
}
