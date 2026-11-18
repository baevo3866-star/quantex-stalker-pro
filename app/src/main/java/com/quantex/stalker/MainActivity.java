
package com.quantex.stalker;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(13, 19, 15));

        TextView title = new TextView(this);
        title.setText("QUANTEX AI\nSTALKER PRO");
        title.setTextColor(Color.rgb(130, 210, 110));
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("\nСИСТЕМА ГОТОВА\n\nPHOTO SCANNER\nАВТОСКАНЕР\nTELEGRAM");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        Button scan = new Button(this);
        scan.setText("ВІДКРИТИ ФОТОСКАНЕР");
        scan.setOnClickListener(v ->
            status.setText("ФОТОСКАНЕР\nОчікує підключення аналізатора графіків")
        );

        layout.addView(title);
        layout.addView(status);
        layout.addView(scan);

        setContentView(layout);
    }
}
