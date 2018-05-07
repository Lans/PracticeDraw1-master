package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF rectF = new RectF(200, 50, 500, 350);
    private RectF rectF2 = new RectF(220, 60, 500, 360);
    private RectF rectF3 = new RectF(220, 61, 500, 371);
    private RectF rectF4 = new RectF(220, 62, 500, 372);
    private RectF rectF5 = new RectF(220, 63, 500, 373);
    private RectF rectF6 = new RectF(200, 64, 508, 374);

    private Path mPath = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF, 180, 130, true, mPaint);

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(rectF2, 313, 50, true, mPaint);

        mPaint.setColor(Color.parseColor("#691A99"));
        canvas.drawArc(rectF3, 363, 8, true, mPaint);

        mPaint.setColor(Color.GRAY);
        canvas.drawArc(rectF4, 373, 5, true, mPaint);

        mPaint.setColor(Color.parseColor("#00AA8D"));
        canvas.drawArc(rectF5, 380, 50, true, mPaint)

        ;
        mPaint.setColor(Color.parseColor("#3F51B5"));
        canvas.drawArc(rectF6, 72, 110, true, mPaint);


        //path
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);

        //Lollopop
        mPath.moveTo(100, 100);
        mPath.lineTo(200, 100);
        mPath.rLineTo(20, 30);
        canvas.drawPath(mPath, mPaint);


        //转移起点 Marshmallow
        mPath.moveTo(490, 160);
        mPath.lineTo(510, 140);
        mPath.rLineTo(50, 0);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(500, 233);
        mPath.lineTo(550, 233);
        mPath.rLineTo(20, 23);
        mPath.rLineTo(20, 0);
        canvas.drawPath(mPath, mPaint);

        mPaint.setTextSize(19);
        canvas.drawText("Lollopop", 20, 100, mPaint);

        canvas.drawText("Marshmallow", 562, 144, mPaint);

        canvas.drawText("Gingebread", 592, 256, mPaint);


        mPaint.setTextSize(40);
        canvas.drawText("饼图", 300, 450, mPaint);


    }
}
