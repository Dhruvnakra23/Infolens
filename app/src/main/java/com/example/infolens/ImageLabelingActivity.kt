package com.example.infolens

import androidx.core.content.ContextCompat
import com.example.infolens.BaseLensActivity
import com.example.infolens.ImageLabelAnalyzer

class ImageLabelingActivity : BaseLensActivity() {
    override val imageAnalyzer = ImageLabelAnalyzer()

    override fun startScanner() {
        startImageLabeling()
    }

    private fun startImageLabeling() {
        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )
    }
}