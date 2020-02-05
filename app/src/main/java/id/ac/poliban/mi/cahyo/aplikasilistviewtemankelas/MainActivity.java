package id.ac.poliban.mi.cahyo.aplikasilistviewtemankelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Insan Nor Cahyo");
        countries.add("Ahmad Yusfanhafizh");
        countries.add("Muhammad Rizki Fahmi");
        countries.add("Ahmad Hafizh Anshari");
        countries.add("Octa Pasaribu");
        countries.add("Molida Junida");
        countries.add("Hendra Gunawan");
        countries.add("Muhammad Rasyad Sultansyah");
        countries.add("Nia Karlidayanti");
        countries.add("Firda Kharisma");
        countries.add("Sari Rahma Maulida");
        countries.add("Fenia Dwimaulida");
        countries.add("Maulida Rahmi");
        countries.add("Wardatul Hisaniah");
        countries.add("Efa Maisuci");
        countries.add("Muhammad Auzan");
        countries.add("Rizky Nur Aulia");
        countries.add("Mayadiah Atikasari");
        countries.add("Maisarah");
        countries.add("Hini Amaliah");
        countries.add("Risma Sari");
        countries.add("Wenny Lisandra");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null)
            setTitle("Aplikasi List Countries");

        ListView listView = findViewById(R.id.lvList);

        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_teman, R.id.tvNama, countries);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Masukkan Nama :" + countries.get(position), Toast.LENGTH_LONG).show();
        });
    }
}
