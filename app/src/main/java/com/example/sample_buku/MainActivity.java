package com.example.sample_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDesc = findViewById(R.id.txt_desc);
        txtDesc.setMovementMethod(new ScrollingMovementMethod());
    }

    public void sampelDisplay(View v){
        Intent it = new Intent(this,SampleDisplayActivity.class);
        startActivity(it);
    }

    public void beliBuku(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://ebooks.gramedia.com/id/cart/add/180477?code=93678";
        it.setData(Uri.parse(url));
        startActivity(it);
    }
}