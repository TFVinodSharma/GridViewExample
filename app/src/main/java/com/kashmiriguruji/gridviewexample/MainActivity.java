package com.kashmiriguruji.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String  [] number={"one","tow","three","four","five","six","seven","eight","nine","ten"};
int [] image ={R.drawable.person1,R.drawable.person2,R.drawable.person1,R.drawable.person2,
        R.drawable.person1,R.drawable.person1,R.drawable.person1,R.drawable.person1
,R.drawable.person1,R.drawable.person1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView Grid=(findViewById(R.id.grid));
        MainAdapter adapter=new MainAdapter (MainActivity.this,number,image);
        Grid.setAdapter(adapter);
        Grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you clicked " +number[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
