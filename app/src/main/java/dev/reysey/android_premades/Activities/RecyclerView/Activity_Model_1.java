package dev.reysey.android_premades.Activities.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import dev.reysey.android_premades.Adapters.RecyclerView.Model_1;
import dev.reysey.android_premades.R;

public class Activity_Model_1 extends AppCompatActivity {

    private static final String TAG = "Activity_Model_1";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model1);

        //
        getImages();
    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.statically.io/img/i.pinimg.com/originals/bf/82/f6/bf82f6956a32819af48c2572243e8286.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://free4kwallpapers.com/uploads/originals/2020/06/05/a-bust-with-a-skull-mask-and-neon-lights-oc-wallpaper.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://images.hdqwalls.com/wallpapers/skull-glowing-minimal-neon-5k-o8.jpg");
        mNames.add("Portugal");

        mImageUrls.add("https://free4kwallpapers.com/uploads/originals/2021/07/07/-mustang-wallpaper.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://clfroseburg.com/wp-content/uploads/2020/06/wp1871026.jpg");
        mNames.add("Mahahual");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.horizontal_recycler_view_model_1);
        recyclerView.setLayoutManager(layoutManager);
        Model_1 adapter = new Model_1(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
}