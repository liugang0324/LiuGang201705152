package test.bwie.com.liugang20170515;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Description:主业务操作类
 * @ Date:2017/5/15
 * @ Author:刘刚
 */

public class MainActivity extends AppCompatActivity {

    private static ListView lv;
    private static List<Map<String, Object>> mData;
    private static MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "学习");
        map.put("content", "所谓学习就是从一个把别人的思想变成自己思想的一个过程");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "旅行");
        map.put("content", "所谓旅行就是从一个自己呆腻的地方到另一个人呆腻的地方");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "生活");
        map.put("content", "所谓生活就是努力把现实中的自己变得更接近梦想中的自己的一个过程");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "梦想");
        map.put("content", "所谓梦想就是要不就是用来逃避现实的幻想，要不就是把梦想变成现实的过程");
        list.add(map);

        return list;
    }
        private void initData() {
            mData = getData();
        adapter = new MyAdapter(mData, MainActivity.this);
        lv.setAdapter(adapter);       //设置适配器

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              //Intent跳转页面
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }

        });

    }

    public static void delete(final int position){
        mData.remove(position);   //从list中移除该条目
        lv.setAdapter(adapter);  //重新设置适配器
    }
    private void initView() {
        lv = (ListView) findViewById(R.id.lv);   //初始化控件

    }
}
