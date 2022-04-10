package sv.edu.udb.myapplication;

import android.view.View;

public class MainActivityPresenter implements MainActivityContract.Presenter{

        MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }


    //correo administrador@gmail.com
    //contra 123456
    @Override
    public void doLogin(String email, String password) {
        if (email.equals("administrador@gmail.com")&& password.equals("123456")){
            view.onSucces("Login Exitoso");
        }else {
            view.onError("Credenciales invalidas");
        }

    }
}
