package edu.cnm.deepdive.chughes.fizzbuzzandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.fizzbuzztext);

        EditText input = findViewById(R.id.editText);

        input.addTextChangedListener(this);

        updateText(10);

    }

    private void updateText(int count_to) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count_to; i++) {
            stringBuilder.append(FizzBuzz.count(i+1)+"\n");
        }

        textView.setText(stringBuilder);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        updateText(Integer.parseInt(editable.toString()));
    }
}
