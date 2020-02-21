package jp.projectoffline.calculator;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.preference.PreferenceManager;

import com.danielstone.materialaboutlibrary.ConvenienceBuilder;
import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;
import com.danielstone.materialaboutlibrary.util.OpenSourceLicense;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.IconicsDrawable;

public class LicensesActivity extends MaterialAboutActivity {
    int  colorIcon = R.color.colorPrimary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Dark theme
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", true)){
            setTheme(R.style.AppTheme_MaterialAboutActivity_Dark);
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull final Context c) {

        MaterialAboutCard cardLicense1 = ConvenienceBuilder.createLicenseCard(c,
                new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_book)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18),
                "material-about-library", "2016-2018", "Daniel Stone",
                OpenSourceLicense.APACHE_2);

        MaterialAboutCard cardLicense2 = ConvenienceBuilder.createLicenseCard(c,
                new IconicsDrawable(c)
                        .icon(CommunityMaterial.Icon.cmd_book)
                        .color(ContextCompat.getColor(c, colorIcon))
                        .sizeDp(18),
                "Android-Iconics", "2019", "Mike Penz",
                OpenSourceLicense.APACHE_2);

        return  new MaterialAboutList(cardLicense1, cardLicense2);
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.about_licenses);
    }
}
