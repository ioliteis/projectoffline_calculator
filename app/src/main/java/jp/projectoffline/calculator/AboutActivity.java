package jp.projectoffline.calculator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    String string1;
    String string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Dark theme
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", true)){
            setTheme(R.style.AppTheme_Dark);
        }
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        string1 = getString(R.string.about_version);
        string2 = getString(R.string.about_copy);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", string1));

                Toast.makeText(AboutActivity.this, string2, Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri1 = Uri.parse("https://github.com/ioliteis/projectoffline_calculator");
                Intent a = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(a);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri2 = Uri.parse("https://duckduckgo.com/");
                Intent b = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(b);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri3 = Uri.parse("https://ioliteis.github.io/projectoffline");
                Intent c = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(c);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();

    }
}
