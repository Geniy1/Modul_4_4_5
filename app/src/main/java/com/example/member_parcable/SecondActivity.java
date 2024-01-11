package com.example.member_parcable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText nameEditText;
    private EditText patronymicEditText;
    private EditText surnameEditText;
    private TextView nameTextView, surnameTextView, patronymicTextView, phoneNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.nameTextView1);
        surnameTextView = findViewById(R.id.surnameTextView1);
        patronymicTextView = findViewById(R.id.patronymicTextView1);
      //  phoneNumberTextView = findViewById(R.id.phoneNumberTextView1);

        // Intent orqali olingan ma'lumotlarni qabul qilish
        Intent intent = getIntent();
        if (intent != null) {
            User user = intent.getParcelableExtra("user");

            // Ma'lumotlarni TextViewlarga joylash
            nameTextView.setText(user.getName());
            surnameTextView.setText(user.getSurname());
            patronymicTextView.setText(user.getPatronymic());
            phoneNumberTextView.setText(user.getPhoneNumber());
        }

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Member classidan foydalanib objectni tuzish
                Member member = new Member("Member Object");

                // Parcelable orqali objectni Intent orqali MainActivityga qaytarish
                Intent resultIntent = new Intent();
                resultIntent.putExtra("member", member);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}