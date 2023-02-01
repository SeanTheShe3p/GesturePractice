package com.example.gesturepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    var gDetector: GestureDetectorCompat? = null // Thank you!
    lateinit var mainText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent): Boolean {
        //val textOnDown:TextView = findViewById(R.id.mainText)
        //textOnDown.text = "onDown"
        findViewById<TextView>(R.id.mainText).text = "onDown"
        //mainText = findViewById(R.id.mainText)
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        findViewById<TextView>(R.id.mainText).text = "onShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onSingleTapUp"
        return true
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onScroll"
        return true
    }

    override fun onLongPress(e: MotionEvent) {
        findViewById<TextView>(R.id.mainText).text = "onLongPress"
    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        findViewById<TextView>(R.id.mainText).text = "onDoubleTapEvent"
        return true
    }
}