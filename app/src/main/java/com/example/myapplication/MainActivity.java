package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding; //this variable has not been initialised
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflate() creates an instance of the binding class for the activity to use
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // Get a reference to the root view
        View view = binding.getRoot();
        // The root view needs to be passed as an input to setContentView()
        setContentView(view);
        // setContentView(R.layout.activity_main);
        binding.reverseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText editText = findViewById(R.id.editMessage);
                String builder= new StringBuilder(binding.editMessage.getText()).reverse().toString();
                binding.editMessage.setText(builder);
            }
        });
        binding.clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText editText =findViewById(R.id.editMessage);
                binding.editMessage.setText("");
            }
        });
        //Button clearButton= findViewById(R.id.clearBtn);
    }
}