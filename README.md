# ItemTouchHelper
ItemTouchHelper修改源码实现非侵入式侧滑菜单，长按拖拽
```java  
#集成依赖：
 Step 1.Add it in your root build.gradle at the end of repositories:
 allprojects {
    repositories {	
	        maven { url 'https://jitpack.io' }
		}
	}

 Step 2. Add the dependency
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
