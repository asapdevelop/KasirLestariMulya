package asap20.com.lestarimulya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import asap20.com.lestarimulya.database.DatabaseHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnData, btnPembelian, btnTambahTabungan, btnTarikTunai, btnBayarHutang, btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnData = findViewById(R.id.btn_data_pelanggan);
        btnPembelian = findViewById(R.id.btn_pembelian);
        btnTambahTabungan = findViewById(R.id.btn_tambah_tabungan);
        btnTarikTunai = findViewById(R.id.btn_tarik_tunai);
        btnBayarHutang = findViewById(R.id.btn_bayar_hutang);
        btnKeluar = findViewById(R.id.btn_keluar);
        btnData.setOnClickListener(this);
        btnPembelian.setOnClickListener(this);
        btnTambahTabungan.setOnClickListener(this);
        btnTarikTunai.setOnClickListener(this);
        btnBayarHutang.setOnClickListener(this);
        btnKeluar.setOnClickListener(this);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);

        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) btnData.getLayoutParams();
        params.width = (getResources().getDisplayMetrics().widthPixels)/3;
        params.height = ((getResources().getDisplayMetrics().widthPixels)/2);
        btnData.setLayoutParams(params);
        btnPembelian.setLayoutParams(params);
        btnTambahTabungan.setLayoutParams(params);
        btnTarikTunai.setLayoutParams(params);
        btnBayarHutang.setLayoutParams(params);
        btnKeluar.setLayoutParams(params);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_data_pelanggan:
                startActivity(new Intent(MainActivity.this, DataPelangganActivity.class));
                break;
            case R.id.btn_pembelian:
                break;
            case R.id.btn_tambah_tabungan:
                break;
            case R.id.btn_tarik_tunai:
                break;
            case R.id.btn_bayar_hutang:
                break;
            case R.id.btn_keluar:
                finish();
                break;
        }
    }
}
