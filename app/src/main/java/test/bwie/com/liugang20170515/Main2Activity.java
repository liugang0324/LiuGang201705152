package test.bwie.com.liugang20170515;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;


/**
 * @ Description:业务操作类
 * @ Date:2017/5/15
 * @ Author:刘刚
 */

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast toast = Toast.makeText(this, "跳转成功", Toast.LENGTH_SHORT);
        // 修改吐司对齐方式
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
