package jp.projectoffline.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean zero = false; //最大の位を0にしないため
    boolean enzan = false; //数字が入力されていないときに記号を押させないため


    String string1 = ""; //表示する数字
    String string2 = "";//記号
    int[] array1 = new int[100];//数字

    int i = 0; //演算回数+1 or 要素の数
    int k = 0; //演算途中で減った配列の要素数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Dark theme
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", true)){
            setTheme(R.style.AppTheme_Dark);
        }

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //表示
        final TextView textView = findViewById(R.id.textView1);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);

        //初期化
        for(int j = 0; j < 100; j++){
            array1[j] = 0;
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "1";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "1";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "2";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "2";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "3";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "3";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "4";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "4";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "5";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "5";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "6";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "6";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "7";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "7";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "8";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "8";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!zero){
                    string1 = "9";
                    textView.setText(string1);
                }else{
                    string1 = string1 + "9";
                    textView.setText(string1);
                }

                zero = true;
                enzan = true;
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string1 = "";
                string2 = "";
                textView.setText("0");
                zero = false;
                enzan = false;
                i = 0;
                k = 0;
                for(int j = 0; j < 100; j++){
                    array1[j] = 0;
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enzan){
                    string2 += "/";
                    array1[i] = Integer.valueOf(string1);
                    i++;
                    zero = false;
                    enzan = false;
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enzan){
                    string2 += "*";
                    array1[i] = Integer.valueOf(string1);
                    i++;
                    zero = false;
                    enzan = false;
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enzan) {
                    string2 += "-";
                    array1[i] = Integer.valueOf(string1);
                    i++;
                    zero = false;
                    enzan = false;
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enzan){
                    string2 += "+";
                    array1[i] = Integer.valueOf(string1);
                    i++;
                    zero = false;
                    enzan = false;
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enzan) {
                    array1[i] = Integer.valueOf(string1);
                    //演算部分
                    for (int j = 0; j < i; j++) {
                        switch (string2.charAt(j)) {
                            case '+':
                                array1[j + 1] += array1[j];
                                break;
                            case '-':
                                array1[j + 1] = array1[j] - array1[j + 1];
                                break;
                            case '*':
                                array1[j + 1] *= array1[j];
                                break;
                            case '/':
                                array1[j + 1] = array1[j] / array1[j + 1];
                                break;
                        }
                    }

                    string1 = String.valueOf(array1[i]);
                    textView.setText(string1);
                }
                zero = false;
                enzan = false;
            }
        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (zero){
                    if (string1.equals("")){
                        string1 = "0";
                        textView.setText(string1);
                    }else{
                        string1 = string1 + "0";
                        textView.setText(string1);
                    }
                    enzan = true;
                }
            }
        });
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
            //intent
            Intent intent = new android.content.Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_about) {
            //intent
            Intent intent = new android.content.Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
