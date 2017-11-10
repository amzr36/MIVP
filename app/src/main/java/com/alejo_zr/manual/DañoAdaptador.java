package com.alejo_zr.manual;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Alejo on 12/08/2017.
 */

public class DañoAdaptador extends RecyclerView.Adapter<DañoAdaptador.DañoViewHolder/*Lista de los elementos*/> {

    ArrayList<Daño> daños;
    Activity activity;

    public DañoAdaptador(ArrayList<Daño> daños, Activity activity){

        this.daños = daños;
        this.activity = activity;
    }



    @Override
    public DañoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//Da vida al layout CardView

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new DañoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DañoViewHolder dañoViewHolder, int position) {

        final Daño daño = daños.get(position);
        dañoViewHolder.imgFotoCV.setImageResource(daño.getFoto());
        dañoViewHolder.tvDañoCV.setText(daño.getDaño());
        dañoViewHolder.tvdñCV.setText(daño.getDñ());


        dañoViewHolder.imgFotoCV.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(activity, daño.getDaño(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleDano.class);
                intent.putExtra("tipoPav", daño.getTipoPav());
                intent.putExtra("numero",daño.getNumero());
                intent.putExtra("foto", daño.getFoto());
                intent.putExtra("daño", daño.getDaño());
                intent.putExtra("dñ", daño.getDñ());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene la Lista
        return daños.size();
    }

    //Le da vida a los Layouts
    public static class DañoViewHolder extends RecyclerView.ViewHolder {

        //Se crean los objetos

        private ImageView imgFotoCV;
        private TextView tvDañoCV;
        private TextView tvdñCV;

        public DañoViewHolder(View itemView) {
            super(itemView);
            //Asocia el objeto con el respectivo View
            imgFotoCV = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvDañoCV = (TextView) itemView.findViewById(R.id.tvDañoCV);
            tvdñCV = (TextView) itemView.findViewById(R.id.tvdñCV);
        }
    }

}
