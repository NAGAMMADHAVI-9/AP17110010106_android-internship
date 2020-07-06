package com.example.task_4b;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final int CAMERA_REQUEST_CODE=22;
    Button b_camera;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_camera=findViewById(R.id.camera);
        iv=findViewById(R.id.imageview);
    }



    public void camera(View view) {
        if (view.getId()== R.id.camera){
                openCamera();
    }
    }
    private void openCamera() {
        Intent i=new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
        startActivityForResult(i,CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAMERA_REQUEST_CODE){
            if (resultCode==RESULT_OK){
                Bitmap b=(Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(b);
            }
        }


}
}