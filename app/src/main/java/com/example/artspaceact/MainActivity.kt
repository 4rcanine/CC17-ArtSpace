package com.example.artspaceact

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private val images = listOf(
        R.drawable.ar1,
        R.drawable.ar2,
        R.drawable.ar3,
        R.drawable.ar4,
        R.drawable.ar5
    )


    private val titles = listOf(
        "Ophelia (1851-1852)",
        "Mad Tea Party (1969)",
        "The Lady of Shalott (1888)",
        "Dubling (2020)",
        "Don Quixote (1955)"
    )


    private val authors = listOf(
        "Sir John Everett Millais",
        "Salvador Dalí",
        "John William Waterhouse",
        "Elida Tessler",
        "Pablo Picasso"
    )


    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView: ImageView = findViewById(R.id.imageView)
        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val authorTextView: TextView = findViewById(R.id.authorTextView)
        val previousButton: Button = findViewById(R.id.previousButton)
        val nextButton: Button = findViewById(R.id.nextButton)


        updateContent(imageView, titleTextView, authorTextView)


        previousButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updateContent(imageView, titleTextView, authorTextView)
            }
        }


        nextButton.setOnClickListener {
            if (currentIndex < images.size - 1) {
                currentIndex++
                updateContent(imageView, titleTextView, authorTextView)
            }
        }
    }


    private fun updateContent(imageView: ImageView, titleTextView: TextView, authorTextView: TextView) {
        imageView.setImageResource(images[currentIndex])
        titleTextView.text = titles[currentIndex]
        authorTextView.text = authors[currentIndex]
    }
}