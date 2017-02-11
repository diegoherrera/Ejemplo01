package com.codigointeractivo.ejemplo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ejemplo01","entro al metodo onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ejemplo01","entro al metodo onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ejemplo01","entro al metodo onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ejemplo01","entro al metodo onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ejemplo01","entro al metodo onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ejemplo01","entro al metodo onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ejemplo01","entro al metodo onPause");
    }
}
