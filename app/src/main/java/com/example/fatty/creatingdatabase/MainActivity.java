package com.example.fatty.creatingdatabase;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {


    SQLiteDatabase contactsDB = null;

    Button createDBButton, addContactButton, deleteContactButton, getContactsButton, deleteDBButton;

    EditText nameEditText, contactListEditText, idEditText, emailEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDBButton = (Button) findViewById(R.id.createDBButton);
        addContactButton = (Button) findViewById(R.id.addContactButton);
        deleteContactButton = (Button) findViewById(R.id.deleteContactButton);
        getContactsButton = (Button) findViewById(R.id.getContactsButton);
        deleteDBButton = (Button) findViewById(R.id.deleteDBButton);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        contactListEditText = (EditText) findViewById(R.id.contactListEditText);
        idEditText = (EditText) findViewById(R.id.idEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
    }



    public void createDatabbase(View view) {
    }

    public void addContact(View view) {
    }

    public void deleteContact(View view) {
    }

    public void getContacts(View view) {
    }

    public void deleteDatabase(View view) {
    }
}
