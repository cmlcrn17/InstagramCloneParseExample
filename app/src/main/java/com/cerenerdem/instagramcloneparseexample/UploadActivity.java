package com.cerenerdem.instagramcloneparseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class UploadActivity extends AppCompatActivity {

    ImageView fotografyukle;
    EditText aciklama;
    Button butonfotografyukle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        fotografyukle = (ImageView) findViewById(R.id.img_FotografYukle);
        aciklama = (EditText) findViewById(R.id.edt_Aciklama);
        butonfotografyukle = (Button) findViewById(R.id.btn_FotografYukle);

    }

    public void calistir_fotografyukle (View view){


    }
}
