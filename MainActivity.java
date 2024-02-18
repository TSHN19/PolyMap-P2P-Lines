package com.applicationdevelopment.polymapv2_yourcampuscompanion;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    final LinkedHashMap<String, List<String>>[] map = new LinkedHashMap[]{new LinkedHashMap<>()};
    private List<ConstraintLayout> layout_maps = new ArrayList<>();
    private List<ConstraintLayout> layout_lines = new ArrayList<>();
    private android.widget.ImageButton goto_previous, goto_next;
    private android.widget.ImageButton goto_about, goto_helpandsupport;
    private Button goto_privacypolicy, goto_termsofservice;
    private android.widget.ImageButton back_about, back_helpandsupport, back_privacypolicy, back_termsofservice;
    private android.widget.ImageButton run_pathfinder;
    private static final String[] nodes = new String[] {
            "Main Gate (MG)", "Institute for Science and Technology Research (ISTR)", "North Oval Runway (NOR)", "East Oval Runway (EOR)", "West Oval Runway (WOR)",
            "South Oval Runway (SOR)", "Food Nutrition Building (FN)", "Interfaith Chapel (IC)", "East Wing ground (EW4)", "East Wing ground (EW2)", "West Wing ground (WW2)",
            "West Wing ground (WW3)", "PUP Swimming Pool(PSP)", "Alumni Building (AL)", "P.E Building (P.EB)", "Grand Stand", "Ferry Terminal", "Linear Park (LP1)", "Lagoon 3 (L3)",
            "Linear Park (LP3)", "U", "Sampaguita Building (SB)", "Student Canteen (SC)", "Linear Park (LP2)", "Charlie Del Rosario (CDR)", "Laboratory High School",
            "Printing Press Building", "PUP Tennis Court (PTC)", "PUP Open Court (POC)", "PUP Swimming Pool", "Alumni Building", "Lagoon entrance (LE1)", "Lagoon entrance (LE2)",
            "Lagoon entrance (LE3)", "Ampitheather (AT)", "Ninoy Aquino Library and Learning Resource Center (NAL1)", "Ninoy Aquino Library and Learning Resource Center (NAL2)",
            "PUP Gymnasium (PG1)", "Way AAA (AAA)", "Way AAB (AAB)", "Way AAC (AAC)", "Way AAD (AAD)", "Way AAE (AAE)", "Way AAF (AAF)", "Way AAG (AAG)", "Way AAH (AAH)",
            "Way AAJ (AAJ)", "Ferry Terminal (FT)", "Way AAK (AAK)", "Way AAL (AAL)", "Way AAM (AAM)", "Way AAO (AAO)", "Way AAP (AAP)", "Way AAP (AAQ)", "Way AAR (AAR)",
            "Way AAS (AAS)", "Way AAT (AAT)", "Way AAU (AAU)", "Way AAV (AAV)", "Way AAW (AAW)", "Way AAX (AAX)", "Way AAY (AAY)", "Way AAZ (AAZ)", "Laboratory High School (LH1)",
            "Way ABA (ABA)", "Way ABB (ABB)", "Way ABC (ABC)", "Way ABD (ABD)", "Way ABE (ABE)", "Way ABF (ABF)", "Way ABG (ABG)", "Way ABH (ABH)", "Lagoon 1 (L1)", "Lagoon 2 (L2)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> ground_list = new ArrayList<>();
        ground_list.add("mg");
        map[0].put("ground", ground_list);
        map_images();

        AutoCompleteTextView start_point = findViewById(R.id.input_startpoint);
        AutoCompleteTextView end_point = findViewById(R.id.input_endpoint);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nodes);
        start_point.setAdapter(adapter);
        end_point.setAdapter(adapter);

        ConstraintLayout layout_about = findViewById(R.id.about);
        ConstraintLayout layout_helpandsupport = findViewById(R.id.helpandsupport);
        ConstraintLayout layout_privacypolicy = findViewById(R.id.privacypolicy);
        ConstraintLayout layout_termsofservice = findViewById(R.id.termsofservice);

        findViewById(R.id.button_previous).setVisibility(View.INVISIBLE);
        findViewById(R.id.button_next).setVisibility(View.INVISIBLE);

        goto_about = findViewById(R.id.button_about);
        goto_helpandsupport = findViewById(R.id.button_support);
        goto_privacypolicy = findViewById(R.id.button_privacypolicy);
        goto_termsofservice = findViewById(R.id.button_termsofservice);
        back_about = findViewById(R.id.button_backabout);
        back_helpandsupport = findViewById(R.id.button_backhelpandsupport);
        back_privacypolicy = findViewById(R.id.button_backprivacypolicy);
        back_termsofservice = findViewById(R.id.button_backtermsofservice);
        run_pathfinder = findViewById(R.id.button_run);

        goto_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_about.setVisibility(View.VISIBLE);
            }
        });

        goto_helpandsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_helpandsupport.setVisibility(View.VISIBLE);
            }
        });

        goto_privacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_privacypolicy.setVisibility(View.VISIBLE);
            }
        });

        goto_termsofservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_termsofservice.setVisibility(View.VISIBLE);
            }
        });

        back_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_about.setVisibility(View.GONE);
            }
        });

        back_helpandsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_helpandsupport.setVisibility(View.GONE);
            }
        });

        back_privacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_privacypolicy.setVisibility(View.GONE);
            }
        });

        back_termsofservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_termsofservice.setVisibility(View.GONE);
            }
        });

        run_pathfinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_maps.clear();
                layout_lines.clear();

                String input_start = start_point.getText().toString();
                String input_end = end_point.getText().toString();

                map[0] = pathing(input_start, input_end);
                map_images();
            }
        });
    }

    public void map_images() {
        ConstraintLayout lo_grounds = findViewById(R.id.lo_ground);
        ConstraintLayout ln_grounds = findViewById(R.id.ln_ground);

        List<String> keys = new ArrayList<>(map[0].keySet());
        String[] ground_path = null;

        int building_number = map[0].size();
        for (int i=0; i<building_number; i++) {
            if (keys.get(i).equals("ground")) {
                List<String> nodes = (List<String>) map[0].get("ground");
                ground_path = nodes.toArray(new String[0]);

                openGroundsMap(ground_path);
                layout_maps.add(lo_grounds);
                layout_lines.add(ln_grounds);
            }
        }

        layout_maps.get(0).setVisibility(View.VISIBLE);
        layout_lines.get(0).setVisibility(View.VISIBLE);
    }

    public void openGroundsMap(String[] path) {
        ArrayList<ImageView> p2p_imageview_list = new ArrayList<>();

        p2p_imageview_list.add(findViewById(R.id.img_aaa_aab));
        p2p_imageview_list.add(findViewById(R.id.img_aaa_aal));
        p2p_imageview_list.add(findViewById(R.id.img_aaa_aaq));
        p2p_imageview_list.add(findViewById(R.id.img_aab_aac));
        p2p_imageview_list.add(findViewById(R.id.img_aab_aal));
        p2p_imageview_list.add(findViewById(R.id.img_aac_aad));
        p2p_imageview_list.add(findViewById(R.id.img_aad_aae));
        p2p_imageview_list.add(findViewById(R.id.img_aad_aah));
        p2p_imageview_list.add(findViewById(R.id.img_aad_ic));
        p2p_imageview_list.add(findViewById(R.id.img_aae_aaf));
        p2p_imageview_list.add(findViewById(R.id.img_aae_ew4));
        p2p_imageview_list.add(findViewById(R.id.img_aae_ic));
        p2p_imageview_list.add(findViewById(R.id.img_aaf_aag));
        p2p_imageview_list.add(findViewById(R.id.img_aaf_ew2));
        p2p_imageview_list.add(findViewById(R.id.img_aaf_ew4));
        p2p_imageview_list.add(findViewById(R.id.img_aaf_fn));
        p2p_imageview_list.add(findViewById(R.id.img_aag_aad));
        p2p_imageview_list.add(findViewById(R.id.img_aag_aah));
        p2p_imageview_list.add(findViewById(R.id.img_aag_fn));
        p2p_imageview_list.add(findViewById(R.id.img_aag_ic));
        p2p_imageview_list.add(findViewById(R.id.img_aah_sor));
        p2p_imageview_list.add(findViewById(R.id.img_aah_wor));
        p2p_imageview_list.add(findViewById(R.id.img_aaj_aak));
        p2p_imageview_list.add(findViewById(R.id.img_aaj_ew2));
        p2p_imageview_list.add(findViewById(R.id.img_aaj_fw));
        p2p_imageview_list.add(findViewById(R.id.img_aaj_lp1));
        p2p_imageview_list.add(findViewById(R.id.img_aak_lp1));
        p2p_imageview_list.add(findViewById(R.id.img_aak_u));
        p2p_imageview_list.add(findViewById(R.id.img_aak_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_aal_aam));
        p2p_imageview_list.add(findViewById(R.id.img_aal_mg));
        p2p_imageview_list.add(findViewById(R.id.img_aam_nor));
        p2p_imageview_list.add(findViewById(R.id.img_aao_aav));
        p2p_imageview_list.add(findViewById(R.id.img_aao_cb));
        p2p_imageview_list.add(findViewById(R.id.img_aao_sb));
        p2p_imageview_list.add(findViewById(R.id.img_aao_sc));
        p2p_imageview_list.add(findViewById(R.id.img_aao_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_aap_aav));
        p2p_imageview_list.add(findViewById(R.id.img_aap_le3));
        p2p_imageview_list.add(findViewById(R.id.img_aap_ww3));
        p2p_imageview_list.add(findViewById(R.id.img_aaq_aar));
        p2p_imageview_list.add(findViewById(R.id.img_aaq_poc));
        p2p_imageview_list.add(findViewById(R.id.img_aaq_ptc));
        p2p_imageview_list.add(findViewById(R.id.img_aar_aas));
        p2p_imageview_list.add(findViewById(R.id.img_aar_poc));
        p2p_imageview_list.add(findViewById(R.id.img_aas_aau));
        p2p_imageview_list.add(findViewById(R.id.img_aas_aba));
        p2p_imageview_list.add(findViewById(R.id.img_aat_aar));
        p2p_imageview_list.add(findViewById(R.id.img_aau_aat));
        p2p_imageview_list.add(findViewById(R.id.img_aau_le1));
        p2p_imageview_list.add(findViewById(R.id.img_aaw_aav));
        p2p_imageview_list.add(findViewById(R.id.img_aaw_aax));
        p2p_imageview_list.add(findViewById(R.id.img_aaw_cb));
        p2p_imageview_list.add(findViewById(R.id.img_aaw_le2));
        p2p_imageview_list.add(findViewById(R.id.img_aax_aay));
        p2p_imageview_list.add(findViewById(R.id.img_aax_cb));
        p2p_imageview_list.add(findViewById(R.id.img_aay_aaz));
        p2p_imageview_list.add(findViewById(R.id.img_aay_lh1));
        p2p_imageview_list.add(findViewById(R.id.img_aaz_lh1));
        p2p_imageview_list.add(findViewById(R.id.img_aaz_pp));
        p2p_imageview_list.add(findViewById(R.id.img_aba_abb));
        p2p_imageview_list.add(findViewById(R.id.img_aba_abf));
        p2p_imageview_list.add(findViewById(R.id.img_aba_al));
        p2p_imageview_list.add(findViewById(R.id.img_aba_peb));
        p2p_imageview_list.add(findViewById(R.id.img_aba_psp));
        p2p_imageview_list.add(findViewById(R.id.img_abb_abc));
        p2p_imageview_list.add(findViewById(R.id.img_abc_abd));
        p2p_imageview_list.add(findViewById(R.id.img_abd_abe));
        p2p_imageview_list.add(findViewById(R.id.img_abd_pg1));
        p2p_imageview_list.add(findViewById(R.id.img_abe_aaa));
        p2p_imageview_list.add(findViewById(R.id.img_abe_istr));
        p2p_imageview_list.add(findViewById(R.id.img_abe_pg1));
        p2p_imageview_list.add(findViewById(R.id.img_abf_abg));
        p2p_imageview_list.add(findViewById(R.id.img_abg_abh));
        p2p_imageview_list.add(findViewById(R.id.img_abh_nal2));
        p2p_imageview_list.add(findViewById(R.id.img_abi_abj));
        p2p_imageview_list.add(findViewById(R.id.img_abi_abk));
        p2p_imageview_list.add(findViewById(R.id.img_abi_at));
        p2p_imageview_list.add(findViewById(R.id.img_abi_le1));
        p2p_imageview_list.add(findViewById(R.id.img_abj_abk));
        p2p_imageview_list.add(findViewById(R.id.img_abj_at));
        p2p_imageview_list.add(findViewById(R.id.img_abj_le1));
        p2p_imageview_list.add(findViewById(R.id.img_abj_le3));
        p2p_imageview_list.add(findViewById(R.id.img_abk_le2));
        p2p_imageview_list.add(findViewById(R.id.img_eor_sor));
        p2p_imageview_list.add(findViewById(R.id.img_le2_le3));
        p2p_imageview_list.add(findViewById(R.id.img_lp2_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_lp3_sc));
        p2p_imageview_list.add(findViewById(R.id.img_mg_aaa));
        p2p_imageview_list.add(findViewById(R.id.img_nal1_aax));
        p2p_imageview_list.add(findViewById(R.id.img_nal1_aay));
        p2p_imageview_list.add(findViewById(R.id.img_nor_eor));
        p2p_imageview_list.add(findViewById(R.id.img_nor_wor));
        p2p_imageview_list.add(findViewById(R.id.img_sb_sc));
        p2p_imageview_list.add(findViewById(R.id.img_sb_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_sc_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_u_ww2));
        p2p_imageview_list.add(findViewById(R.id.img_wor_gs));
        p2p_imageview_list.add(findViewById(R.id.img_wor_sor));

        String[] imageviewlist_string = {
                "aaa_aab", "aaa_aal", "aaa_aaq",
                "aab_aac", "aab_aal",
                "aac_aad",
                "aad_aae", "aad_aah", "aad_ic",
                "aae_aaf",
                "aae_ew4", "aae_ic",
                "aaf_aag", "aaf_ew2", "aaf_ew4", "aaf_fn",
                "aag_aad", "aag_aah", "aag_fn", "aag_ic",
                "aah_sor", "aah_wor",
                "aaj_aak", "aaj_ew2", "aaj_fw", "aaj_lp1",
                "aak_lp1", "aak_u", "aak_ww2",
                "aal_aam", "aal_mg",
                "aam_nor",
                "aao_aav", "aao_cb", "aao_sb", "aao_sc", "aao_ww2",
                "aap_aav", "aap_le3", "aap_ww3",
                "aaq_aar", "aaq_poc", "aaq_ptc",
                "aar_aas", "aar_poc",
                "aas_aau", "aas_aba",
                "aat_aar", "aau_aat",
                "aau_le1",
                "aaw_aav", "aaw_aax", "aaw_cb", "aaw_le2",
                "aax_aay", "aax_cb", "aay_aaz", "aay_lh1",
                "aaz_lh1", "aaz_pp",
                "aba_abb", "aba_abf", "aba_al", "aba_peb", "aba_psp",
                "abb_abc",
                "abc_abd", "abd_abe", "abd_pg1",
                "abe_aaa", "abe_istr", "abe_pg1",
                "abf_abg",
                "abg_abh",
                "abh_nal2",
                "abi_abj", "abi_abk", "abi_at", "abi_le1",
                "abj_abk", "abj_at", "abj_le1", "abj_le3",
                "abk_le2",
                "eor_sor",
                "le2_le3",
                "lp2_ww2",
                "lp3_sc",
                "mg_aaa",
                "nal1_aax", "nal1_aay",
                "nor_eor", "nor_wor",
                "sb_sc", "sb_ww2",
                "sc_ww2",
                "u_ww2",
                "wor_gs", "wor_sor"
        };

        Map<String, ImageView> line_path = new HashMap<>();

        int ivl_len = p2p_imageview_list.size();
        for (int i = 0; i < ivl_len; i++) {
            String[] parts;
            parts = imageviewlist_string[i].split("_");
            line_path.put(imageviewlist_string[i], p2p_imageview_list.get(i));
            if (parts.length == 2) {
                String reversePath = parts[1] + "_" + parts[0];
                line_path.put(reversePath, p2p_imageview_list.get(i));
            }
        }

        for (ImageView imageView : p2p_imageview_list) imageView.setVisibility(View.GONE);

        int path_length = path.length;
        int starting_point = 0;
        String previous_node = null, combined_node;
        for (int j = 0; j < path_length; j++) {
            if (starting_point != 0) {
                combined_node = previous_node + "_" + path[j];
                previous_node = path[j];
                ImageView x = line_path.get(combined_node);
                x.setVisibility(View.VISIBLE);
            } else {
                previous_node = path[j];
                starting_point = 1;
            }
        }
    }

    // Declare the paths in all areas
    private static HashMap<String, List<Pair<String, Integer>>> all_ground;

    public static void find(LinkedHashMap<String, List<String>> x, String start_node, String end_node) {
        // set starting and end point
        String startLocation = start_node;
        String endLocation = end_node;

        // call function that finds the shortest path
        List<String> shortestPath = findPath(startLocation, endLocation);
        //System.out.println(shortestPath);

        // get the nodes on each area
        all_ground = com.polymap.Data_Populator.populateAllground();

        // Regular expression pattern to extract string within parentheses
        Pattern pattern = Pattern.compile("\\((.*?)\\)");

        // create a list of arrays to put the nodes with their respective
        ArrayList<String> ground = new ArrayList<>();

        // create an array for the areas the node went
        ArrayList<String> previous_node = new ArrayList<>();

        // create a hashmap containing the distinct areas
        HashMap<String, String> previous_node_set = new HashMap<>();

        // iterate overall the nodes and classify them
        for (String node : shortestPath) {
            Matcher matcher = pattern.matcher(node);
            if (matcher.find()) {
                String extractedString = matcher.group(1);
                // Add the extracted string to the appropriate list based on the area
                if (all_ground.containsKey(node)) {
                    ground.add(extractedString);
                    if (!previous_node_set.containsKey("ground")) {
                        previous_node.add("ground");
                        previous_node_set.put("ground", "ground");
                    }
                }
            }
        }
        // Iterate through each list and convert all strings to lowercase
        for (int j = 0; j < ground.size(); j++) {
            ground.set(j, ground.get(j).toLowerCase());
        }
        // Add to x
        for (String nodeKey : previous_node) {
            if (nodeKey.equals("ground") && !ground.isEmpty()) {
                x.put(nodeKey, ground);
            }
        }
    }

    public static LinkedHashMap<String, List<String>> pathing(String start, String end) {
        // Call the 'find' method with initialized parameters
        LinkedHashMap<String, List<String>> x = new LinkedHashMap<>();
        find(x, start, end);
        // Print the result
        for (Map.Entry<String, List<String>> entry : x.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return x;
    }

    public static List<String> findPath(String start, String end) {
        // Priority queue to store (distance, node) pairs
        PriorityQueue<Pair<Integer, String>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));

        // Map to store the shortest distances
        Map<String, Integer> distances = new HashMap<>();
        for (String node : com.polymap.Graph.getAllNodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // Map to store the previous node in the optimal path
        Map<String, String> previousNode = new HashMap<>();
        for (String node : com.polymap.Graph.getAllNodes()) {
            previousNode.put(node, null);
        }

        pq.offer(new Pair<>(0, start));

        while (!pq.isEmpty()) {
            Pair<Integer, String> current = pq.poll();
            int currentDistance = current.getKey();
            String currentNode = current.getValue();

            if (currentNode.equals(end)) {
                break;
            }

            for (Pair<String, Integer> neighbor : com.polymap.Graph.getNeighbors(currentNode)) {
                String nextNode = neighbor.getKey();
                int weight = neighbor.getValue();
                int distance = currentDistance + weight;

                if (distance < distances.get(nextNode)) {
                    distances.put(nextNode, distance);
                    previousNode.put(nextNode, currentNode);
                    pq.offer(new Pair<>(distance, nextNode));
                }
            }
        }

        // Reconstruct the path from end to start
        List<String> path = new ArrayList<>();
        String current = end;
        while (current != null) {
            path.add(0, current);
            current = previousNode.get(current);
        }
        return path;
    }

    public static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

}
