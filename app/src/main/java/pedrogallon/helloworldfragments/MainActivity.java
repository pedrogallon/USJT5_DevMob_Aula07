package pedrogallon.helloworldfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        if (savedInstanceState == null){
            FragmentTransaction ft = fm.beginTransaction();
            HelloWorldFragment fragment = new HelloWorldFragment();
            ft.add(R.id.layoutFrag, fragment, "HelloWorldFragmentTag");
            ft.commit();
        }
    }
}
