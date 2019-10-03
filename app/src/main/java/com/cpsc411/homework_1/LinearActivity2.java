package com.cpsc411.homework_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LinearActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ROOT
        LinearLayout rootLayout = new LinearLayout(this);
        ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,//width
                ViewGroup.LayoutParams.MATCH_PARENT//height
        );
        rootLayout.setBackgroundColor(Color.GREEN);
        rootLayout.setOrientation(LinearLayout.HORIZONTAL);
        rootLayout.setLayoutParams(lparams);

        //LAYOUT FOR ROW OF NUMBERS
        LinearLayout rowOfNumbersLayout = new LinearLayout(this);
        LinearLayout.LayoutParams rowOfNumbersparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,//width
                ViewGroup.LayoutParams.WRAP_CONTENT//height
        );
        rowOfNumbersLayout.setBackgroundColor(Color.GRAY);
        rowOfNumbersLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.addView(rowOfNumbersLayout, rowOfNumbersparams);


        LinearLayout.LayoutParams textViewparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,//width
                ViewGroup.LayoutParams.WRAP_CONTENT//height
        );
        for (int i = 1; i <= 11; i++) {
            TextView textView = new TextView(this);
            textView.setText("" + i);
            rowOfNumbersLayout.addView(textView, textViewparams);
        }
        ///END OF LAYOUT FOR ROW OF NUMBERS


        //ROOT FOR THE REST OF THE TABLE
        LinearLayout newRoot = new LinearLayout(this);
        LinearLayout.LayoutParams newRootrsparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,//width
                ViewGroup.LayoutParams.MATCH_PARENT//height
        );
        newRoot.setBackgroundColor(Color.BLUE);
        newRoot.setOrientation(LinearLayout.VERTICAL);
        newRoot.setLayoutParams(newRootrsparams);
        rootLayout.addView(newRoot);

        TextView textView = new TextView(this);




        setContentView(rootLayout);


        /*
        // Start of Row 1 of table (black bar w/ text)
        LinearLayout root = new LinearLayout(this);
        root.setBackgroundColor(Color.BLACK);
        root.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,//width
                ViewGroup.LayoutParams.MATCH_PARENT//height
        );
        root.setLayoutParams(lparams);

        // Create TextView for Row 1
        TextView tv = new TextView(this);
        tv.setText("Rules void hello1 (int hour)");
        tv.setTextColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        root.addView(tv); // Add the text to the linear layout
        /////////END OF ROW 1


        // Start of Row 2 - 3 of table
        LinearLayout row_2_3_root = new LinearLayout(this);
        row_2_3_root.setBackgroundColor(Color.WHITE);
        row_2_3_root.setOrientation(LinearLayout.HORIZONTAL);
        row_2_3_root.setLayoutParams(lparams);

        // Create 3 columns:
        //Col 1:
        tv.setText("properties");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTextColor(Color.BLACK);
        row_2_3_root.addView(tv);

        // Add weight

        setContentView(root);

         */

    }
}
