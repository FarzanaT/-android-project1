package com.driuft.hellosquirrel

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileBio: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureViews()
        setupProfile()
    }

    private fun configureViews() {
        profileImage = findViewById(R.id.profile_image)
        profileName = findViewById(R.id.profile_name)
        profileBio = findViewById(R.id.profile_bio)
    }

    private fun setupProfile() {
        configureImage()
        configureName()
    }

    private fun configureImage() {
        profileImage.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.img_20220911_212030))
    }

    private fun configureName() {
        val also = getString(
            R.string.First_Last,
            getString(R.string.First),
            getString(R.string.Last)
        ).also { profileName.text = it }
    }
}