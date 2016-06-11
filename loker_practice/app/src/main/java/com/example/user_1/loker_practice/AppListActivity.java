package com.example.user_1.loker_practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AppListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        //adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_box_black_36dp),
        //        "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        //adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_circle_black_36dp),
        //        "Circle", "Account Circle Black 36dp") ;
        // 세 번째 아이템 추가.
        //adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_assignment_ind_black_36dp),
        //        "Ind", "Assignment Ind Black 36dp") ;

        adapter.addItem(true, R.drawable.app_icon_kakao, "카카오톡");
        adapter.addItem(false, R.drawable.app_icon_cash, "캐시슬라이드");
        adapter.addItem(false, R.drawable.app_icon_candy, "캔디 카메라");
        adapter.addItem(false, R.drawable.app_icon_clean, "클린 마스터");
        adapter.addItem(false, R.drawable.app_icon_time, "타임 스프레드");
        adapter.addItem(false, R.drawable.app_icon_editor, "포토 에디터");
        adapter.addItem(true, R.drawable.app_icon_piano, "피아노 타일2");

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);

                //String titleStr = item.getTitle();
                //String descStr = item.getDesc();
                //Drawable iconDrawable = item.getIcon();

                // TODO : use item data.
            }
        }) ;
    }

    public void onButtonClicked(View v)
    {
        Intent intentSubActivity=new Intent(AppListActivity.this, ReserveSelectSettingActivity.class);
        startActivity(intentSubActivity);
    }
}
