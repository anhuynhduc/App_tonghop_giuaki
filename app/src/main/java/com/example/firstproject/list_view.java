package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.widget.ImageView;



public class list_view extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    ListView listView;

    String arrname[] = {"Phép cộng", "Phép trừ", "Phép nhân", "Phép chia ", "Phép logarit", "Phép căn"};

    int arrimage[] = {R.drawable.cong, R.drawable.tru, R.drawable.nhan, R.drawable.chia, R.drawable.lagarit, R.drawable.can};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);
        myadapter adapter = new myadapter(this, arrname, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(list_view.this,user_profile.class);
                intent.putExtra("name",arrname[position]);
                intent.putExtra("image",arrimage[position]);
                startActivity(intent);

            }
        });


    }

    class myadapter extends ArrayAdapter<String> {

        Context context;
        String rname[];
        String rstragename[];
        String rnation[];
        int rimg[];

        public myadapter( Context context, String[] rname,  int[] rimg) {
            super(context,R.layout.row,R.id.imageView,rname);

            this.rname = rname;
            this.rimg = rimg;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.row,parent,false);

            ImageView img=view.findViewById(R.id.imageView);
            TextView username=view.findViewById(R.id.name);

            username.setText(rname[position]);
            img.setImageResource(rimg[position]);

            return view;
        }
    }

}
