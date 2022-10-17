package com.example.fcm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Bundle bundle = getIntent().getExtras();

		TextView titleView = findViewById(R.id.titleView);
		titleView.append(bundle.getString("title"));
		TextView bodyView = findViewById(R.id.bodyView);
		bodyView.append(bundle.getString("body"));
	}
}