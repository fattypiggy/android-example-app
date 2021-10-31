package com.williamjing.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

//        Intent intent = new Intent(MainActivity.this, MyActivity.class);
//        startActivity(intent);
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:10086"));
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        intent.putExtra("extra", "from Main");
        startActivity(intent);
//        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
//        builder
//                .setTitle("标题")
//                .setMessage("Message")
//                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                })
//                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                })
//                .show();
    }
}