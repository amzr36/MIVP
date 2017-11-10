package com.alejo_zr.manual;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class DetalleDano extends AppCompatActivity {

    private ImageView imgFoto;
    private TextView tvDaño, tvdñ;
    private int numero, tipoPav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_dano);

        Bundle parametros = getIntent().getExtras();

        String daño = parametros.getString("daño");
        String dñ = parametros.getString("dñ");
        int numero = parametros.getInt("numero");
        int tipoPav = parametros.getInt("tipoPav");


        tvDaño = (TextView) findViewById(R.id.tvDaño);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

        tvDaño.setText(daño);

        if (tipoPav == 1) {

            switch (numero) {

                case 1:

                    pdfView.fromAsset("fl.pdf").load();
                    break;

                case 2:

                    pdfView.fromAsset("fcl.pdf").load();
                    break;
                case 3:

                    pdfView.fromAsset("fjl.pdf").load();
                    break;
                case 4:

                    pdfView.fromAsset("fml.pdf").load();
                    break;
                case 5:

                    pdfView.fromAsset("fbd.pdf").load();
                    break;
                case 6:

                    pdfView.fromAsset("fb.pdf").load();
                    break;
                case 7:

                    pdfView.fromAsset("pc.pdf").load();
                    break;
                case 8:

                    pdfView.fromAsset("fdc.pdf").load();
                    break;
                case 9:

                    pdfView.fromAsset("fin.pdf").load();
                    break;
                case 10:

                    pdfView.fromAsset("ond.pdf").load();
                    break;
                case 11:

                    pdfView.fromAsset("ab.pdf").load();
                    break;
                case 12:

                    pdfView.fromAsset("hun.pdf").load();
                    break;
                case 13:

                    pdfView.fromAsset("ahu.pdf").load();
                    break;
                case 14:

                    pdfView.fromAsset("dc.pdf").load();
                    break;
                case 15:

                    pdfView.fromAsset("bch.pdf").load();
                    break;
                case 16:

                    pdfView.fromAsset("pch.pdf").load();
                    break;
                case 17:

                    pdfView.fromAsset("dsu.pdf").load();
                    break;
                case 18:

                    pdfView.fromAsset("pa.pdf").load();
                    break;
                case 19:

                    pdfView.fromAsset("pu.pdf").load();
                    break;
                case 20:

                    pdfView.fromAsset("cd.pdf").load();
                    break;
                case 21:

                    pdfView.fromAsset("ex.pdf").load();
                    break;
                case 22:

                    pdfView.fromAsset("su.pdf").load();
                    break;
                case 23:

                    pdfView.fromAsset("cvb.pdf").load();
                    break;
                case 24:

                    pdfView.fromAsset("sb.pdf").load();
                    break;
                case 25:

                    pdfView.fromAsset("afi.pdf").load();
                    break;
                case 26:

                    pdfView.fromAsset("afa.pdf").load();
                    break;

                default:

                    //pdfView.fromAsset("gt.pdf").load();
                    break;

            }

        } else {

            switch (numero) {

                case 1:

                    pdfView.fromAsset("ge.pdf").load();
                    break;

                case 2:

                    pdfView.fromAsset("gl.pdf").load();
                    break;
                case 3:

                    pdfView.fromAsset("gt.pdf").load();
                    break;
                case 4:

                    pdfView.fromAsset("gp.pdf").load();
                    break;

                case 5:

                    pdfView.fromAsset("gb.pdf").load();
                    break;
                case 6:

                    pdfView.fromAsset("ga.pdf").load();
                    break;
                case 7:

                    pdfView.fromAsset("sj.pdf").load();
                    break;

                case 8:

                    pdfView.fromAsset("dst.pdf").load();
                    break;
                case 9:

                    pdfView.fromAsset("dpt.pdf").load();
                    break;
                case 10:

                    pdfView.fromAsset("de.pdf").load();
                    break;

                case 11:

                    pdfView.fromAsset("di.pdf").load();
                    break;
                case 12:

                    pdfView.fromAsset("bch.pdf").load();
                    break;
                case 13:

                    pdfView.fromAsset("pu.pdf").load();
                    break;
                case 14:

                    pdfView.fromAsset("ejl.pdf").load();
                    break;
                case 15:

                    pdfView.fromAsset("let.pdf").load();
                    break;
                case 16:

                    pdfView.fromAsset("pcha.pdf").load();
                    break;
                case 17:

                    pdfView.fromAsset("hu.pdf").load();
                    break;
                case 18:

                    pdfView.fromAsset("fr.pdf").load();
                    break;
                case 19:

                    pdfView.fromAsset("ft.pdf").load();
                    break;
                case 20:

                    pdfView.fromAsset("fd.pdf").load();
                    break;
                case 21:

                    pdfView.fromAsset("bot.pdf").load();
                    break;
                case 22:

                    pdfView.fromAsset("on.pdf").load();
                    break;
                case 23:

                    pdfView.fromAsset("db.pdf").load();
                    break;
                case 24:

                    pdfView.fromAsset("sb.pdf").load();
                    break;
                default:
                    pdfView.fromAsset("gt.pdf").load();
                    break;
            }

        }
    }
}



