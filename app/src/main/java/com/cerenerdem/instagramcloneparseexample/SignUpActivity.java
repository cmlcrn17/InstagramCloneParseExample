package com.cerenerdem.instagramcloneparseexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUpActivity extends AppCompatActivity {

    EditText kullaniciadi;
    EditText sifre;

    Button oturumac;
    Button uyeol;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        kullaniciadi = (EditText) findViewById(R.id.edt_KullaniciAdi);
        sifre = (EditText) findViewById(R.id.edt_Sifre);
        oturumac = (Button) findViewById(R.id.btn_OturumAc);
        uyeol = (Button) findViewById(R.id.btn_UyeOl);

        intent = new Intent(getApplicationContext(),FeedActivity.class);

        ParseUser parseUser = ParseUser.getCurrentUser();
        if (parseUser != null){
            startActivity(intent);
        }
    }



    public void calistir_OturumAc (View view){

        ParseUser.logInInBackground(kullaniciadi.getText().toString(), sifre.getText().toString(), new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e!=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),user.getUsername().toString() + " Hoşgeldin...",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }
        });


    }

    public void calistir_UyeOl (View view){

        ParseUser user = new ParseUser();
        user.setUsername(kullaniciadi.getText().toString());
        user.setPassword(sifre.getText().toString());
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e!=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Kullanıcı oluşturuldu.",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }
        });
    }
}
