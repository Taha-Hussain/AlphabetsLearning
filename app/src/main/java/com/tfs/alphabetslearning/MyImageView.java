package com.tfs.alphabetslearning;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Toast;

public class MyImageView extends View {

    Bitmap alphabet_a,alphabet_b,alphabet_c,alphabet_d,alphabet_e;
    int x_a,y_a;
    int x_b,y_b;
    int x_c,y_c;
    int x_d,y_d;
    int x_e,y_e;

    int x_a_dir,y_a_dir ;
    int x_b_dir,y_b_dir ;
    int x_c_dir,y_c_dir ;
    int x_d_dir,y_d_dir ;
    int x_e_dir,y_e_dir ;


    public MyImageView(Context context) {
        super(context);
        x_a = 50;
        y_a = 0;

        x_b = 100;
        y_b = 40;

        x_c = 100;
        y_c = 400;

        x_d = 210;
        y_d = 512;

        x_e = 150;
        y_e = 200;

        x_a_dir=1;
        y_a_dir=2;

        x_b_dir=3;
        y_b_dir=4;

        x_c_dir=5;
        y_c_dir=6;

        x_d_dir=7;
        y_d_dir=8;

        x_e_dir=9;
        y_e_dir=10;

//        setBackgroundResource(R.drawable.love_background);
    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        // TODO Auto-generated method stub
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                float x = event.getX() - 100;
//                float y = event.getY() - 100;
//                if( x > x_a && x < x_a + 100 && y > y_b && y < y_b + 100 )
//                {
//                    x_a_dir = -1;
//                }
//                invalidate();
//                return true;
//               // invalidate();
////                break;
//        }
//
//        return false;
//    }
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        alphabet_a = BitmapFactory.decodeResource(getResources(),R.drawable.a);
        alphabet_b = BitmapFactory.decodeResource(getResources(),R.drawable.b);
        alphabet_c = BitmapFactory.decodeResource(getResources(),R.drawable.c);
        alphabet_d = BitmapFactory.decodeResource(getResources(),R.drawable.d);
        alphabet_e = BitmapFactory.decodeResource(getResources(),R.drawable.e);

        if(x_a >= canvas.getWidth()-200)
        {
          x_a_dir = -1;
        }

        if(x_a <= 0)
        {
            x_a_dir = 1;
        }


        if(y_a >= canvas.getHeight()-200)
        {
            y_a_dir = -2;
        }

        if(y_a <= 0)
        {
            y_a_dir = 2;
        }

        if(x_b >= canvas.getWidth()-200)
        {
            x_b_dir = -3;
        }

        if(x_b <= 0)
        {
            x_b_dir = 3;
        }


        if(y_b >= canvas.getHeight()-200)
        {
            y_b_dir = -4;
        }

        if(y_b <= 0)
        {
            y_b_dir = 4;
        }

        if(x_c >= canvas.getWidth()-200)
        {
            x_c_dir = -5;
        }

        if(x_c <= 0)
        {
            x_c_dir = 5;
        }


        if(y_c >= canvas.getHeight()-200)
        {
            y_c_dir = -6;
        }

        if(y_c <= 0)
        {
            y_c_dir = 6;
        }

        if(x_d >= canvas.getWidth()-200)
        {
            x_d_dir = -7;
        }

        if(x_d <= 0)
        {
            x_d_dir = 7;
        }


        if(y_d >= canvas.getHeight()-200)
        {
            y_d_dir = -8;
        }

        if(y_d <= 0)
        {
            y_d_dir = 8;
        }

        if(x_e >= canvas.getWidth()-200)
        {
            x_e_dir = -9;
        }

        if(x_e <= 0)
        {
            x_e_dir = 9;
        }


        if(y_e >= canvas.getHeight()-200)
        {
            y_e_dir = -10;
        }

        if(y_e <= 0)
        {
            y_e_dir = 10;
        }


        x_a = x_a + x_a_dir;
        y_a = y_a + y_a_dir;

        x_b = x_b + x_b_dir;
        y_b = y_b + y_b_dir;

        x_c = x_c + x_c_dir;
        y_c = y_c + y_c_dir;

        x_d = x_d + x_d_dir;
        y_d = y_d + y_d_dir;

        x_e = x_e + x_e_dir;
        y_e = y_e + y_e_dir;

        canvas.drawBitmap(alphabet_a, x_a, y_a, null);
        canvas.drawBitmap(alphabet_b, x_b, y_b, null);
        canvas.drawBitmap(alphabet_c, x_c, y_c, null);
        canvas.drawBitmap(alphabet_d, x_d, y_d, null);
        canvas.drawBitmap(alphabet_e, x_e, y_e, null);

        invalidate();
    }
}
