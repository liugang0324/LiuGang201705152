package test.bwie.com.liugang20170515;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import static test.bwie.com.liugang20170515.MainActivity.delete;

/**
 * @ Description:适配器类
 * @ Date:2017/5/15
 * @ Author:刘刚
 */

public class MyAdapter extends BaseAdapter {
    private List<Map<String, Object>> list;
    private Context mContext;

    public MyAdapter(List<Map<String, Object>> list, Context context) {
        this.list = list;
        mContext = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(mContext,R.layout.item,null);
            holder=new ViewHolder();
            holder.t1= (TextView) convertView.findViewById(R.id.titl);
            holder.t2= (TextView) convertView.findViewById(R.id.content);
            holder.button= (Button) convertView.findViewById(R.id.delete);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.t1.setText((String)list.get(position).get("title"));
        holder.t2.setText((String)list.get(position).get("content"));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete(position);
            }
        });
        return convertView;
    }
    class ViewHolder{
        TextView t1;
        TextView t2;
        Button button;
    }
}
