package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void Tampilan_4(View view) {
        Intent intent = new Intent(ThirdActivity.this, FourActivity.class);
        startActivity(intent);
    }
}