package com.applicationdevelopment.polymap4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button goto_chk_button, goto_ground_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons_on_map);

        //Sample Path: ground: "ww2", "aao", "cb", "aax", "nal1"
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        List<String> ground_list = new ArrayList<>();
        ground_list.add("ww2");
        ground_list.add("aao");
        ground_list.add("cb");
        ground_list.add("aax");
        ground_list.add("nal1");

        List<String> chk_list = new ArrayList<>();
        chk_list.add("chkv");

        map.put("ground", ground_list);
        map.put("chk", chk_list);

        // Get the first key
        List<String> keys = new ArrayList<>(map.keySet());
        String next_map = keys.get(0);

        String[] ground_path = null;
        String[] chk_path = null;

        int building_number = map.size();
        for (int i=0; i<building_number; i++) {
            if (keys.get(i).equals("ground")) {
                List<String> nodes = (List<String>) map.get("ground");
                ground_path = nodes.toArray(new String[0]);
            }
            else if (keys.get(i).equals("chk")) {
                List<String> nodes = (List<String>) map.get("chk");
                chk_path = nodes.toArray(new String[0]);
            }
        }

        if (ground_path != null) {
            goto_ground_button = (Button) findViewById(R.id.goto_ground);
            openGroundMap(ground_path);
        }
    }

    public void openGroundMap(String[] path) {
        
    }

    public void openCHK1Map (Map map) {

    }
}
