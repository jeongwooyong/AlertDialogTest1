package com.example.alertdialogtest1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        AlertDialog.Builder alertDialogBuildder = new AlertDialog.Builder(this);
        alertDialogBuildder.setMessage("결제하시겠습니까?");
        alertDialogBuildder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int f) {
                        Toast.makeText(MainActivity.this,"결제가 완료되었습니다.",
                                Toast.LENGTH_LONG).show();
                    }
                }
        );

        alertDialogBuildder.setPositiveButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"결제가 취소되었습니다.",
                                Toast.LENGTH_LONG).show();
                        finish();
                    }
                }
        );
        AlertDialog alertDialog = alertDialogBuildder.create();
        alertDialog.show();
    }
}