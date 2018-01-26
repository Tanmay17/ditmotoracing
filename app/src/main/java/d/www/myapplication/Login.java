package d.www.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText et_user,et_pass;
    Button login_button;
    String username,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        login_button = ( Button ) findViewById( R.id.login );
        et_user = ( EditText ) findViewById( R.id.user );
        et_pass = ( EditText ) findViewById( R.id.pass );
        Log.d("Kya h?",et_user.getText().toString());
        login_button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_user.getText().toString().equals( "sarthak" ) && et_pass.getText().toString().equals( "ditmotoracing" )) {
                    ProgressDialog progressDialog = new ProgressDialog( Login.this );
                    progressDialog.setMessage( "Checking Credentials" );
                    progressDialog.setProgressStyle( ProgressDialog.STYLE_SPINNER );
                    progressDialog.show();
                    Thread timer = new Thread() {
                        public void run() {
                            try {
                                sleep( 3000 );
                                Intent openMainActivity = new Intent( Login.this, MainActivity.class );
                                startActivity( openMainActivity );
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    };
                    timer.start();
                }
            }
        });
    }
}
