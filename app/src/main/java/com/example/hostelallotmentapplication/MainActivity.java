package com.example.hostelallotmentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText idText, passwordText;
    Button login;
    int c;
    String id_input, password_input;
    String[] id = {"f20190189", "f20190211", "f20190155", "f20190149","f20191127"};
    String[] password = {"fd000001", "fd000002", "fd000003", "fd000004","fd000005"};
    String[] name = {"Hersh K", "S. Hariharan", "Kshitij G", "Mitanshu A", "Shriram J",};
    String[] hostel = {"AH2", "AH5", "AH7", "DH3", "CH5",};
    String[] roomnum = {"329-L", "320-L", "215-R", "104-L", "102-L",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = findViewById(R.id.login_IDEditTExt);
        passwordText = findViewById(R.id.login_passwordEditText);
        login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_input = idText.getText().toString();
                password_input = passwordText.getText().toString();

                if (id_input.isEmpty() || password_input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username/password", Toast.LENGTH_SHORT).show();
                } else {
                    if (validate(id_input, password_input)) {
                        Intent login = new Intent(MainActivity.this, StudentDetails.class);
                        login.putExtra("id", id[c]);
                        login.putExtra("name", name[c]);
                        login.putExtra("hostel", hostel[c]);
                        login.putExtra("roomnum", roomnum[c]);
                        startActivity(login);
                    }
                }
            }

            private boolean validate(String id_input, String password_input) {
                if(find(id_input)){
                    if(password[c].equals(password_input)){
                        return true;
                    }else{
                        Toast.makeText(MainActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }

            private boolean find(String id_input) {
                for(c=0;c< id.length;c++){
                    if(id[c].equals(id_input)){
                        return true;
                    }
                }
                return false;
            }
        });
    }
}


