package by.kuchinsky.alexandr.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
MyStart myStart = new MyStart();
        Toast.makeText(this, "testik", Toast.LENGTH_SHORT).show();
        getLifecycle().addObserver(myStart);
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
     //   hello = (TextView)findViewById(R.id.hello);
//        Toast.makeText(this, "lol "+ myStart.getStatus(), Toast.LENGTH_SHORT).show();
//hello.setText(myStart.getStatus());

    }
}
