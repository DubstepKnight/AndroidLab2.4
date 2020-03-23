package image.color.git.lab24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String greeting = "Hi";
    String textInputValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textInput = findViewById(R.id.editText);


        final TextView shownResponse = findViewById(R.id.textView);
        final TextView shownResponse2 = findViewById(R.id.textView2);

        textInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String newString = s.toString();
                textInputValue = newString;
                shownResponse2.setText(textInputValue);
            }
        });

        String textInputValue = textInput.getText().toString();

//     Buttons
        Button inEnglish = findViewById(R.id.english);
        inEnglish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shownResponse.setText("Hi");
            }
        });

        Button inFinnish = findViewById(R.id.finnish);
        inFinnish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shownResponse.setText("Terve");
            }
        });
        Button inSwedish = findViewById(R.id.swedish);
        inSwedish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shownResponse.setText("Hejjsan");
            }
        });
        Button inSpanish = findViewById(R.id.spanish);
        inSpanish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shownResponse.setText("Hola");
            }
        });

        shownResponse.setText(greeting);
        shownResponse2.setText(textInputValue);

    }
}
