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
import asap20.com.lestarimulya.model.Pelanggan;

public class PelangganAdapter extends RecyclerView.Adapter<PelangganAdapter.ViewHolder> {
    View mView;

    private Context context;
    List<Pelanggan> pelangganList;

    public PelangganAdapter(Context context, List<Pelanggan> pelangganList) {
        this.context = context;
        this.pelangganList = pelangganList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view_pelanggan, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cv_nama.setText(pelangganList.get(position).getNama());
        holder.cv_alamat.setText(pelangganList.get(position).getAlamat());
        holder.cv_tabungan.setText(String.valueOf(pelangganList.get(position).getTotalTabungan()));
        holder.cv_hutang.setText(String.valueOf(pelangganList.get(position).getTotalTabungan()));
    }

    @Override
    public int getItemCount() {
        return pelangganList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public RelativeLayout root;

        public TextView cv_nama;
        public TextView cv_alamat;
        public TextView cv_tabungan;
        public TextView cv_hutang;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            root = itemView.findViewById(R.id.layout_card_view);

            cv_nama = itemView.findViewById(R.id.cv_nama);
            cv_alamat = itemView.findViewById(R.id.cv_alamat);
            cv_tabungan = itemView.findViewById(R.id.cv_tabungan);
            cv_hutang = itemView.findViewById(R.id.cv_hutang);

            mView = itemView;

        }
    }
}
