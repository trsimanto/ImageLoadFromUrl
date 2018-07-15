package com.example.towhid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    String url="https://images.unsplash.com/photo-1516663235285-845fac339ca7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=9ed0b746e082b016312291a43e310866&auto=format&fit=crop&w=400&q=80";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.img_View);
        loadImageFromUrl(url);
    }

    private void loadImageFromUrl(String url) {
        Picasso.with(this).load(url)
        .into(imageView,new com.squareup.picasso.Callback(){

                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                }
        );
    }

}
