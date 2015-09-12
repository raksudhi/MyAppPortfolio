package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Spotify Streamer Application when clicked*/
    public void spotifyStreamerApp(View view)
    {
        String text = "This button will launch spotify streamer app!";
        displayToast(text);
    }

    /*Scores Application when clicked*/
    public void scoresApp(View view)
    {
        String text = "This button will launch scores app!";
        displayToast(text);
    }

    /*Build it bigger Application when clicked*/
    public void buildItBiggerApp(View view)
    {
        String text = "This button will launch build it bigger app!";
        displayToast(text);
    }

    /*Library Application when clicked*/
    public void libraryApp(View view)
    {
        String text = "This button will launch library app!";
        displayToast(text);
    }

    /*XYZ reader Application when clicked*/
    public void xyzReaderApp(View view)
    {
        String text = "This button will launch xyz reader app!";
        displayToast(text);
    }

    /*Capstone Application when clicked*/
    public void capstoneApp(View view)
    {
        String text = "This button will launch my capstone app!";
        displayToast(text);
    }

    /*Common toast method that can be invoked on the click of any application*/
    private void displayToast(String toastMessage)
    {
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastMessage, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
}
