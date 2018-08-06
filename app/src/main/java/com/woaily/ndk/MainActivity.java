package com.woaily.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 案例参考：https://blog.csdn.net/eastmoon502136/article/details/79243025
 * 提示：
 * 1.可以在NativeHelper中写好方法名，然后通过错误提示自动在cpp中生成方法名
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(NativeHelper.stringFromJNI()+ NativeHelper.sumFromJNI(4,5));
    }

}
