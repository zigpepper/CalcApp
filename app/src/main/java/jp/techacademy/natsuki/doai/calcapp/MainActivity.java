package jp.techacademy.natsuki.doai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    public void onClick(View v) {
        String edit1 = mEditText1.getText().toString();
        String edit2 = mEditText2.getText().toString();
        double editText1 = Double.parseDouble(edit1);
        double editText2 = Double.parseDouble(edit2);

        double kekka = 0;

        if (v.getId() == R.id.button1) {
            kekka = editText1 + editText2;
        } else if (v.getId() == R.id.button2) {
            kekka = editText1 - editText2;
        } else if (v.getId() == R.id.button3) {
            kekka = editText1 * editText2;
        } else {
            kekka = editText1 / editText2;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE", kekka);
        startActivity(intent);

    }
}
