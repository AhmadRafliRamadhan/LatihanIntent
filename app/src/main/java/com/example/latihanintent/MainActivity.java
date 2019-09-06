package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity =findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithActivityData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithActivityData.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnMoveObject = findViewById(R.id.btn_move_activity_objek);
        btnMoveObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_move_activity_objek:
                Intent keActivityKedua = new Intent(MainActivity.this, ActivityTerimaObjek.class);
                MyBio biodataRafli = new MyBio("Rafli",15);
                keActivityKedua.putExtra("biodata", biodataRafli);
                startActivity(keActivityKedua);
                break;
            case R.id.btn_dial_number:
                String phonenumber = "081210841382";
                Intent dialPhoneIntent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phonenumber));
                startActivity(dialPhoneIntent);
                break;





    }
    }
}
