package com.codepath.sampletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String str = getIntent().getStringExtra("txtItem");
        EditText edt = (EditText)findViewById(R.id.etUpdateItem);
        edt.setText(str);
    }

    public void onSaveItem(View v){
        EditText edt = (EditText)findViewById(R.id.etUpdateItem);
        String str = edt.getText().toString();
        Intent data = new Intent();
        data.putExtra("update", str);
        setResult(RESULT_OK, data);
        finish();
    }


}
