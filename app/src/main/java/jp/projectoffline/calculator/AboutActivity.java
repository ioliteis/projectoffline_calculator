package jp.projectoffline.calculator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.preference.PreferenceManager;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutItemOnClickAction;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.IconicsDrawable;

public class AboutActivity extends MaterialAboutActivity {
    int  colorIcon = R.color.colorAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Dark theme
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", true)){
            setTheme(R.style.AppTheme_MaterialAboutActivity_Dark);
            colorIcon = R.color.white;
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull final Context c) {
        MaterialAboutCard.Builder cardBuilder1 = new MaterialAboutCard.Builder();


        cardBuilder1.addItem(new MaterialAboutTitleItem.Builder()
                .text(R.string.about_about)
                .icon(R.mipmap.ic_launcher)
                .build());

        cardBuilder1.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_version))
                .subText(getString(R.string.version))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon2.cmd_information_outline)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        ClipboardManager clipboardManager = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("", getString(R.string.about_version) + " " + getString(R.string.version)));

                        Toast.makeText(AboutActivity.this, getString(R.string.about_copy), Toast.LENGTH_SHORT).show();
                    }
                })
                .build());

        cardBuilder1.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_source))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_github_circle)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Uri uri1 = Uri.parse("https://github.com/ioliteis/projectoffline_calculator");
                        Intent a = new Intent(Intent.ACTION_VIEW, uri1);
                        startActivity(a);
                    }
                })
                .build());

        cardBuilder1.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_licenses))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_book)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Intent intent = new android.content.Intent(AboutActivity.this, LicensesActivity.class);
                        startActivity(intent);
                    }
                })
                .build());

        MaterialAboutCard.Builder cardBuilder2 = new MaterialAboutCard.Builder();

        cardBuilder2.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_po))
                .subText(getString(R.string.about_website))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_flask)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Uri uri2 = Uri.parse("https://ioliteis.github.io/projectoffline");
                        Intent c = new Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(c);
                    }
                })
                .build());

        cardBuilder2.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_privacy))
                .subText(getString(R.string.about_privacy_comment))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon2.cmd_shield_half_full)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Uri uri3 = Uri.parse("https://ioliteis.github.io/projectoffline/2019/08/26/Privacy-Policy/");
                        Intent b = new Intent(Intent.ACTION_VIEW, uri3);
                        startActivity(b);
                    }
                })
                .build());

        cardBuilder2.addItem(new MaterialAboutActionItem.Builder()
                .text(getString(R.string.about_mastodon))
                .subText(getString(R.string.about_contact))
                .icon(new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon2.cmd_mastodon)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18))
                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Uri uri4 = Uri.parse("https://social.privacytools.io/@projectoffline");
                        Intent b = new Intent(Intent.ACTION_VIEW, uri4);
                        startActivity(b);
                    }
                })
                .build());

        return  new MaterialAboutList(cardBuilder1.build(), cardBuilder2.build());
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.action_about);
    }

}