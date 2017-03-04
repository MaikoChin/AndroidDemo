Android Lifecycle Demo
======

Every Activity has 4 state in its file cycle.

+ running or active
+ paused
+ stopped
+ destroyed

 ![](https://developer.android.com/images/activity_lifecycle.png)

And 7 callback method

+ onCreate()
+ onStart()
+ onResume()
+ onPause()
+ onStop()
+ onDestroy()
+ onRestart()

so there are 3 key loop

+ **entire lifetime** onCreate(Bundle) -> onDestroy()

+ **visible lifetime** onStart() -> onStop()

+ **foreground lifetime** onResume() -> onPause()