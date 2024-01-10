package com.rsud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Menambahkan SplashScreen dan animation
        val background : ImageView = findViewById(R.id.SplashScreenImage)
        val slideanim = AnimationUtils.loadAnimation(this, R.anim.slide)
        background.startAnimation(slideanim)

        // untuk pindah ke halaman MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}