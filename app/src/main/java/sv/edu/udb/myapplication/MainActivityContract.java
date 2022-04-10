package sv.edu.udb.myapplication;

public interface MainActivityContract {

    interface View{
        void onSucces(String message);
        void onError(String message);
    }

    interface Presenter{
        void doLogin(String email, String password);
    }

}
