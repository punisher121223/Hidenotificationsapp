# Keep the service
-keep class com.example.hiddennotificationapp.NotificationService { *; }
# Keep the application class
-keep public class * extends android.app.Application
# Keep the annotations
-keepattributes *Annotation*
