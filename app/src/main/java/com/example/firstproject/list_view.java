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

    String arrname[] = {"Huỳnh Đức An", "Lee Sun Bum", "Huỳnh Ngọc Đạt", "Kimberley Anne ", "Lý Á Phương", "Võ Kim Yến", "Hoàng Thị Mỹ Lệ", "Nguyễn Hoàng Linh"};

    String arrstragename[] = {"LinDo", "Jonh", "Limax", "Jayce", "Linly", "Halley","Sofia", "Barker"};

    String arrnation[] = {"Việt Nam", "Hàn Quốc", "Việt Nam", "Thái Lan", "Việt Nam", "Trung Quốc","Việt Nam", "Việt Nam"};



    int arrimage[] = {R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4, R.drawable.user5, R.drawable.user6, R.drawable.user7, R.drawable.user8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);
        myadapter adapter = new myadapter(this, arrname, arrstragename,arrnation, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(list_view.this,user_profile.class);
                intent.putExtra("name",arrname[position]);
                intent.putExtra("stragename",arrstragename[position]);
                intent.putExtra("nation",arrnation[position]);
                intent.putExtra("image",arrimage[position]);
                startActivity(intent);

            }
        });

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.listV);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profileV:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return  true;

                    case R.id.listV:

                        return true;
                }
                return false;
            }
        });
    }

    class myadapter extends ArrayAdapter<String> {

        Context context;
        String rname[];
        String rstragename[];
        String rnation[];
        int rimg[];

        public myadapter( Context context, String[] rname, String[] rnation,String[] rstragename, int[] rimg) {
            super(context,R.layout.row,R.id.imageView,rname);

            this.rname = rname;
            this.rnation = rnation;
            this.rstragename = rstragename;
            this.rimg = rimg;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.row,parent,false);

            ImageView img=view.findViewById(R.id.imageView);
            TextView username=view.findViewById(R.id.name);
            TextView userstragename=view.findViewById(R.id.stagename);
            TextView usernation=view.findViewById(R.id.nation);

            username.setText(rname[position]);
            userstragename.setText(rstragename[position]);
            usernation.setText(rnation[position]);
            img.setImageResource(rimg[position]);

            return view;
        }
    }

}
