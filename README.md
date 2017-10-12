# ItemTouchHelper
ItemTouchHelper修改源码实现非侵入式侧滑菜单，长按拖拽

#集成依赖：
[![](https://jitpack.io/v/mrme2014/ItemTouchHelper.svg)](https://jitpack.io/#mrme2014/ItemTouchHelper)
 
#代码使用方式:
```java  
 ItemTouchHelperCallback callback = new ItemTouchHelperCallback(ItemTouchHelperCallback.DRAG_FLAGS_VERTICAL,adapter);
 ItemTouchHelper helper = new ItemTouchHelper(callback);
 helper.attachToRecyclerView(recylerView);
 ```

#运行时图
 
![image](https://github.com/mrme2014/ItemTouchHelper/raw/master/imgs/1.gif)
