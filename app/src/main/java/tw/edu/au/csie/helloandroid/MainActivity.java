package tw.edu.au.csie.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText vEtName, vEtId, vEtPassword;
    Button vBtOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vEtId = (EditText)findViewById(R.id.et_id);
        vBtOk = (Button)findViewById(R.id.et_name);

        vBtOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mName = vEtName.getText().toString();
                Toast.makeText(MainActivity.this, "Hello, " + mName, Toast.LENGTH_LONG).show();
            }
        });

    }
}