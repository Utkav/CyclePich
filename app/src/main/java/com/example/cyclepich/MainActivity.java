package com.example.cyclepich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cyclepich.databinding.ElementsBinding;

public class MainActivity extends AppCompatActivity {

    public static String position1 = "мясо свинотки";
    public static String position2 = "лемонадек";
    public static String position3 = "чипсеки";
    public static String position4 = "грибочки";
    public static String position5 = "хумус";
    public static String text = "";
    public static int flag = 0;

    public int[] arr = {0, 0, 0, 0, 0};
    ElementsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ElementsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Intent intent = new Intent();


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
                if (arr[0] % 2 == 0){
                    intent.putExtra("CB", position1);
                    Toast.makeText(MainActivity.this, "Add!", Toast.LENGTH_SHORT).show();
                    arr[0] += 1;
                }
                else {
                    intent.putExtra("CB", "");
                    Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                    arr[0] += 1;
                }


            }
        });
//        binding.CB.isChecked();

        binding.CB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (arr[1] % 2 == 0){
                    intent.putExtra("CB2", position2);
                    Toast.makeText(MainActivity.this, "Add!", Toast.LENGTH_SHORT).show();
                    arr[1] += 1;
                }
                else {
                    intent.putExtra("CB2", "");
                    Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                    arr[1] += 1;
                }
            }
        });

        binding.CB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (arr[2] % 2 == 0){
                    intent.putExtra("CB3", position3);
                    Toast.makeText(MainActivity.this, "Add!", Toast.LENGTH_SHORT).show();
                    arr[2] += 1;
                }
                else {
                    intent.putExtra("CB3", "");
                    Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                    arr[2] += 1;
                }
            }
        });

        binding.CB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (arr[3] % 2 == 0){
                    intent.putExtra("CB4", position4);
                    Toast.makeText(MainActivity.this, "Add!", Toast.LENGTH_SHORT).show();
                    arr[3] += 1;
                }
                else {
                    intent.putExtra("CB4", "");
                    Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                    arr[3] += 1;
                }
            }
        });
        binding.CB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (arr[4] % 2 == 0){
                    intent.putExtra("CB5", position5);
                    Toast.makeText(MainActivity.this, "Add!", Toast.LENGTH_SHORT).show();
                    arr[4] += 1;
                }
                else {
                    intent.putExtra("CB5", "");
                    Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                    arr[4] += 1;
                }
            }
        });

        binding.BT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                showToast();
            }
        });
        binding.RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.RB1 == checkedId){
                    intent.putExtra("DELIVERY", "самовывоз");
                }
                if(R.id.RB2 == checkedId){
                    intent.putExtra("DELIVERY", "доставка");
                }
            }
        });

        binding.OP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("TEXTCHANGED"+" BEFORE",s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("TEXTCHANGED"+" ON",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("TEXTCHANGED"+" AFTER",s.toString());
                text = s.toString();
            }
        });

        binding.BT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String out = "HEHE, you want to eat ";
                if (intent.getStringExtra("CB") != null){
                    out += intent.getStringExtra("CB") + ", ";
                    flag = 1;
                }
                if (intent.getStringExtra("CB2") != null){
                    out += intent.getStringExtra("CB2") + ", ";
                    flag = 1;
                }
                if (intent.getStringExtra("CB3") != null){
                    out += intent.getStringExtra("CB3") + ", ";
                    flag = 1;
                }
                if (intent.getStringExtra("CB4") != null){
                    out += intent.getStringExtra("CB4") + ", ";
                    flag = 1;
                }
                if (intent.getStringExtra("CB5") != null){
                    out += intent.getStringExtra("CB5") + ", ";
                    flag = 1;
                }

                if (flag == 0){
                    Toast.makeText(MainActivity.this, "Choose product", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (intent.getStringExtra("DELIVERY") != null){
                        out += "\n" + intent.getStringExtra("DELIVERY") + " \n " + text;
                        binding.FT.setText(out);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Choose delivery", Toast.LENGTH_SHORT).show();
                    }
                }
                flag = 0;
            }


        });



//        intent.putExtra(KEY, binding.ET.getText().toString());

//        Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show();
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
