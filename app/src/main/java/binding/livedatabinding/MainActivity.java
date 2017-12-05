package binding.livedatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import binding.livedatabinding.Model.LoginModel;
import binding.livedatabinding.databinding.ActivityMainBinding;

/**
 * Created by narinder on 05/12/17.
 */


public class MainActivity extends BaseActivity {
    //private ActivityMainBinding binding;
    private String TAG="MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(new LoginModel("vsh@gmsdafsdafasail.com","12345","12344"));
        binding.setActivity(this);

       // binding.setViewModel(new ViewModel());


    }

    public void onOrderButtonClick(){
        Log.e(TAG, ".................Onclick view");
    }
}
