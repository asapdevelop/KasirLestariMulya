package asap20.com.lestarimulya.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import asap20.com.lestarimulya.R;
import asap20.com.lestarimulya.model.Barang;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder>{

    View mView;

    private Context context;
    List<Barang> barangList;

    public BarangAdapter(Context context, List<Barang> barangList) {
        this.context = context;
        this.barangList = barangList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view_barang, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return barangList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public RelativeLayout root;

        public TextView cv_id;
        public TextView cv_nama;
        public TextView cv_tanggal;
        public TextView cv_besar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            root = itemView.findViewById(R.id.layout_card_view);

            cv_id = itemView.findViewById(R.id.cv_nama);
            cv_nama = itemView.findViewById(R.id.cv_alamat);
            cv_tanggal = itemView.findViewById(R.id.cv_tabungan);
            cv_besar = itemView.findViewById(R.id.cv_hutang);

            mView = itemView;

        }
    }
}
