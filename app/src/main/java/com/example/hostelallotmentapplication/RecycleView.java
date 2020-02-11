package com.example.hostelallotmentapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    RecyclerView recyclerView;
    MenuItemRVAdapter adapter;
    ArrayList<MenuItem> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        addStuff();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.menu_rv);
        adapter = new MenuItemRVAdapter(itemList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void addStuff() {
        String hostel_name = getIntent().getStringExtra("hostel"), id = getIntent().getStringExtra("id");
        String[] names = {"AH1","AH2","AH3","AH4","AH5","AH6","AH7","AH8","AH9","DH1","DH2","DH3","DH4","CH1","CH2","CH3","CH4","CH5","CH6","CH7"};
        String[] side = {"A side","A side","A side","A side","A side","A side","A side","A side","A side","D side","D side","D side","D side","C side","C side","C side","C side","C side","C side","C side"};

        switch(hostel_name){

            case "AH1":
            case "AH2":
            case "AH3":
                for (int i = 3; i < 6; i++) {
                    itemList.add(new MenuItem(names[i], side[i]));
                }
                break;
            case "AH4":
            case "AH5":
            case "AH6":
                for (int i = 6; i < 9; i++) {
                    itemList.add(new MenuItem(names[i], side[i]));
                }
                break;
            /*case "AH7":
            case "AH8":
            case "AH9":
                for (int i = 7; i < 10; i++) {
                    itemList.add(new MenuItem(names[i], side[i]));
                }
                break;*/
            case "DH1":
            case "DH2":
            case "DH3":
            case "DH4":
                for (int i = 0; i < 3; i++) {
                    itemList.add(new MenuItem(names[i], side[i]));
                }
                break;
            case "CH1":
            case "CH2":
            case "CH3":
                for (int i = 6; i < 9; i++) {
                    itemList.add(new MenuItem(names[i], side[i]));
                }
                break;
            case "CH4":
                itemList.add(new MenuItem(names[17], side[17]));
                break;
            case "CH5":
                itemList.add(new MenuItem(names[18], side[18]));
                break;
            case "CH6":
                itemList.add(new MenuItem(names[18], side[18]));
                break;
            case "CH7":
                itemList.add(new MenuItem(names[16], side[16]));
                break;
            default:
                Toast.makeText(this, "You cannot book rooms as you are passing out!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
