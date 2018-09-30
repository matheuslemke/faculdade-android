package com.example.lemke.elmtestes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ExpandableListView;

public class ExpandableTestActivity extends AppCompatActivity
{

    SparseArray<Group> groups = new SparseArray<Group>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_test);
        createData();
        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
                groups);
        listView.setAdapter(adapter);
    }

    public void createData()
    {
        for (int j = 0; j < 5; j++)
        {
            Group group = new Group("Test " + j);
            for (int i = 0; i < 5; i++)
            {
                group.children.add("Sub Item" + i);
            }
            groups.append(j, group);
        }
    }
}
