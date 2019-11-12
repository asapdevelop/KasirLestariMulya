package asap20.com.lestarimulya.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import asap20.com.lestarimulya.model.Barang;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "KasirLestariMulya.db";
    public static final String DATABASE_LOCATION = "/data/data/asap20.com.lestarimulya/databases/";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "Customer";
    private Context context;
    private SQLiteDatabase db;

    public static final String NAME = "name";
    public static final String PRICE = "price";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void openDatabase(){
        String dbPath = context.getDatabasePath(DATABASE_NAME).getPath();
        if (db != null && db.isOpen()){
            return;
        }
        db = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase(){
        if (db != null){
            db.close();
        }
    }

    //Barang

    public List<Barang> getListBarang (){
        Barang barang = null;
        List<Barang> listBarang = new ArrayList<>();
        openDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM barang", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            barang = new Barang(cursor.getInt(0), cursor.getString(1), cursor.getDouble(2));
            listBarang.add(barang);
            cursor.moveToNext();
        }
        cursor.close();
        return listBarang;
    }

    public double getHargaBarang (String namaBarang){
        double hargaBarang;
        Cursor cursor = db.rawQuery("SELECT hargaBarang FROM barang WHERE namaBarang = '" + namaBarang + "'", null);
        hargaBarang = cursor.getDouble(2);
        cursor.close();
        return hargaBarang;
    }

    //Customer


    //Tabungan

    //Tarik Tunai
}
