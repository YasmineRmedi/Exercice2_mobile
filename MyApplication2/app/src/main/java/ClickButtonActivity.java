import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import android.widget.Toast;

import com.example.myapplication.R;

public class ClickButtonActivity extends Activity {
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick (View v){
                Toast.makeText(getApplication(),"Boutton cliqué",1000).show();

            }
        });
    }
}
