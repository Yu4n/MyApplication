package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = getIntent();
                com.example.task7.Student std = new com.example.task7.Student();
                std.setName(binding.editText.getText().toString());
                std.setSurname(binding.editText1.getText().toString());
                std.setId(Integer.parseInt(binding.editText2.getText().toString()));
                returnIntent.putExtra("message",std);
                setResult(RESULT_OK,returnIntent);
                finish();
            } });
    }
}