package com.example.evaluacionpractica.Adapters;

import static androidx.core.content.ContextCompat.startActivity;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.evaluacionpractica.MainActivity;
import com.example.evaluacionpractica.R;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder> {

    List<MainActivity.Contacto> contacts;
    public StringAdapter(List<MainActivity.Contacto> contacts){
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_string,parent,false);
        StringViewHolder vh = new StringViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder vh, int position) {
        MainActivity.Contacto contactName = contacts.get(position);
        TextView tvContactsName = vh.itemView.findViewById(R.id.tvContactName);
        tvContactsName.setText(contactName.Name);
        TextView tvContactsNumber = vh.itemView.findViewById(R.id.tvContactNumber);
        tvContactsNumber.setText(contactName.Number);

        Button btnCall = vh.itemView.findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("EXAM2022","Click en el Button Llamar: "+contactName.Name);

                String dial = "tel:" + contactName.Number;
                //startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });

        Button btnSms = vh.itemView.findViewById(R.id.btnSms);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("EXAM2022","Click en el Button SMS: "+contactName.Number);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class StringViewHolder extends RecyclerView.ViewHolder{

        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
