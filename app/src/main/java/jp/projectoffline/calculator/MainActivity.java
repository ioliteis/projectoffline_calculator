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

    boolean onlyDigit = true; //数字のみ受け取る
    boolean firstInput = true; //最初の入力
    boolean endCalculate = false; //=のあとC以外押させないようにする
    boolean startCalculate = false; //=の実行
    boolean zeroInput = true; //0が入力可能かどうか
    boolean dotInput = true; //小数点が入力可能か
    boolean operate = false; //数字が入力されていないときに記号を押させないため


    String string1 = ""; //表示する数字
    String string2 = "";//記号
    double[] array1 = new double[100];//数字

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
        Button button17 = findViewById(R.id.button17);

        //初期化
        for(int j = 0; j < 100; j++){
            array1[j] = 0;
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "1";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "1";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "2";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "2";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "3";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "3";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "4";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "4";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "5";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "5";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "6";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "6";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "7";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "7";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "8";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "8";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput){
                            string1 = "9";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = true;
                        }else{
                            string1 = string1 + "9";
                            textView.setText(string1);
                            zeroInput = true;
                        }


                        operate = true;
                    }
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                string1 = "";
                string2 = "";

                endCalculate = false;
                startCalculate = false;
                firstInput = true;
                zeroInput = true;
                dotInput = true;

                textView.setText("");

                operate = false;

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
                if (!endCalculate) {
                    if (operate){
                        string2 += "/";
                        array1[i] = Double.valueOf(string1);
                        i++;

                        operate = false;
                        firstInput = true;
                        zeroInput = true;
                        dotInput = true;
                        startCalculate = true;
                    }
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (operate){
                        string2 += "*";
                        array1[i] = Double.valueOf(string1);
                        i++;

                        operate = false;
                        firstInput = true;
                        zeroInput = true;
                        dotInput = true;
                        startCalculate = true;
                    }
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (operate) {
                        string2 += "-";
                        array1[i] = Double.valueOf(string1);
                        i++;

                        operate = false;
                        firstInput = true;
                        zeroInput = true;
                        dotInput = true;
                        startCalculate = true;
                    }
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (operate){
                        string2 += "+";
                        array1[i] = Double.valueOf(string1);
                        i++;

                        operate = false;
                        firstInput = true;
                        zeroInput = true;
                        dotInput = true;
                        startCalculate = true;
                    }
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (dotInput) {
                        if (!firstInput) {
                            string1 = string1 + ".";
                            textView.setText(string1);
                            zeroInput = true;
                            dotInput = false;
                            operate = false;
                        }
                    }
                }
            }
        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!endCalculate) {
                    if (zeroInput) {
                        if (firstInput) {
                            string1 = "0";
                            textView.setText(string1);
                            firstInput = false;
                            zeroInput = false;
                        }else{
                            string1 = string1 + "0";
                            textView.setText(string1);
                        }
                        operate = true;
                    }
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startCalculate) {
                    array1[i] = Double.valueOf(string1);
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

                    endCalculate = true;//C以外のボタンを押させない

                    string1 = String.valueOf(array1[i]);
                    textView.setText(string1);
                }

                startCalculate = false;
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