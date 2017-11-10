package com.alejo_zr.manual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PavimentoRigido extends AppCompatActivity {

    ArrayList<Daño> daños;
    private RecyclerView listaDaños;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavimento_flexible);

        listaDaños = (RecyclerView) findViewById(R.id.rvDaño);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaDaños.setLayoutManager(llm);
        inicializarListaDañoFlex();
        inicializarAdaptador();
    }

    public DañoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new DañoAdaptador(daños, this);
        listaDaños.setAdapter(adaptador);
    }


    public void inicializarListaDañoFlex(){

        daños = new ArrayList<Daño>();

        daños.add(new Daño(2,1,R.drawable.grieta_esquina, getString(R.string.grieta_esquina), getString(R.string.g_e)));
        daños.add(new Daño(2,2,R.drawable.grieta_longitudinal,getString(R.string.grieta_longitudinal), getString(R.string.g_l)));
        daños.add(new Daño(2,3,R.drawable.gt,getString(R.string.grieta_transversal), getString(R.string.g_t)));
        daños.add(new Daño(2,4,R.drawable.gp,getString(R.string.grieta_pasadores), getString(R.string.g_p)));
        daños.add(new Daño(2,5,R.drawable.gb,getString(R.string.grietas_bloque), getString(R.string.g_b)));
        daños.add(new Daño(2,6,R.drawable.ga,getString(R.string.grietas_pozos), getString(R.string.g_a)));
        daños.add(new Daño(2,7,R.drawable.sj,getString(R.string.separacion_juntas), getString(R.string.s_j)));
        daños.add(new Daño(2,8,R.drawable.dst,getString(R.string.deterioro_sello), getString(R.string.dst_dsl)));
        daños.add(new Daño(2,9,R.drawable.dpt,getString(R.string.desportillamiento_juntas), getString(R.string.dpt_dpl)));
        daños.add(new Daño(2,10,R.drawable.de,getString(R.string.descascaramiento), getString(R.string.de)));
        daños.add(new Daño(2,11,R.drawable.di,getString(R.string.desintegracion), getString(R.string.di)));
        daños.add(new Daño(2,12,R.drawable.bch_r,getString(R.string.baches), getString(R.string.bch)));
        daños.add(new Daño(2,13,R.drawable.pu_r,getString(R.string.pulimiento), getString(R.string.pu)));
        daños.add(new Daño(2,14,R.drawable.ejl,getString(R.string.escalonamiento_juntas), getString(R.string.ejl_ejt)));
        daños.add(new Daño(2,15,R.drawable.let,getString(R.string.levantamiento_localizado), getString(R.string.let_lel)));
        daños.add(new Daño(2,16,R.drawable.pcha,getString(R.string.parches), getString(R.string.pcha)));
        daños.add(new Daño(2,17,R.drawable.hu,getString(R.string.hundimientos), getString(R.string.hu)));
        daños.add(new Daño(2,18,R.drawable.fr,getString(R.string.fisuracion_retraccion), getString(R.string.fr)));
        daños.add(new Daño(2,19,R.drawable.ft,getString(R.string.fisuras_ligeras), getString(R.string.ft)));
        daños.add(new Daño(2,20,R.drawable.fd,getString(R.string.fisuracion_durabilidad), getString(R.string.fd)));
        daños.add(new Daño(2,21,R.drawable.bot,getString(R.string.bombeo_juntas), getString(R.string.bot_bol)));
        daños.add(new Daño(2,22,R.drawable.mario,getString(R.string.ondulaciones), getString(R.string.on)));
        daños.add(new Daño(2,23,R.drawable.db,getString(R.string.descenso_berma), getString(R.string.db)));
        daños.add(new Daño(2,24,R.drawable.sb_r,getString(R.string.separacion_berma_pavimento), getString(R.string.sb)));
    }




}

