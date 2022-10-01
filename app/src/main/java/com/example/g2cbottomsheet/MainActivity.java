package com.example.g2cbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.g2cbottomsheet.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    BottomSheetDialog bottomSheetDialog;
    HorizontalAdapter horizontalAdapter;
    VerticalAdapter verticalAdapter;
    List<ModelHorizontal> list1;
    List<ModelVertical> list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomsheetDialog();
            }
        });
    }
    private void bottomsheetDialog(){
        bottomSheetDialog = new BottomSheetDialog(this,R.style.BottomSheetTheme);
        View v = LayoutInflater.from(this).inflate(R.layout.bottomsheet_layout,null);
        RecyclerView hori_recyclerView = v.findViewById(R.id.horizontal_recyclerView);
        list1 = new ArrayList<>();
        hori_recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list1.add(new ModelHorizontal("ABC Oil","This is the main reason why you should choose the oil over anything else","\u20B9 23"));
        list1.add(new ModelHorizontal("XYZ Oil","This is the main reason why you should choose the oil over anything else",    " \u20B9 53"));
        list1.add(new ModelHorizontal("No Oil change","This is the main reason why you should choose the oil over anything else","\u20B9 0"));

        horizontalAdapter = new HorizontalAdapter(this,list1);
        hori_recyclerView.setAdapter(horizontalAdapter);

        RecyclerView verti_recyclerView = v.findViewById(R.id.vertical_recyclerView);
        list2 = new ArrayList<>();
        verti_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        list2.add(new ModelVertical(R.drawable.air_filter,"Air Filters","Adding a filter means that you'll be in control of what it","\u20B9 300"));
        verticalAdapter = new VerticalAdapter(this,list2);
        verti_recyclerView.setAdapter(verticalAdapter);

        bottomSheetDialog.setContentView(v);
        bottomSheetDialog.show();
    }


}