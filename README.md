2048-android
============

[![Build Status](https://travis-ci.org/uberspot/2048-android.svg?branch=master)](https://travis-ci.org/uberspot/2048-android)

This is the Android port of the 2048 game made by Gabriele Cirulli https://github.com/gabrielecirulli/2048
It's nothing fancy; just a WebView that loads the locally stored html files of the original game.
I just wanted to make it instantly playable without internet (the app doesn't require any permissions), and with
a quick access icon for my smartphone.

Feel free to contribute with pull requests to the original project by Gabriele, or to this one
if you have any Android-specific improvements in mind.

<a href="https://play.google.com/store/apps/details?id=com.uberspot.a2048">
    <img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png"
        alt="Get it on Google Play" height="80"/>
</a>
<a href="https://f-droid.org/packages/com.uberspot.a2048/">
    <img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
        alt="Get it on F-Droid" height="80"/>
</a>

## Building

If you want to build from source, just do

    git clone --recursive https://github.com/uberspot/2048-android.git
    cd 2048-android
    git submodule update --init --recursive
    ./gradlew build

### With Eclipse

1. Copy `https://github.com/uberspot/2048-android.git` to clipboard
2. File -> Import -> Git / Projects from Git -> Clone URI
3. Paste URI from clipboard (if it did not appeared automatically)
4. Next> Next> **Check "Clone submodules"**
5. Next> select "Import existing project"

### With Android Studio

1. Follow first three lines of Building directions.
2. In Android Studio selection "Open an existing Android Studio Project"
3. When prompted, add the VCS root.

## License

2048-android is licensed under the [MIT license](https://github.com/uberspot/2048-android/blob/master/LICENSE).
