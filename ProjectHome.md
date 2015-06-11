Note! this project use has been pretty much invalidated by the Android guidelines. I'd strongly suggest to follow the android designs rather than trying to use this horizontal tab widget:

The guidelines for tabs can be found here: http://developer.android.com/design/building-blocks/tabs.html

This is the implementation of the missing horizontal tab widget for android. The embedded android tab widget (up to 2.2 version at least) provides little customizability - it lacks landscape-mode-left side tab and customizing the widget is, well, cumbersome to the least. Also it requires a lot of hacks to implement even slightest customizations that will work on pre-2.2 versions of android. The missing tab widget extracts tab out of core android classes and allows you to:

  1. get horizontal version
    1. with icons left to text or ...
    1. with icons above text
  1. make the most out of the tab widget

See below examples on how the widget can look like.

| **Original widget** | |
|:--------------------|:|
| ![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/662f9729-bce8-434a-910d-dfc8830f6179/00000003.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/662f9729-bce8-434a-910d-dfc8830f6179/00000003.png) | ![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/4c0897e1-740f-4b03-a1e6-945e41ad8d44/00000004.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/4c0897e1-740f-4b03-a1e6-945e41ad8d44/00000004.png) |
| **The Missing Tab Widget** | |
|![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/6d36f971-30f8-419e-8111-756984ab186e/00000006.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/6d36f971-30f8-419e-8111-756984ab186e/00000006.png) | ![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/1ee56d35-59f5-45af-8fff-ea208c20c258/00000005.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/1ee56d35-59f5-45af-8fff-ea208c20c258/00000005.png) |
| **The Missing Tab Widget with icons above titles** | |
|![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/6d36f971-30f8-419e-8111-756984ab186e/00000006.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/6d36f971-30f8-419e-8111-756984ab186e/00000006.png) | ![http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/7aa414c7-abfb-4884-b631-5398a9188b87/00000058.png](http://content.screencast.com/users/jarekpotiuk/folders/Jing/media/7aa414c7-abfb-4884-b631-5398a9188b87/00000058.png) |