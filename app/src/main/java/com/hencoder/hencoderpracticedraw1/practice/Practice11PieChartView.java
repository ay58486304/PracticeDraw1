package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

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

        Paint paint = new Paint();
        Path path = new Path();
        float width = getWidth();
        float height = getHeight();

        //画圆饼
        paint.setColor(Color.RED);
        canvas.drawArc(200,100,700,600,180,135,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(210,110,750,650,-45,45,true,paint);

        paint.setColor(getResources().getColor(R.color.purple));
        canvas.drawArc(210,110,750,650,2,10,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(210,110,750,650,14,5,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(210,110,750,650,21,40,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(210,110,750,650,63,117,true,paint);

        //画标注


    }
}
