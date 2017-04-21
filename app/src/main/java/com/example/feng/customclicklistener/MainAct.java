package com.example.feng.customclicklistener;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.feng.customclicklistener.databinding.ActivityMainBinding;

public class MainAct extends AppCompatActivity {


    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.btn.setOnClickListener(new CustomClickListener() {
            @Override
            protected void onNoDoubleClick(View v) {
                // TODO:你想执行的操作
                Toast.makeText(MainAct.this, "view", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
