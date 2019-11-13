package asap20.com.lestarimulya;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

import asap20.com.lestarimulya.database.DatabaseHelper;

public class DetailPelanggan extends AppCompatActivity {

    protected Cursor cursor;
    MaterialEditText tvAlamat, tvTabungan, tvHutang, tvNoHp;
    TextView tvNama;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pelanggan);

        dbHelper = new DatabaseHelper(this);
        tvNama = findViewById(R.id.detail_nama);
        tvAlamat = findViewById(R.id.detail_alamat);
        tvTabungan = findViewById(R.id.detail_tabungan);
        tvHutang = findViewById(R.id.detail_hutang);
        tvNoHp = findViewById(R.id.detail_no_hp);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM customer WHERE id = '" +
                getIntent().getStringExtra("ID") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount()>0){
            cursor.moveToPosition(0);
            tvNama.setText(cursor.getString(1));
            tvAlamat.setText(cursor.getString(2));
            tvTabungan.setText(String.valueOf(cursor.getDouble(3)));
            tvHutang.setText(String.valueOf(cursor.getDouble(4)));
        }
    }
}
