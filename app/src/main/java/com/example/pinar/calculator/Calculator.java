package com.example.pinar.calculator;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.src;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnToplama,btnCikarma,btnCarpma,btnBolme,btnSifirla,btnHesapla;
    TextView txtHesap;
    private Integer ilkDeger=0, sonuc=0;
    private String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnToplama=(Button) findViewById(R.id.btntoplama);
        btnCikarma=(Button) findViewById(R.id.btncikarma);
        btnCarpma=(Button) findViewById(R.id.btncarpma);
        btnBolme=(Button) findViewById(R.id.btnbolme);
        btnSifirla=(Button) findViewById(R.id.btnSifirla);
        btnHesapla=(Button) findViewById(R.id.btnHesapla);
        txtHesap=(TextView) findViewById(R.id.textView2);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnToplama.setOnClickListener(this);
        btnCikarma.setOnClickListener(this);
        btnCarpma.setOnClickListener(this);
        btnBolme.setOnClickListener(this);
        btnSifirla.setOnClickListener(this);
        btnHesapla.setOnClickListener(this);}

    public void onClick(View src) {
        int hane = txtHesap.getText().length();

        if (hane < 9) {
            switch (src.getId ( )) {
                case R.id.btn0:
                    txtHesap.setText ( "0" );
                    ilkDeger = 0;
                    break;
                case R.id.btn1:
                    txtHesap.setText ( "1" );
                    ilkDeger=1;
                    break;
                case R.id.btn2:
                    txtHesap.setText (  "2" );
                    ilkDeger=2;
                    break;
                case R.id.btn3:
                    txtHesap.setText ( "3" );
                    ilkDeger=3;
                    break;
                case R.id.btn4:
                    txtHesap.setText ( "4" );
                    ilkDeger=4;
                    break;
                case R.id.btn5:
                    txtHesap.setText ( "5" );
                    ilkDeger=5;
                    break;
                case R.id.btn6:
                    txtHesap.setText ( "6" );
                    ilkDeger=6;
                    break;
                case R.id.btn7:
                    txtHesap.setText ( "7" );
                    ilkDeger=7;
                    break;
                case R.id.btn8:
                    txtHesap.setText ( "8" );
                    ilkDeger=8;
                    break;
                case R.id.btn9:
                    txtHesap.setText ( "9" );
                    ilkDeger=9;
                    break;
                case R.id.btntoplama: {
                    if (!txtHesap.getText().toString().equals("")) {
                        Intenger.parseInt(txtHesap.getText().toString());
                        //txtHesap.setText ( "" );
                        islem = "Toplama";
                        sonuc = sonuc + ilkDeger;
                       // ilkDeger = null;
                    }
                    /*else {
                        Toast.makeText ( this, "Değer Giriniz", Toast.LENGTH_SHORT ).show ( );
                    }*/
                    break;
                }
                case R.id.btncikarma: {
                    if (!txtHesap.getText().toString().equals("")) {
                        Intenger.parseInt(txtHesap.getText().toString());
                        //txtHesap.setText ( "" );
                        islem = "Cikarma";
                        sonuc =  ilkDeger - sonuc;
                        //ilkDeger = null;
                    }
//                    else {
//                        Toast.makeText ( this, "Değer Giriniz", Toast.LENGTH_SHORT ).show ( );
//                    }
               break;
                }
                case R.id.btncarpma:
                {
                   // if (!txtHesap.getText ( ).toString ( ).equals ( "" )) {
                        Intenger.parseInt ( (txtHesap.getText ( ).toString ( )) );
                       // txtHesap.setText ( "" );
                        islem = "Carpma";
                        if(ilkDeger != 0 && sonuc != 0) {
                            sonuc = sonuc * ilkDeger;
                            //ilkDeger = null;
                        }
                 //  }
// else {
//                        Toast.makeText ( this, "Değer Giriniz", Toast.LENGTH_SHORT ).show ( );
//                    }
                    break;
                }
                case R.id.btnbolme: {
                    if (!txtHesap.getText().toString().equals("")) {
                        Intenger.parseInt(txtHesap.getText().toString());
                        //txtHesap.setText ( "" );
                        islem = "Bolme";
                        sonuc = sonuc / ilkDeger;
                        //ilkDeger = null;
                    }
//                    else {
//                        Toast.makeText ( this, "Değer Giriniz", Toast.LENGTH_SHORT ).show ( );
//                    }
                    break;
                }

                case R.id.btnSifirla:
                {
                    ilkDeger=0;
                    sonuc=0;
                    txtHesap.setText("");
                    break;
                }
                case R.id.btnHesapla:
 //                   if (!txtHesap.getText ( ).toString ( ).equals ( "" ) && !String.valueOf ("ilkDeger").equals ( "0" )) {
                     if (islem.equals ("Toplama")) {
                            sonuc = sonuc + ilkDeger;
                         //ilkDeger + Integer.parseInt(txtHesap.getText ().toString ());
                        } else if (islem.equals ("Cikarma")) {
                            sonuc = sonuc - ilkDeger ;
                        } else if (islem.equals ("Bolme")) {
                           sonuc = sonuc / ilkDeger;
                        } else if (islem.equals ("Carpma")) {
                           sonuc = sonuc * ilkDeger;
                       }
                        txtHesap.setText ( String.valueOf ( sonuc ) );

//                    } else {
//                        Toast.makeText ( this, "Değer Giriniz", Toast.LENGTH_SHORT ).show ( );
//
//                    }
//                    if (R.id.btnSifirla == src.getId() );





            }
        }
    }



    }





