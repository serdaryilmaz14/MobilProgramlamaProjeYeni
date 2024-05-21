package com.example.fireapp;

import static com.example.fireapp.Constants.MAX_BYTES_PDF;

import android.app.Application;
import android.text.format.DateFormat;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import java.util.Calendar;
import java.util.Locale;

public class MyApplication extends Application {
    public static void loadPdfFromUrlSinglePage(String pdfurl, String pdfTitle, FrameLayout pdfView, ProgressBar progressBar) {
        String TAG ="PDF_LOAD_SINGLE_TAG";

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static final String formatTimestamp(long timestamp) {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(timestamp);
        String date = DateFormat.format("dd/MM/yyyy", cal).toString();

        return date;
    }
}

