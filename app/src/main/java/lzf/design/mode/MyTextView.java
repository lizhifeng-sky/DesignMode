package lzf.design.mode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/6/6 0006.
 */
public class MyTextView extends View {
    private Paint paint;
    private Bitmap bitmap;

    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);

        //渐变
        LinearGradient linearGradient = new LinearGradient(
                50,
                50,
                150,
                150,
                Color.rgb(0, 255, 0),
                Color.rgb(76, 175, 80),
                Shader.TileMode.MIRROR);
        paint.setShader(linearGradient);
        float[] direction = new float[]{1f, 1f, 1f, 1f};
        float light = 0.4f;
        float specular = 6;
        float blur = 3.5f;
        EmbossMaskFilter embossMaskFilter = new EmbossMaskFilter(
                direction, light, specular, blur);
        paint.setMaskFilter(new BlurMaskFilter(10, BlurMaskFilter.Blur.INNER));
        paint.setDither(true);
        paint.setShadowLayer(20, 20, 20, Color.BLUE);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        //阴影制作
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        setLayerType(LAYER_TYPE_SOFTWARE,null);
        canvas.drawCircle(100, 100, 50, paint);
    }
}

