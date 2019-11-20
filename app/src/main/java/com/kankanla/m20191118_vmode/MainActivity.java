package com.kankanla.m20191118_vmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kankanla.m20191118_vmode.ui.main.MainFragment;

/**
 * ViewMode,Fragment,ListView,XML
 * 非同期更新テスト
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
