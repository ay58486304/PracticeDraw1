package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

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
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Path path = new Path();

        //画出坐标系
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(150,100);
        path.lineTo(150,600);
        path.lineTo(1200,600);
        canvas.drawPath(path,paint);

        //画柱状图
        Path path2 = new Path();
        path2.moveTo(175,598);
        path2.lineTo(225,598);


        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        path2.addRect(325,575,425,600, Path.Direction.CW);

        path2.addRect(475,575,575,600, Path.Direction.CW);

        path2.addRect(625,400,725,600, Path.Direction.CW);

        path2.addRect(775,350,875,600, Path.Direction.CW);

        path2.addRect(925,200,1025,600, Path.Direction.CW);

        path2.addRect(1075,400,1175,600, Path.Direction.CW);

        canvas.drawPath(path2,paint);

        //画文字
        paint.setColor(Color.WHITE);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(1);
        paint.setTextSize(25);
        canvas.drawText("Froyo",200,625,paint);
        canvas.drawText("GB",350,625,paint);
        canvas.drawText("ICS",500,625,paint);
        canvas.drawText("JB",650,625,paint);
        canvas.drawText("Kitkat",800,625,paint);
        canvas.drawText("L",975,625,paint);
        canvas.drawText("M",1125,625,paint);

        paint.setTextSize(50);
        canvas.drawText("直方图",600,700,paint);
    }
}
