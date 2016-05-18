package app.doron.edmont.parkinghelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSigns;
    Button btnQRScan;
    TextView textViewChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnQRScan:
                        textViewChoose.setText(R.string.btnQRscan);
                        break;
                    case R.id.btnSigns:
                        textViewChoose.setText(R.string.btnSings);
                        break;
                }
            }
        };

        btnSigns = (Button) findViewById(R.id.btnSigns);
        btnQRScan = (Button) findViewById(R.id.btnQRScan);
        textViewChoose = (TextView) findViewById(R.id.textViewChoose);
        btnQRScan.setOnClickListener(onClickListener);
        btnSigns.setOnClickListener(onClickListener);
    }
}
