package ro.pub.cs.systems.eim.practicaltest01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PracticalTest01MainActivity extends AppCompatActivity {
    private TextView leftText;
    private TextView rightText;

    private Button leftButton;
    private Button rightButton;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();


    private class ButtonClickListener implements View.OnClickListener {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            int leftNumberOfClicks = Integer.parseInt(leftText.getText().toString());
            int rightNumberOfClicks = Integer.parseInt(rightText.getText().toString());

            switch (view.getId()) {
                case R.id.left_button:
                    leftNumberOfClicks++;
                    leftText.setText(String.valueOf(leftNumberOfClicks));
                    break;
                case R.id.right_button:
                    rightNumberOfClicks++;
                    rightText.setText(String.valueOf(rightNumberOfClicks));
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);

        leftText = (TextView) findViewById(R.id.left_text);
        rightText = (TextView) findViewById(R.id.right_text);

        leftButton = (Button) findViewById(R.id.left_button);
        rightButton = (Button) findViewById(R.id.right_button);

        leftText.setText(String.valueOf(0));
        rightText.setText(String.valueOf(0));

        leftButton.setOnClickListener(buttonClickListener);
        rightButton.setOnClickListener(buttonClickListener);
    }
}