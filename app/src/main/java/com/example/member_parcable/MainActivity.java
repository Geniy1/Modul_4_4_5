package com.example.member_parcable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView nameTextView, surnameTextView, patronymicTextView, phoneNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.nameTextView);
        surnameTextView = findViewById(R.id.sname);
        patronymicTextView = findViewById(R.id.patronymicTextView);
        phoneNumberTextView = findViewById(R.id.phoneNumberTextView);

        Button okButton = findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ma'lumotlarni yaratish
                User user = new User("John", "Doe", "Patronim", "123456789");

                // Intent orqali SecondActivityga o'tish va ma'lumotlarni yuborish
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("user", user);
                startActivity(intent);
            }
        });
    }
}
