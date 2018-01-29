# ObedientTextView [![](https://jitpack.io/v/dyguests/ObedientTextView.svg)](https://jitpack.io/#dyguests/ObedientTextView)

A TextView that can wrap_content and not outside it's parent viewGroup.

一个自适应的TextView。实现了wrap_content且不会超出其父布局边界的功能。

![gsample](/graphics/cap.gif)

# Usage

module gradle:

```groovy
	dependencies {
	        compile 'com.github.dyguests:ObedientTextView:v1.0'
	}
```

in xml:

```xml
  <com.fanhl.obedienttextview.ObedientTextView
            android:layout_width="wrap_content"
            android:layout_weight="1"
                            .../>
```

**notice:** you must set `android:layout_width="wrap_content"` and `android:layout_weight="1"`.
