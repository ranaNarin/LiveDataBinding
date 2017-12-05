package binding.livedatabinding.Model;

import android.databinding.BaseObservable;

/**
 * Created by narinder on 05/12/17.
 */


public class LoginModel extends BaseObservable {

    String email;
    String password;
    String confirmPassword;


    public LoginModel(String email, String password, String confirmPassword) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyChange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyChange();

    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        notifyChange();
    }
}
