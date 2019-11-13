package asap20.com.lestarimulya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import asap20.com.lestarimulya.adapter.PelangganAdapter;
import asap20.com.lestarimulya.database.DatabaseHelper;
import asap20.com.lestarimulya.model.Pelanggan;

public class DataPelangganActivity extends AppCompatActivity {
    private static final String TAG = "DataPelangganActivity";

    List<Pelanggan> pelangganList;
    private DatabaseHelper dbHelper;
    protected Cursor cursor;
    String[] daftar;
    String[] uid;
    ListView listPelanggan;

    RecyclerView recyclerView;
    PelangganAdapter rvAdapter;
    private ProgressDialog dialog;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pelanggan);

        dialog = new ProgressDialog(DataPelangganActivity.this);
        dialog.setMessage("Loading...");
        dialog.show();

        dbHelper = new DatabaseHelper(this);

        refreshList();
    }

    public void refreshList(){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM customer", null);
        daftar = new String[cursor.getCount()];
        uid = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1).toString();
            uid[cc] = cursor.getString(0);
        }
        listPelanggan = findViewById(R.id.list_pelanggan);
        listPelanggan.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        dialog.dismiss();
        listPelanggan.setSelected(true);
        listPelanggan.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                Log.d(TAG, "onItemClick: " + arg2);
                final String selection = uid[arg2]; //.getItemAtPosition(arg2).toString();
                Log.d(TAG, "onItemClick: " + selection);
                final CharSequence[] dialogitem = {"Lihat Biodata", "Pembelian", "Hapus Biodata"};
                AlertDialog.Builder builder = new AlertDialog.Builder(DataPelangganActivity.this);
                builder.setTitle("Pilihan");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch(item){
                            case 0 :
                                Intent i = new Intent(getApplicationContext(), DetailPelanggan.class);
                                i.putExtra("ID", selection);
                                startActivity(i);
                                break;
                            case 1 :
                                Intent in = new Intent(getApplicationContext(), Transaksi.class);
                                in.putExtra("ID", selection);
                                startActivity(in);
                                break;
                            case 2 :

                                break;
                        }
                    }
                });
                builder.create().show();
            }});
        ((ArrayAdapter)listPelanggan.getAdapter()).notifyDataSetInvalidated();
    }

}
