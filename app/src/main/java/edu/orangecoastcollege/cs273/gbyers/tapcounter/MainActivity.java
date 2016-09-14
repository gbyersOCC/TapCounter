package edu.orangecoastcollege.cs273.gbyers.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Controller for TapCounter
 * Provides functionality for Model Counter.java
 */
public class MainActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView mCountView;

    private Counter mCounter = new Counter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associate reference to respected widget
        mCountView = (TextView) findViewById(R.id.count_text_view);
        mTapButton = (Button)findViewById(R.id.tap_button);

        //before button is originally tapped provide a zero for textView
        mCountView.setText(mCounter.getCount());

        //hook up a click listener for button press
        mTapButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {

                //call method that increments and then call setText with object method call
                mCounter.addCount();
                mCountView.setText(mCounter.getCount());
            }
        });
    }


}
