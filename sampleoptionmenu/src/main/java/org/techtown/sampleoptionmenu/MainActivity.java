package org.techtown.sampleoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();

        switch (curId){
            case R.id.menu_refresh:
                Toast.makeText(this, "새로고침 메뉴가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                Log.d("menu_refresh", "새로고침 메뉴가 선택되었습니다.");
                break;
            case R.id.menu_search:
                Toast.makeText(this, "검색 메뉴가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                Log.d("menu_search", "검색 메뉴가 선택되었습니다.");
                break;
            case R.id.menu_setting:
                Toast.makeText(this, "설정 메뉴가 선택되었습니다..", Toast.LENGTH_SHORT).show();
                Log.d("menu_settings", "설정 메뉴가 선택되었습니다.");
                break;
                default:
                    break;
        }
        return super.onOptionsItemSelected(item);
    }
}
