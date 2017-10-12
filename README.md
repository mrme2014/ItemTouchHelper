# ItemTouchHelper
ItemTouchHelper修改源码实现非侵入式侧滑菜单，长按拖拽

使用方式:
 ItemTouchHelperCallback callback = new ItemTouchHelperCallback(ItemTouchHelperCallback.DRAG_FLAGS_VERTICAL,adapter);
 ItemTouchHelper helper = new ItemTouchHelper(callback);
 helper.attachToRecyclerView(recylerView);
 
 运行时图
 
![image](https://github.com/mrme2014/PermissionHelper/raw/master/imgs/1.gif)
