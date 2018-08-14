package com.example.akash.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText name_edit;
    private EditText rollnumber_edit;
    private EditText branch_edit;
    private EditText course1_edit;
    private EditText course2_edit;
    private EditText course3_edit;
    private EditText course4_edit;
    String TAG="event";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "onCreate() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onCreate of FirstActivity",Toast.LENGTH_LONG).show();
        name_edit=(EditText)findViewById(R.id.editText);
        rollnumber_edit=(EditText)findViewById(R.id.editText2);
        branch_edit=(EditText)findViewById(R.id.editText3);
        course1_edit=(EditText)findViewById(R.id.editText4);
        course2_edit=(EditText)findViewById(R.id.editText5);
        course3_edit=(EditText)findViewById(R.id.editText6);
        course4_edit=(EditText)findViewById(R.id.editText7);

        Button submit=(Button)findViewById(R.id.button);
        Button clear=(Button)findViewById(R.id.button2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String name=name_edit.getText().toString();
                 String rollnumber=rollnumber_edit.getText().toString();
                 String branch=branch_edit.getText().toString();
                 String course1=course1_edit.getText().toString();
                 String course2=course2_edit.getText().toString();
                 String course3=course3_edit.getText().toString();
                 String course4=course4_edit.getText().toString();
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("rollnumber",rollnumber);
                intent.putExtra("branch",branch);
                intent.putExtra("course1",course1);
                intent.putExtra("course2",course2);
                intent.putExtra("course3",course3);
                intent.putExtra("course4",course4);
                startActivity(intent);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_edit.setText("");
                rollnumber_edit.setText("");
                branch_edit.setText("");
                course1_edit.setText("");
                course2_edit.setText("");
                course3_edit.setText("");
                course4_edit.setText("");

            }
        });





    }
    public void onStart() {


        super.onStart();
        Log.d(TAG, "onStart() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onStart of FirstActivity",Toast.LENGTH_LONG).show();


    }
    public void onRestart() {


        super.onRestart();
        Log.d(TAG, "onRestart() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onRestart of FirstActivity",Toast.LENGTH_LONG).show();


    }
    public void onResume() {


        super.onResume();
        Log.d(TAG, "onResume() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onResume of FirstActivity",Toast.LENGTH_LONG).show();

    }
    public  void onPause() {

        super.onPause();
        Log.d(TAG, "onPause() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onPause of FirstActivity",Toast.LENGTH_LONG).show();

    }
    public void onStop() {


        super.onStop();
        Log.d(TAG, "onStop() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onStop of FirstActivity",Toast.LENGTH_LONG).show();

    }
    public void onDestroy() {


        super.onDestroy();
        Log.d(TAG, "onDestroy() of FirstActivity");
        Toast.makeText(FirstActivity.this,"onDestroy of FirstActivity",Toast.LENGTH_LONG).show();

    }
}
