package com.example.quiz2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder>{

    private List<Noticia> datos;

    public UsuarioAdaptador(List<Noticia> datos){
        this.datos = datos;
    }


    @NonNull
    @Override
    public UsuarioAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdaptador.ViewHolder holder, int position) {
        Noticia dato = datos.get(position);
        holder.bind(dato);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_not, txt_desc_not;
        ImageView img_not;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_not = itemView.findViewById(R.id.txt_nombre_not);
            txt_desc_not = itemView.findViewById(R.id.txt_desc_not);
            img_not = itemView.findViewById(R.id.img_not);
        }

        public void bind(Noticia dato){
            txt_nombre_not.setText(dato.getNombre());
            txt_desc_not.setText(dato.getDesc());
            Picasso.get().load(dato.getImagen()).into(img_not);
        }
    }
}
