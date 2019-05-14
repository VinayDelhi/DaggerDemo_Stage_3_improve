package com.example.learndagger.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.learndagger.MyApplication;
import com.example.learndagger.R;
import com.example.learndagger.di.component.DaggerActivityComponent;
import com.example.learndagger.di.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent
                     .builder()
                     .activityModule(new ActivityModule(this))
                     .applicationComponent(((MyApplication)getApplication()).component)
                     .build()
                     .inject(this);

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(mainViewModel.getSomeData());
    }
}
