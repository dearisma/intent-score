package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    private TextView namaHome;
    private TextView namaAway;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        hasil=findViewById(R.id.textView3);

        Bundle extras=getIntent().getExtras();
        if(extras != null){
            String h=getIntent().getExtras().getString( "hasil");
            hasil.setText(h);
        }
    }
}
