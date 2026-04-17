package com.example.expensetrackerapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editMail;
    private EditText editPass;
    private Button btSignIn;
    private TextView btSignUp;
    private TextView textForgotPass;
    private Button btSignInGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        finding();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setEven();
    }
    void finding(){
        editMail = findViewById(R.id.edit_text_mail);
        editPass = findViewById(R.id.edit_text_password);
        btSignIn = findViewById(R.id.button_sign_in);
        btSignUp = findViewById(R.id.sign_up);
        textForgotPass = findViewById(R.id.text_forgot_password);
        btSignInGoogle = findViewById(R.id.bt_sign_in_google);
    }
    void setEven(){
        btSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}