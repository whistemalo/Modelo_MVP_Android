package sv.edu.udb.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    MainActivityContract.Presenter presenter;


    EditText email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        presenter = new MainActivityPresenter(this);

        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);

        login = findViewById(R.id.login);

        //login

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //validadacion de entrada de datos
                String mail = email.getText().toString();
                String pass = password.getText().toString();

                if(TextUtils.isEmpty(mail) || TextUtils.isEmpty(pass)){
                    onError("Campos vacios");
                }else {
                    presenter.doLogin(mail,pass);
                }

            }
        });

    }

    @Override
    public void onSucces(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}