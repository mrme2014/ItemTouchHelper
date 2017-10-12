# ItemTouchHelper
ItemTouchHelper修改源码实现非侵入式侧滑菜单，长按拖拽
[![](https://jitpack.io/v/mrme2014/ItemTouchHelper.svg)](https://jitpack.io/#mrme2014/ItemTouchHelper)

#集成依赖：
```java  
step 1.
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	    }
	}
 step 2.
 dependencies {
	        compile 'com.github.mrme2014:ItemTouchHelper:v1.0'
	}
#代码使用方式:
 ItemTouchHelperCallback callback = new ItemTouchHelperCallback(ItemTouchHelperCallback.DRAG_FLAGS_VERTICAL,adapter);
 ItemTouchHelper helper = new ItemTouchHelper(callback);
 helper.attachToRecyclerView(recylerView);
 ```

#运行时图
 
![image](https://github.com/mrme2014/ItemTouchHelper/raw/master/imgs/1.gif)
