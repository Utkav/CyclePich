package com.example.cyclepich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cyclepich.databinding.ElementsBinding;

public class MainActivity extends AppCompatActivity {
    ElementsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ElementsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


//        binding.ET.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                Log.d("TEXTCHANGED"+" BEFORE",s.toString());
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                Log.d("TEXTCHANGED"+" ON",s.toString());
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                Log.d("TEXTCHANGED"+" AFTER",s.toString());
//            }
//        });


        binding.CB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
        binding.CB.isChecked();



//        binding.RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if(R.id.RB1 == checkedId){
//                    binding.TV.setText("Большой ОЛЕГ");
//                }
//                if(R.id.RB2 == checkedId){
//                    binding.TV.setText("Маленький олег");
//                }
//            }
//        });




        Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart", Toast.LENGTH_SHORT).show();

    }
}
