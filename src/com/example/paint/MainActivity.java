package com.example.paint;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	Button b1,b2,b3;
	EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
} 
    

/*import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
 
public class MainActivity extends Activity {
	
	MyView graphics;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		graphics = new MyView(this);
		setContentView(graphics);
	}
	private class MyView extends View{
		public MyView(Context context){
			super(context);
		}
	
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);
		paint.setColor(Color.BLACK);
		canvas.drawPaint(paint);
		paint.setAntiAlias(false);
		paint.setColor(Color.RED);
		canvas.drawCircle(60,90,30,paint);
		paint.setAntiAlias(true);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(45,65,20,paint);*/
		



		
 
