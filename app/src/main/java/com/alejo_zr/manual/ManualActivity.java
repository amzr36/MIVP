package com.alejo_zr.manual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ManualActivity extends AppCompatActivity {





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

            PDFView pdfView = (PDFView) findViewById(R.id.pdfView);

            pdfView.fromAsset("manual1.pdf").load();

        }
}
