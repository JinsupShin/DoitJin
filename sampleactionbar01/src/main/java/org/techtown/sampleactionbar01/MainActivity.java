package org.techtown.sampleactionbar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    ActionBar abar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abar = this.getSupportActionBar();
        abar.setSubtitle("옵션바 살펴보기");
        textView = (TextView) findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abar.setLogo(R.drawable.home);
                abar.setDisplayOptions(android.app.ActionBar.DISPLAY_SHOW_HOME|
                        android.app.ActionBar.DISPLAY_USE_LOGO);
            }
        });
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
