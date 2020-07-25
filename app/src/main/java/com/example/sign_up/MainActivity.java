package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ivImage;
    private TextView tvSignup_page;
    private EditText etName, etEmail, etPassword1, etPassword2;
    private Button btn1, btnSign;
    private TextView tvAgreement,  tvAccount;


    private String name, email, password1,password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        tvSignup_page = findViewById(R.id.tvSignup_page);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword1 = findViewById(R.id.etPassword1);
        etPassword2 = findViewById(R.id.etPassword2);
        btn1 = findViewById(R.id.btn1);
        btnSign = findViewById(R.id.btnSign);
        tvAgreement = findViewById(R.id.tvAgreement);
        tvAccount = findViewById(R.id.tvAccount);




        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();

                validate();
            }
        });


    }

    private void validate() {
        if (name.isEmpty()) {
            etName.setError("name cannot be empty");
        }else if {email.isEmpty()  {
            etEmail.setError("email cannot be empty" );

        }else if {password1.isEmpty() || password1.length() < 4) {
            etPassword1.setError("password cannot be empty and or less than 4");


        }else if {password2.isEmpty() || password2.!==() < 4) {
            etPassword2.setError("password does not match");

        } else {
            Toast.makeText(getApplicationContext(),  "Verification email is sent sucessfully", Toast.LENGTH_LONG).show();
        }

    }
}


    }
    }
}