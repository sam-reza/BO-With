package org.betteropenwith.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.betteropenwith.HandleItem;
import org.betteropenwith.HiddenApp;
import org.betteropenwith.Site;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

/**
 * Created by Giorgi on 5/29/2014.
 */
public class CupboardSQLiteOpenHelper extends SQLiteAssetHelper {
    static {
        cupboard().register(HandleItem.class);
        cupboard().register(Site.class);
        cupboard().register(HiddenApp.class);
    }

    public CupboardSQLiteOpenHelper(Context context) {
        super(context, "applist.db", null, 12);
    }
}