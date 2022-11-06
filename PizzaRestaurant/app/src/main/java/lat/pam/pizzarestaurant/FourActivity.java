package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void Tampilan_5(View view) {
        Intent intent = new Intent(FourActivity.this, FiveActivity.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(FourActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}