# ItemTouchHelper
ItemTouchHelper修改源码实现非侵入式侧滑菜单，长按拖拽,百公里加速只需要三行代码
[![](https://jitpack.io/v/mrme2014/ItemTouchHelper.svg)](https://jitpack.io/#mrme2014/ItemTouchHelper)

### 集成方式:
```java
 dependencies {
	        compile 'com.qiaomu:libitemtouchhelper:1.0.2'
	}
```
### 使用方式:
```java

	
 ItemTouchHelperCallback callback = new ItemTouchHelperCallback(ItemTouchHelper.UP|ItemTouchHelper.DOWN,adapter);
 ItemTouchHelper helper = new ItemTouchHelper(callback);
 helper.attachToRecyclerView(recylerView);
 ```

### 运行时图
 
![image](https://github.com/mrme2014/ItemTouchHelper/raw/master/imgs/1.gif)
