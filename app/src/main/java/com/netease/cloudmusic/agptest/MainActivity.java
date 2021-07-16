package com.netease.cloudmusic.agptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.netease.cloudmusic.baselib.R;
import com.netease.cloudmusic.bizlib.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(com.netease.cloudmusic.agptest2.R.id.tv_name);
        tv1.setText(R.string.base_lib);

        TextView tv2 = findViewById(com.netease.cloudmusic.agptest2.R.id.tv_name1);
        tv2.setText(com.netease.cloudmusic.bizlib.R.string.biz_lib);


        TextView tv3 = findViewById(com.netease.cloudmusic.agptest2.R.id.tv_name2);
        tv2.setText(com.netease.cloudmusic.agptest2.R.string.new_name);

        Test.t1();


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}