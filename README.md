2048-android
============

This is the android port of the 2048 game made by Gabriele Cirulli https://github.com/gabrielecirulli/2048 
It's nothing fancy, just a webview that loads the locally stored html files of the original game. 
I just wanted to make it instantly playable without Internet (the app doesn't require any permissions) and with 
a quick access icon for my smartphone.

Feel free to contribute with pull requests to the original project by Gabriele or to this one if you have any android 
specific improvements in mind.

Play store link: https://play.google.com/store/apps/details?id=com.uberspot.a2048

![](screenshots/screen1.png)

##Building

If you want to build from source just do 

    git clone --recursive https://github.com/uberspot/2048-android.git
    cd 2048-android/
    git submodule update --init --recursive
    ./gradlew build
    
### With Eclipse

1. Copy `https://github.com/uberspot/2048-android.git` to clipboard
2. File -> Import -> Git / Projects from Git -> Clone URI
3. Paste URI from clipboard (if it did not appeared automatically)
4. Next> Next> **Check "Clone submodules"**
5. Next> select "Import existing project"       

##License

2048-android is licensed under the [MIT license.](https://github.com/uberspot/2048-android/blob/master/LICENSE)
