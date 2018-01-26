package d.www.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class splash extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle Ditm) {
        super.onCreate(Ditm);
        setContentView(R.layout.splash);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent openMainActivity = new Intent(splash.this,Login.class);
                    startActivity(openMainActivity);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                } 
            }

        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
