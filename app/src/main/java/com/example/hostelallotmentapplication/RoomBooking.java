package com.example.hostelallotmentapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RoomBooking extends AppCompatActivity {

    int No;
    EditText id_1_EditText, id_2_EditText, id_3_EditText, id_4_EditText, id_5_EditText;
    Button Next, Save;
    TextView id_1_TextView, id_2_TextView, id_3_TextView, id_4_TextView, id_5_TextView ;
    //TextView alertTexView;
    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_booking);

        initialize();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                No=Integer.parseInt(textInputEditText.getText().toString());

                if(No>5)
                {

                    Toast.makeText(RoomBooking.this, "Sorry. You cannot book more than 5 rooms!", Toast.LENGTH_SHORT).show();

                    /*AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

                    builder.setCancelable(true);
                    builder.setTitle("MAX LIMIT EXCEEDED!");
                    builder.setMessage("You can book a maximum of 5 rooms.");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.cancel();
                        }
                    });*/

                }
                else
                {
                    changeVisibility();
                }
            }
        });
    }

    private void initialize() {

        Next = findViewById(R.id.next);
        textInputLayout=findViewById(R.id.nor);
        textInputEditText=findViewById(R.id.no);
        Save = findViewById(R.id.save_btn);
        id_1_EditText=findViewById(R.id.ID_1_EditText);
        id_2_EditText=findViewById(R.id.ID_2_EditText);
        id_3_EditText=findViewById(R.id.ID_3_EditText);
        id_4_EditText=findViewById(R.id.ID_4_EditText);
        id_5_EditText=findViewById(R.id.ID_5_EditText);
        id_1_TextView=findViewById(R.id.ID_1_TextView);
        id_2_TextView=findViewById(R.id.ID_2_TextView);
        id_3_TextView=findViewById(R.id.ID_3_TextView);
        id_4_TextView=findViewById(R.id.ID_4_TextView);
        id_5_TextView=findViewById(R.id.ID_5_TextView);

    }

    public void changeVisibility()
    {
        textInputEditText.setVisibility(View.GONE);
        textInputLayout.setVisibility(View.GONE);
        //room.setVisibility(View.GONE);
        Next.setVisibility(View.GONE);
        //No_of_rooms.setVisibility(View.GONE);
        switch(No)
        {
            case 1: id_1_EditText.setVisibility(View.VISIBLE);
                id_1_TextView.setVisibility(View.VISIBLE);
                Save.setVisibility(View.VISIBLE);
                break;
            case 2: id_1_EditText.setVisibility(View.VISIBLE);
                id_2_EditText.setVisibility(View.VISIBLE);
                id_1_TextView.setVisibility(View.VISIBLE);
                id_2_TextView.setVisibility(View.VISIBLE);
                Save.setVisibility(View.VISIBLE);
                break;
            case 3: id_1_EditText.setVisibility(View.VISIBLE);
                id_2_EditText.setVisibility(View.VISIBLE);
                id_3_EditText.setVisibility(View.VISIBLE);
                id_1_TextView.setVisibility(View.VISIBLE);
                id_2_TextView.setVisibility(View.VISIBLE);
                id_3_TextView.setVisibility(View.VISIBLE);
                Save.setVisibility(View.VISIBLE);
                break;
            case 4: id_1_EditText.setVisibility(View.VISIBLE);
                id_2_EditText.setVisibility(View.VISIBLE);
                id_3_EditText.setVisibility(View.VISIBLE);
                id_4_EditText.setVisibility(View.VISIBLE);
                id_1_TextView.setVisibility(View.VISIBLE);
                id_2_TextView.setVisibility(View.VISIBLE);
                id_3_TextView.setVisibility(View.VISIBLE);
                id_4_TextView.setVisibility(View.VISIBLE);
                Save.setVisibility(View.VISIBLE);
                break;
            case 5: id_1_EditText.setVisibility(View.VISIBLE);
                id_2_EditText.setVisibility(View.VISIBLE);
                id_3_EditText.setVisibility(View.VISIBLE);
                id_4_EditText.setVisibility(View.VISIBLE);
                id_5_EditText.setVisibility(View.VISIBLE);
                id_1_TextView.setVisibility(View.VISIBLE);
                id_2_TextView.setVisibility(View.VISIBLE);
                id_3_TextView.setVisibility(View.VISIBLE);
                id_4_TextView.setVisibility(View.VISIBLE);
                id_5_TextView.setVisibility(View.VISIBLE);
                Save.setVisibility(View.VISIBLE);
                break;
        }
    }
}
