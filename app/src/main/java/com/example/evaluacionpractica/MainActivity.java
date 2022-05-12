package com.example.evaluacionpractica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.AbsListView;

import com.example.evaluacionpractica.Adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public class Contacto {
        public String Name;
        public String Number;
        Contacto(String Name, String Number){
            this.Name = Name;
            this.Number = Number;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contacto> contacts = getContacts();
        StringAdapter adapter = new StringAdapter(contacts);
        RecyclerView rv = findViewById(R.id.rvContacts);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }

   // private List<String> getContacts(){
   //     List<String> contacts = new ArrayList<>();
    //    contacts.add("Sebastian Hernandez");
    //    contacts.add("Arianna Vargas");
    //    contacts.add("Benito Estela");
   //     return contacts;
   // }
    private List<Contacto> getContacts(){
        List<Contacto> contacts = new ArrayList<>();
        contacts.add(new Contacto("Sebastian Hernandez","978455854"));
        contacts.add(new Contacto("Arianna Vargas","985742361"));
        contacts.add(new Contacto("Benito Estela","963215487"));
        contacts.add(new Contacto("Santiago Hernandez","965874321"));
        contacts.add(new Contacto("Hugo Ramirez","963258741"));
        contacts.add(new Contacto("Parzival Mendoza","951456852"));
        contacts.add(new Contacto("Heracle Perez","965832147"));
        contacts.add(new Contacto("Mike Mignola","987412365"));
        contacts.add(new Contacto("Santiago Hernandez","965238741"));
        contacts.add(new Contacto("Bruno Sapian","987654357"));
        return contacts;
    }
}