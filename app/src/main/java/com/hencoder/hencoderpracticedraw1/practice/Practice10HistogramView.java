package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint.setColor(Color.WHITE);

        canvas.drawLine(50, 50, 50, 400, mPaint);
        canvas.drawLine(50, 400, 900, 400, mPaint);
        float textSize = 20;
        mPaint.setTextSize(textSize);
        canvas.drawText("Ftoyo", 60, 400 + textSize, mPaint);
        canvas.drawText("GB", 150, 400 + textSize, mPaint);
        canvas.drawText("ICS", 240, 400 + textSize, mPaint);
        canvas.drawText("JB", 320, 400 + textSize, mPaint);
        canvas.drawText("KitKat", 410, 400 + textSize, mPaint);
        canvas.drawText("L", 500, 400 + textSize, mPaint);
        canvas.drawText("M", 590, 400 + textSize, mPaint);
        canvas.drawText("直方图", 300, 450 + textSize, mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(130, 380, 190, 400, mPaint);
        canvas.drawRect(220, 380, 280, 400, mPaint);
        canvas.drawRect(300, 180, 360, 400, mPaint);
        canvas.drawRect(390, 120, 450, 400, mPaint);
        canvas.drawRect(480, 100, 540, 400, mPaint);
        canvas.drawRect(570, 190, 630, 400, mPaint);
    }
}
