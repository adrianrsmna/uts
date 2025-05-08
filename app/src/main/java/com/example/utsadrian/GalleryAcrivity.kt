package com.example.utsadrian

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    private val parts = arrayOf(
        R.drawable.download,
        R.drawable.raphael,
        R.drawable.michelangelo,
        R.drawable.donatello,
        R.drawable.reonardo
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gallery_activity)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = ImageAdapter(this, parts)
        gridView.adapter = adapter
    }
}

