package com.example.hiddennotificationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // فعلاً چیزی نشون ندیم، چون قراره برنامه مخفی باشه
        finish() // بستن مستقیم اکتیویتی
    }
}
