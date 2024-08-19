package com.example.sos_helper.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.sos_helper.Converters;
import com.example.sos_helper.database.model.LoginClass;
import com.example.sos_helper.database.model.LoginDetailsModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LoginDetailDao_Impl implements LoginDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoginDetailsModel> __insertionAdapterOfLoginDetailsModel;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<LoginDetailsModel> __updateAdapterOfLoginDetailsModel;

  public LoginDetailDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoginDetailsModel = new EntityInsertionAdapter<LoginDetailsModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `loginDetailTable` (`id`,`listData`) VALUES (nullif(?, 0),?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LoginDetailsModel entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = __converters.fromMutableList(entity.getListData());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
      }
    };
    this.__updateAdapterOfLoginDetailsModel = new EntityDeletionOrUpdateAdapter<LoginDetailsModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `loginDetailTable` SET `id` = ?,`listData` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LoginDetailsModel entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = __converters.fromMutableList(entity.getListData());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        statement.bindLong(3, entity.getId());
      }
    };
  }

  @Override
  public void insert(final LoginDetailsModel loginDetailsModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLoginDetailsModel.insert(loginDetailsModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final LoginDetailsModel loginDetailsModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLoginDetailsModel.handle(loginDetailsModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LoginDetailsModel getAllLoginDetails() {
    final String _sql = "Select * from loginDetailTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfListData = CursorUtil.getColumnIndexOrThrow(_cursor, "listData");
      final LoginDetailsModel _result;
      if (_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final List<LoginClass> _tmpListData;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfListData)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfListData);
        }
        _tmpListData = __converters.fromLoginDetailsList(_tmp);
        _result = new LoginDetailsModel(_tmpId,_tmpListData);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
