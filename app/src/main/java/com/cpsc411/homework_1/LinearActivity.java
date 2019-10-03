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

public class LinearActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        setContentView(R.layout.linear_layout_root);


        LinearLayout lv = (LinearLayout) findViewById(R.id.numericalCol);

        ViewGroup.LayoutParams tvParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );

        //This is the row of numbers on the left side of the screen
        for (int i=1; i <= 11; i++){
            TextView tv = new TextView(this);
            tv.setLayoutParams(tvParams);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv.setText("" + i);
            lv.addView(tv);
            tv.setBackgroundColor(Color.GRAY);
        }

        // This is for row 6 of the table
        lv = (LinearLayout) findViewById(R.id.row6linearLayout);


        TextView tView= new TextView(this);
        LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        textParam.weight = 1;
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("            ");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = .5f;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("int min");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = .5f;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("   int max");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        textParam.weight = 1;
        tView= new TextView(this);
        tView.setBackgroundColor(Color.CYAN);
        tView.setText("String greeting");
        tView.setTextAlignment(ViewGroup.TEXT_ALIGNMENT_CENTER);
        lv.addView(tView, textParam);

        /*
        tView= new TextView(this);
        lv.setWeightSum(1.f);
        tView.setLayoutParams(textParam);
        //tView.setPadding(10,0,10,0);
        tView.setBackgroundColor(Color.RED);
        tView.setText("int max");
        lv.addView(tView);

        tView= new TextView(this);
        lv.setWeightSum(1.f);
        tView.setLayoutParams(textParam);
        //tView.setPadding(10,0,10,0);
        tView.setBackgroundColor(Color.RED);
        tView.setText("String greeting");
        lv.addView(tView);
        */


        /*
        // This is for row 6 of the table
        lv = (LinearLayout) findViewById(R.id.row6linearLayout);

        ViewGroup.LayoutParams textParam = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.MATCH_PARENT //height
        );

        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tview = (TextView) inflater.inflate(R.layout.additional_text_view, lv, false);
        tview.setBackgroundColor(Color.RED);
        lv.addView(tview);

        TextView tView = (TextView) findViewById(R.id.tvId);
        tView.setText("Updated String");
        tView.setBackgroundColor(Color.GREEN);
        */


    }
}
