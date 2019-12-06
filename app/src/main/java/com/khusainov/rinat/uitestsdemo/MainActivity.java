package com.khusainov.rinat.uitestsdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
        mTextView = findViewById(R.id.tv_text);
        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(getResources().getString(R.string.hello_world));
            }
        });
    }

    private void initRecycler() {
        mRecyclerView = findViewById(R.id.recycler);
        mRecyclerView.setAdapter(new UIAdapter());
    }
}
