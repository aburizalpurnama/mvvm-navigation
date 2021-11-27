package com.rizal.mvvm.navigation.component.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    private final String username = "qwe";
    private final String password = "123";

    private MutableLiveData<Boolean> isLoggedIn = new MutableLiveData<>();

    public LiveData<Boolean> doLogin(String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            isLoggedIn.setValue(true);
        } else {
            isLoggedIn.setValue(false);
        }

        return isLoggedIn;
    }

    public LiveData<Boolean> getIsLoggedIn() {
        return isLoggedIn;
    }

    public void onLoginNavigated(){
        isLoggedIn.setValue(false);
    }
}
