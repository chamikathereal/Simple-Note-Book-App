package lk.javainstitute.app18.model;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper{


    public SQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE notes (\n" +
                "    id           INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    title        TEXT    NOT NULL,\n" +
                "    context      TEXT    NOT NULL,\n" +
                "    date_created TEXT    NOT NULL\n" +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
