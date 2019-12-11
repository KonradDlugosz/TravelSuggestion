package android.example.travelsuggestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button letMeChoose;
    private Button helpMePick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letMeChoose = (Button) findViewById(R.id.btnLetMeChoose);
        helpMePick = (Button) findViewById(R.id.btnHelpMePick);

    }

    public void openActivityLetMeChoose(View view){
        Intent intent = new Intent(this,LetMeChoose.class);
        startActivity(intent);

    }

    public void openActivityHelpMeChoose(View view){
        Intent intent = new Intent(this, helpMePick.class);
        startActivity(intent);
    }


}
