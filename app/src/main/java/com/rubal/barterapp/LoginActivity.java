package com.rubal.barterapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {

     EditText etxtemail,etxtpassword ,etxtConfirm;
     Button Buttonlogin, Buttonsignup;
     ProgressBar progessBar;

//     FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        etxtemail=findViewById(R.id.email);
        etxtpassword=findViewById(R.id.password);
        Buttonlogin=findViewById(R.id.Buttonlogin);
        etxtConfirm=findViewById(R.id.Confirmpassword);
        Buttonsignup=findViewById(R.id.Buttonsignup);
        progessBar=findViewById(R.id.progressBar);

//        firebaseAuth=firebaseAuth.getInstance();

        Buttonlogin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etxtemail.getText().toString().trim();
                String password = etxtpassword.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(LoginActivity.this, "Please enter email", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter correct password", Toast.LENGTH_LONG).show();
                    return;
                }
                if (password.length() < 6) {
                    Toast.makeText(LoginActivity.this, "Password too short", Toast.LENGTH_LONG).show();

                }

                progessBar.setVisibility(View.VISIBLE);
////                firebaseAuth.createUserWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                progessBar.setVisibility(View.GONE);
//                                if (task.isSuccessful()) {
//                                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
//                                    Toast.makeText(LoginActivity.this,"Login In Succesfull",Toast.LENGTH_LONG).show();
//                                }
//                                else
//                                {
//                                    Toast.makeText(LoginActivity.this,"Authentication failed",Toast.LENGTH_LONG).show();
//
//
//                                }
//
//                                // ...
//                            }
//                        });
            }
        });
            }

            public void btn_signup(View view) {
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));

            }

            public void MainActivity(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
}

