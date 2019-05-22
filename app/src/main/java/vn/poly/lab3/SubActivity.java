package vn.poly.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubActivity extends AppCompatActivity {


    private ListView lvStudent;
    private String[] students = {"Huy","Quynh","Sang","Hue","Huong","Huy","Quynh","Sang","Hue","Huong","Huy","Quynh","Sang","Hue","Huong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        lvStudent = findViewById(R.id.lvStudent);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(SubActivity.this,android.R.layout.simple_list_item_1,students);

        lvStudent.setAdapter(arrayAdapter);

    }
}
