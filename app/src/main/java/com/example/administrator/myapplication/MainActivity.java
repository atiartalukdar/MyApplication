package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String text="",part1="",part2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void Zero(View v){
        text+="0";
        textView.setText(text);
    }
    public void One(View v){
        text+="1";
        textView.setText(text);
    }
    public void Two(View v){
        text+="2";
        textView.setText(text);
    }
    public void Three(View v){
        text+="3";
        textView.setText(text);
    }
    public void Four(View v){
        text+="4";
        textView.setText(text);
    }
    public void Five(View v){
        text+="5";
        textView.setText(text);
    }
    public void Six(View v){
        text+="6";
        textView.setText(text);
    }
    public void Seven(View v){
        text+="7";
        textView.setText(text);
    }
    public void Eight(View v){
        text+="8";
        textView.setText(text);
    }
    public void Nine(View v){
        text+="9";
        textView.setText(text);
    }
    public void Point(View v){
        text+=".";
        textView.setText(null);
    }

    public void Plus(View v){
        part1 = text;
        text="";
        text+="+";
        textView.setText(text);
    }
    public void Minus(View v){
        part1 = text;
        text="";
        text+="-";
        textView.setText(text);
    }
    public void Multiple(View v){
        part1 = text;
        text="";
        text+="*";
        textView.setText(text);
    }
    public void Divide(View v){
        part1 = text;
        text="";
        text+="/";
        textView.setText(text);
    }

    public void Equal(View v){

        int p1=0,p2=0,ans=0;
        String answer="";
        char p = text.charAt(0);
        part2=text.substring(1);
        text="";
        p1=Integer.parseInt(part1);
        p2=Integer.parseInt(part2);

        if(p=='/'){
            ans = p1/p2;
        }
        if(p=='*'){
            ans = p1*p2;
        }
        if(p=='-'){
            ans = p1-p2;
        }
        if(p=='+'){
            ans = p1+p2;
        }
        answer = Integer.toString(ans);
        textView.setText(""+answer);
    }
























    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
