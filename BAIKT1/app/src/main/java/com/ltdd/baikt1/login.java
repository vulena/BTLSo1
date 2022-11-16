package com.ltdd.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username,pass;
    CheckBox checkBox;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btlogin = (Button) findViewById(R.id.btn_login_ofLIn);
        username = (EditText) findViewById(R.id.edtName_ofLIn);
        pass=(EditText) findViewById(R.id.edtPass_ofLIn);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        sharedPreferences = getSharedPreferences("Data",MODE_PRIVATE);
        if (sharedPreferences.getBoolean("checked",false)==true){
            username.setText(sharedPreferences.getString("taikhoan",""));
            pass.setText(sharedPreferences.getString("matkhau",""));
            checkBox.setChecked(true);
        }else checkBox.setChecked(false);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().trim().equals("Na") && pass.getText().toString().trim().equals("123")){
                    Intent intent = new Intent(login.this,ListMem.class);
                    startActivity(intent);
                    Toast.makeText(login.this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    String us=username.getText().toString().trim()+"";
                    String pas= pass.getText().toString().trim()+"";
                    if (checkBox.isChecked()) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", us);
                        editor.putString("matkhau", pas);
                        editor.putBoolean("checked", true);
                        editor.commit();
                    }else {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", us);
                        editor.putString("matkhau", pas);
                        editor.putBoolean("checked", false);
                        editor.commit();
                    }
                }else
                    Toast.makeText(login.this,"Sai thông tin tài khoản hoặc mật khẩu. ",Toast.LENGTH_LONG).show();
            }
        });
    }
}