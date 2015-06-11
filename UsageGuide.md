

# Introduction #

This is a short guide on using The Missing Tab Widget. It's been requested by many android developers to be able to use Tab widget in landscape mode with tabs sitting at the left instead of sticking at the top and taking precious screen real estate. This is even more important in case of newly appearing tablet devices, where we have quite a lot of space on the side of the device and it's better to use left side navigation rather than top page navigation in landscape mode. Ergonomically it's much better choice.

This widget is dual-layout - in portrait mode it is a standard top-side tab bar, in landscape mode the tabs are at the left. You can choose whether icons in landscape mode should be displayed left of or above the text.

The code is largely based on TabWidget sources from Android Froyo. Actually there are surprisingly small number of modifications to the original code.

# Details #

The code is delivered together with a demo application. It is deliberately not delivered as a library - rather than that it is delivered as a code ready to be copied and customized as needed. It works for virtually any Android OS version, but see the TODOs below for pre Ecclair-2.1 (API-7) versions.

## Integrating widget ##

  1. Copy all res/drawable-port**, all res/drawable-land**, res/layout-land, res/layout-port, res/values/resources.xml to your project
  1. Copy src/pl.polidea.customwidgets to your project
  1. Remove pl.polidea.R. imports from the source files and import your project R file instead (Ctrl-Shift-O in eclipse will do the work)
  1. Update reference to package in layout-land/tab\_content.xml and layout-port/tab\_content.xml

## Using the widget ##
Generally follow http://developer.android.com/resources/tutorials/views/hello-tabwidget.html but in your layout files use pl.polidea.customwidget.TheMissingTabWidget and pl.polidea.customwidget.TheMissingTabHost instead of TabWidget and TabHost. In code also use TheMissingTab.. instead of Tab..

Make sure you either use default layouts associated with TheMissingTabWidgetActivity or create two layouts - one for portrait and one for landscape.

If you use the default layouts , you can also choose between showing icons in landscape mode left of the text or above the text. You can choose the mode by calling setLandscapePicturesAboveTitles(true) method on the Host (default is pictures left of the text).

You can also set the mode in standard xml layout (the widget handles custom pictures\_in\_landscape\_above attribute). An example of such configuration can be found here: http://code.google.com/p/themissingtabwidget/source/browse/res/layout-land/tab_content.xml

  * Example of using the widget in java code with icons left of the text (default) is here: http://code.google.com/p/themissingtabwidget/source/browse/src/pl/polidea/demo/TheMissingTabWidgetDemo.java
  * Example of using the widget in java code with icons above the text  is here: http://code.google.com/p/themissingtabwidget/source/browse/src/pl/polidea/demo/TheMissingTabWidgetDemoWithPicturesAbove.java
  * Examples of layouts that use the widget is here:
    * http://code.google.com/p/themissingtabwidget/source/browse/res/layout-land/tab_content.xml
    * http://code.google.com/p/themissingtabwidget/source/browse/res/layout-port/tab_content.xml

## Customisations ##

One can customize nearly every aspect of the widget. Layouts used be each tab are in http://code.google.com/p/themissingtabwidget/source/browse/res/layout-land/tab_indicator.xml and http://code.google.com/p/themissingtabwidget/source/browse/res/layout-port/tab_indicator.xml in case of icons left of the text or
http://code.google.com/p/themissingtabwidget/source/browse/res/layout-land/tab_indicator_picture_in_landscape_above.xml and http://code.google.com/p/themissingtabwidget/source/browse/res/layout-port/tab_indicator_picture_in_landscape_above.xml
in case of landscape icons above text.

Various setters are exposed in the class - some of them are not accessible in the built-in version. They provide lots of customizations points.

If fully customized version is to be used (no left/right strips, own images for tabs), one can remove all drawable-mdpi, drawable-hdpi and all tab\_focus**, tab\_selected**, tab\_press**etc. drawable).**

# TODO #

This widget is far from perfect. I am happy if other people contribute to it to make it better....

  * Some of the code for styling (retrieving right/left strips from style) has been removed as I did not want to invest too much time in finding how styling attributes should work for that, and they were not needed for either default or fully customized  widget.
  * Layout for landscape mode use hard-coded width. Looking for someone more layout-experienced who can make the width not hard-coded. I tried and failed, but the original tab had it also hard-coded.
  * Currently drawing order is set using setChildrenDrawingOrderEnabled. This method and functionality is only available as of API-7 (Ecclair). I implemented it using reflection, so the code is fine for pre-Ecclair, but look of tabs is not perfect (selected tab is not above all others). If someone could fix that, I'd appreciate.

Enjoy!