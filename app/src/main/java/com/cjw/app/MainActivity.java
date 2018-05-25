package com.cjw.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cjw.library.view.ShapeImageView;
import com.cjw.library.view.dialog.ContentDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

	@BindView(R.id.shapeImageView)
	ShapeImageView mShapeImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

	}

	@OnClick(R.id.shapeImageView)
	public void onClick(View v){
		new ContentDialog.Builder(this).setContent("haha").setSingleButton().build().showDialog();
	}
}
