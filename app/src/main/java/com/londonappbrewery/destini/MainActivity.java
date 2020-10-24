package com.londonappbrewery.destini;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    // Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Wire up the 3 views from the layout to the member variables:
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        // write the main story text:
        mStoryTextView.setText(R.string.T1_Story);
        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);
        mStoryIndex = 1;

        // Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (mStoryIndex == 1 || mStoryIndex == 2) {
                     mStoryTextView.setText(R.string.T3_Story);
                     mTopButton.setText(R.string.T3_Ans1);
                     mBottomButton.setText(R.string.T3_Ans2);
                     mStoryIndex = 3;
                 } else {
                     // mStoryIndex == 3
                     mStoryTextView.setText(R.string.T6_End);
                     mTopButton.setVisibility(GONE);
                     mBottomButton.setVisibility(GONE);
                     mStoryIndex = 6;
                 }
            }
        });

        // Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(GONE);
                    mBottomButton.setVisibility(GONE);
                    mStoryIndex = 4;
                } else {
                    // mStoryIndex == 3
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(GONE);
                    mBottomButton.setVisibility(GONE);
                    mStoryIndex = 5;
                }
            }
        });
    }

}
