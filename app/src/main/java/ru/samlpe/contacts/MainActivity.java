package ru.samlpe.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String LOG_ARGS = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContactsHelper ch = new ContactsHelper(getApplicationContext()); //инициализация нашего помошника управления контактами в базе данных

        ch.insert("Alex","555-45-44-5","06.03.1998"); // создаем в таблице новую запись, передав параметры

        Log.d(LOG_ARGS,ch.getAll().toString()); // выводи в логи все записи из таблицы
    }


}
