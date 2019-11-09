package com.example.test3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final CardView post_card_view = findViewById(R.id.linear_layout_row2);
    Map parameters = new HashMap<>();
    ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_main,new ArrayList());
    for (DataSnapshot postSnapshot : snapshot.getChildren()) {

      ExcelExtract excelExtract = postSnapshot.getValue(ExcelExtract.class);

      long initialTime = System.currentTimeMillis();
      long now = System.currentTimeMillis();
      while (now - initialTime < 2000) {
        now = System.currentTimeMillis();
      }
      adapter.add(item);
      list4.add(excelExtract);
       //adapter = new TimerListAdapter(TimerActivity.this, list4);
      adapter.notifyItemChanged(list4.size(), list4);
      recyclerView.setAdapter(adapter);
    }

  }

}
