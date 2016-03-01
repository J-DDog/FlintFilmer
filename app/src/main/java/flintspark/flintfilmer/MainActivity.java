package flintspark.flintfilmer;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.camera2.CameraManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        camera = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
//        try
//        {
//            cameraIdList = camera.getCameraIdList();
//        }
//        catch(CameraAccessException e)
//        {
//            toast.makeText(getApplicationContext(), "Error Cant Open Camera Id List", Toast.LENGTH_SHORT).show();
//        }


    }

    /**
     * Looks for a camera and returns if it has one or not;
     * @return cameraDetected
     */
//    private boolean detectCamera()
//    {
//        boolean cameraDetected = false;
//
////        if(camera.get() > 0)
//        {
//
//        }
////        else
//        {
//
//        }
//
//
//        return cameraDetected;
//    }

}
