package com.example.worldofwarcraftmaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otaliastudios.zoom.ZoomImageView

class MainActivity : AppCompatActivity() {

    lateinit var mapMainZoomImg:ZoomImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapMainZoomImg = findViewById(R.id.nowMap)

        mapMainZoomImg.setOnClickListener {
            mapMainZoomImg.background = getDrawable(R.drawable.ic_teldrassil_map)
        }


    }
}