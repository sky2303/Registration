package com.example.akash.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView name_text;
    private TextView branch_text;
    private TextView rollnumber_text;
    private TextView course1_text;
    private TextView course2_text;
    private TextView course3_text;
    private TextView course4_text;
    String TAG="event";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onCreate of SecondActivity",Toast.LENGTH_LONG).show();
        name_text=(TextView)findViewById(R.id.textView15);
        branch_text=(TextView)findViewById(R.id.textView16);
        rollnumber_text=(TextView)findViewById(R.id.textView17);
        course1_text=(TextView)findViewById(R.id.textView18);
        course2_text=(TextView)findViewById(R.id.textView19);
        course3_text=(TextView)findViewById(R.id.textView20);
        course4_text=(TextView)findViewById(R.id.textView21);

        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        String rollnumber=intent.getStringExtra("rollnumber");
        String branch=intent.getStringExtra("branch");
        String course1=intent.getStringExtra("course1");
        String course2=intent.getStringExtra("course2");
        String course3=intent.getStringExtra("course3");
        String course4=intent.getStringExtra("course4");

        name_text.setText(name);
        branch_text.setText(branch);
        rollnumber_text.setText(rollnumber);
        course1_text.setText(course1);
        course2_text.setText(course2);
        course3_text.setText(course3);
        course4_text.setText(course4);
    }

    public void onStart() {


        super.onStart();
        Log.d(TAG, "onStart() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onStart of SecondActivity",Toast.LENGTH_LONG).show();
    }
    public void onRestart() {


        super.onRestart();
        Log.d(TAG, "onRestart() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onRestart of SecondActivity",Toast.LENGTH_LONG).show();
    }
    public void onResume() {


        super.onResume();
        Log.d(TAG, "onResume() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onResume of SecondActivity",Toast.LENGTH_LONG).show();
    }
    public  void onPause() {

        super.onPause();
        Log.d(TAG, "onPause() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onPause of SecondActivity",Toast.LENGTH_LONG).show();
    }
    public void onStop() {


        super.onStop();
        Log.d(TAG, "onStop() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onStop of SecondActivity",Toast.LENGTH_LONG).show();
    }
    public void onDestroy() {


        super.onDestroy();
        Log.d(TAG, "onDestroy() of SecondActivity");
        Toast.makeText(SecondActivity.this,"onDestroy of SecondActivity",Toast.LENGTH_LONG).show();
    }
}
