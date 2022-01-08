package com.example.tasktimerapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Task> __insertionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter<Task> __deletionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter<Task> __updateAdapterOfTask;

  private final SharedSQLiteStatement __preparedStmtOfDeactivateAllTasks;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Task` (`pk`,`task`,`description`,`timer`,`totalTime`,`active`,`isClicked`,`pauseOffset`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getPk());
        if (value.getTask() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTask());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getTimer() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimer());
        }
        if (value.getTotalTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTotalTime());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        final int _tmp_1 = value.isClicked() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        stmt.bindLong(8, value.getPauseOffset());
      }
    };
    this.__deletionAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Task` WHERE `pk` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getPk());
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Task` SET `pk` = ?,`task` = ?,`description` = ?,`timer` = ?,`totalTime` = ?,`active` = ?,`isClicked` = ?,`pauseOffset` = ? WHERE `pk` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getPk());
        if (value.getTask() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTask());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getTimer() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimer());
        }
        if (value.getTotalTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTotalTime());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        final int _tmp_1 = value.isClicked() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        stmt.bindLong(8, value.getPauseOffset());
        stmt.bindLong(9, value.getPk());
      }
    };
    this.__preparedStmtOfDeactivateAllTasks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE task SET active = ? WHERE active = ?";
        return _query;
      }
    };
  }

  @Override
  public Object addTask(final Task task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTask.insert(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTask(final Task task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTask.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTask(final Task task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTask.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void deactivateAllTasks(final boolean inactive, final boolean active) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeactivateAllTasks.acquire();
    int _argIndex = 1;
    final int _tmp = inactive ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    final int _tmp_1 = active ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp_1);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeactivateAllTasks.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Task>> getTasks() {
    final String _sql = "select * from task";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"task"}, false, new Callable<List<Task>>() {
      @Override
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pk");
          final int _cursorIndexOfTask = CursorUtil.getColumnIndexOrThrow(_cursor, "task");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTimer = CursorUtil.getColumnIndexOrThrow(_cursor, "timer");
          final int _cursorIndexOfTotalTime = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTime");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final int _cursorIndexOfIsClicked = CursorUtil.getColumnIndexOrThrow(_cursor, "isClicked");
          final int _cursorIndexOfPauseOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "pauseOffset");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Task _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpTask;
            if (_cursor.isNull(_cursorIndexOfTask)) {
              _tmpTask = null;
            } else {
              _tmpTask = _cursor.getString(_cursorIndexOfTask);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpTimer;
            if (_cursor.isNull(_cursorIndexOfTimer)) {
              _tmpTimer = null;
            } else {
              _tmpTimer = _cursor.getString(_cursorIndexOfTimer);
            }
            final String _tmpTotalTime;
            if (_cursor.isNull(_cursorIndexOfTotalTime)) {
              _tmpTotalTime = null;
            } else {
              _tmpTotalTime = _cursor.getString(_cursorIndexOfTotalTime);
            }
            final boolean _tmpActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActive);
            _tmpActive = _tmp != 0;
            final boolean _tmpIsClicked;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsClicked);
            _tmpIsClicked = _tmp_1 != 0;
            final long _tmpPauseOffset;
            _tmpPauseOffset = _cursor.getLong(_cursorIndexOfPauseOffset);
            _item = new Task(_tmpPk,_tmpTask,_tmpDescription,_tmpTimer,_tmpTotalTime,_tmpActive,_tmpIsClicked,_tmpPauseOffset);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Task getTaskByActive(final boolean active) {
    final String _sql = "SELECT * FROM task WHERE active = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp = active ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPk = CursorUtil.getColumnIndexOrThrow(_cursor, "pk");
      final int _cursorIndexOfTask = CursorUtil.getColumnIndexOrThrow(_cursor, "task");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTimer = CursorUtil.getColumnIndexOrThrow(_cursor, "timer");
      final int _cursorIndexOfTotalTime = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTime");
      final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
      final int _cursorIndexOfIsClicked = CursorUtil.getColumnIndexOrThrow(_cursor, "isClicked");
      final int _cursorIndexOfPauseOffset = CursorUtil.getColumnIndexOrThrow(_cursor, "pauseOffset");
      final Task _result;
      if(_cursor.moveToFirst()) {
        final int _tmpPk;
        _tmpPk = _cursor.getInt(_cursorIndexOfPk);
        final String _tmpTask;
        if (_cursor.isNull(_cursorIndexOfTask)) {
          _tmpTask = null;
        } else {
          _tmpTask = _cursor.getString(_cursorIndexOfTask);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpTimer;
        if (_cursor.isNull(_cursorIndexOfTimer)) {
          _tmpTimer = null;
        } else {
          _tmpTimer = _cursor.getString(_cursorIndexOfTimer);
        }
        final String _tmpTotalTime;
        if (_cursor.isNull(_cursorIndexOfTotalTime)) {
          _tmpTotalTime = null;
        } else {
          _tmpTotalTime = _cursor.getString(_cursorIndexOfTotalTime);
        }
        final boolean _tmpActive;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfActive);
        _tmpActive = _tmp_1 != 0;
        final boolean _tmpIsClicked;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsClicked);
        _tmpIsClicked = _tmp_2 != 0;
        final long _tmpPauseOffset;
        _tmpPauseOffset = _cursor.getLong(_cursorIndexOfPauseOffset);
        _result = new Task(_tmpPk,_tmpTask,_tmpDescription,_tmpTimer,_tmpTotalTime,_tmpActive,_tmpIsClicked,_tmpPauseOffset);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
