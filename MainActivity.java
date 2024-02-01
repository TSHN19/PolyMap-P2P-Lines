package com.applicationdevelopment.polymapp2plines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ImageView> imageview_list = new ArrayList<>();

        imageview_list.add(findViewById(R.id.img_aaa_aab));
        imageview_list.add(findViewById(R.id.img_aaa_aal));
        imageview_list.add(findViewById(R.id.img_aaa_aaq));
        imageview_list.add(findViewById(R.id.img_aaa_abe));
        imageview_list.add(findViewById(R.id.img_aaa_mg));
        imageview_list.add(findViewById(R.id.img_aab_aac));
        imageview_list.add(findViewById(R.id.img_aab_aal));
        imageview_list.add(findViewById(R.id.img_aac_aad));
        imageview_list.add(findViewById(R.id.img_aad_aae));
        imageview_list.add(findViewById(R.id.img_aad_aag));
        imageview_list.add(findViewById(R.id.img_aad_aah));
        imageview_list.add(findViewById(R.id.img_aad_ic));
        imageview_list.add(findViewById(R.id.img_aae_aaf));
        imageview_list.add(findViewById(R.id.img_aae_ew4));
        imageview_list.add(findViewById(R.id.img_aae_ic));
        imageview_list.add(findViewById(R.id.img_aae_nw1));
        imageview_list.add(findViewById(R.id.img_aaf_aag));
        imageview_list.add(findViewById(R.id.img_aaf_ew1));
        imageview_list.add(findViewById(R.id.img_aaf_ew4));
        imageview_list.add(findViewById(R.id.img_aaf_fn));
        imageview_list.add(findViewById(R.id.img_aag_aah));
        imageview_list.add(findViewById(R.id.img_aag_fn));
        imageview_list.add(findViewById(R.id.img_aag_ic));
        imageview_list.add(findViewById(R.id.img_aah_sor));
        imageview_list.add(findViewById(R.id.img_aah_wor));
        imageview_list.add(findViewById(R.id.img_aai_ew1));
        imageview_list.add(findViewById(R.id.img_aai_ew2));
        imageview_list.add(findViewById(R.id.img_aaj_aak));
        imageview_list.add(findViewById(R.id.img_aaj_ew2));
        imageview_list.add(findViewById(R.id.img_aaj_fw));
        imageview_list.add(findViewById(R.id.img_aaj_lp1));
        imageview_list.add(findViewById(R.id.img_aak_aan));
        imageview_list.add(findViewById(R.id.img_aak_lp1));
        imageview_list.add(findViewById(R.id.img_aak_u));
        imageview_list.add(findViewById(R.id.img_aak_ww1));
        imageview_list.add(findViewById(R.id.img_aal_aam));
        imageview_list.add(findViewById(R.id.img_aal_mg));
        imageview_list.add(findViewById(R.id.img_aam_nor));
        imageview_list.add(findViewById(R.id.img_aan_aao));
        imageview_list.add(findViewById(R.id.img_aan_lp2));
        imageview_list.add(findViewById(R.id.img_aan_sb));
        imageview_list.add(findViewById(R.id.img_aan_sc));
        imageview_list.add(findViewById(R.id.img_aan_u));
        imageview_list.add(findViewById(R.id.img_aan_ww1));
        imageview_list.add(findViewById(R.id.img_aan_ww2));
        imageview_list.add(findViewById(R.id.img_aao_aav));
        imageview_list.add(findViewById(R.id.img_aao_cb));
        imageview_list.add(findViewById(R.id.img_aao_sb));
        imageview_list.add(findViewById(R.id.img_aao_sc));
        imageview_list.add(findViewById(R.id.img_aao_ww2));
        imageview_list.add(findViewById(R.id.img_aap_aav));
        imageview_list.add(findViewById(R.id.img_aap_le3));
        imageview_list.add(findViewById(R.id.img_aap_nw2));
        imageview_list.add(findViewById(R.id.img_aap_ww3));
        imageview_list.add(findViewById(R.id.img_aaq_aar));
        imageview_list.add(findViewById(R.id.img_aaq_poc));
        imageview_list.add(findViewById(R.id.img_aaq_ptc));
        imageview_list.add(findViewById(R.id.img_aar_aas));
        imageview_list.add(findViewById(R.id.img_aar_aat));
        imageview_list.add(findViewById(R.id.img_aar_poc));
        imageview_list.add(findViewById(R.id.img_aas_aau));
        imageview_list.add(findViewById(R.id.img_aas_aba));
        imageview_list.add(findViewById(R.id.img_aat_aau));
        imageview_list.add(findViewById(R.id.img_aau_le1));
        imageview_list.add(findViewById(R.id.img_aaw_aav));
        imageview_list.add(findViewById(R.id.img_aaw_aax));
        imageview_list.add(findViewById(R.id.img_aaw_cb));
        imageview_list.add(findViewById(R.id.img_aaw_le2));
        imageview_list.add(findViewById(R.id.img_aax_aay));
        imageview_list.add(findViewById(R.id.img_aax_cb));
        imageview_list.add(findViewById(R.id.img_aax_nal1));
        imageview_list.add(findViewById(R.id.img_aay_aaz));
        imageview_list.add(findViewById(R.id.img_aay_lh1));
        imageview_list.add(findViewById(R.id.img_aay_nal1));
        imageview_list.add(findViewById(R.id.img_aaz_lh1));
        imageview_list.add(findViewById(R.id.img_aaz_pp));
        imageview_list.add(findViewById(R.id.img_aba_abb));
        imageview_list.add(findViewById(R.id.img_aba_abf));
        imageview_list.add(findViewById(R.id.img_aba_al));
        imageview_list.add(findViewById(R.id.img_aba_peb));
        imageview_list.add(findViewById(R.id.img_aba_psp));
        imageview_list.add(findViewById(R.id.img_abb_abc));
        imageview_list.add(findViewById(R.id.img_abc_abd));
        imageview_list.add(findViewById(R.id.img_abd_abe));
        imageview_list.add(findViewById(R.id.img_abd_pg1));
        imageview_list.add(findViewById(R.id.img_abe_istr));
        imageview_list.add(findViewById(R.id.img_abe_pg1));
        imageview_list.add(findViewById(R.id.img_abf_abg));
        imageview_list.add(findViewById(R.id.img_abg_abh));
        imageview_list.add(findViewById(R.id.img_abh_nal2));
        imageview_list.add(findViewById(R.id.img_abi_abj));
        imageview_list.add(findViewById(R.id.img_abi_abk));
        imageview_list.add(findViewById(R.id.img_abi_at));
        imageview_list.add(findViewById(R.id.img_abi_le1));
        imageview_list.add(findViewById(R.id.img_abj_abk));
        imageview_list.add(findViewById(R.id.img_abj_at));
        imageview_list.add(findViewById(R.id.img_abj_le1));
        imageview_list.add(findViewById(R.id.img_abj_le3));
        imageview_list.add(findViewById(R.id.img_abk_le2));
        imageview_list.add(findViewById(R.id.img_eor_nor));
        imageview_list.add(findViewById(R.id.img_eor_sor));
        imageview_list.add(findViewById(R.id.img_gs_wor));
        imageview_list.add(findViewById(R.id.img_le2_le3));
        imageview_list.add(findViewById(R.id.img_lp3_sc));
        imageview_list.add(findViewById(R.id.img_nor_wor));
        imageview_list.add(findViewById(R.id.img_nw1_ew4));
        imageview_list.add(findViewById(R.id.img_nw1_nw2));
        imageview_list.add(findViewById(R.id.img_nw2_ww3));
        imageview_list.add(findViewById(R.id.img_sb_sc));
        imageview_list.add(findViewById(R.id.img_sor_wor));
        imageview_list.add(findViewById(R.id.img_u_ww1));


        String[] ivl_string = {
                "aaa_aab", "aaa_aal", "aaa_aaq", "aaa_abe", "aaa_mg",
                "aab_aac", "aab_aal",
                "aac_aad",
                "aad_aae", "aad_aag", "aad_aah", "aad_ic",
                "aae_aaf", "aae_ew4", "aae_ic", "aae_nw1",
                "aaf_aag", "aaf_ew1", "aaf_ew4", "aaf_fn",
                "aag_aah", "aag_fn", "aag_ic",
                "aah_sor", "aah_wor",
                "aai_ew1", "aai_ew2",
                "aaj_aak", "aaj_ew2", "aaj_fw", "aaj_lp1",
                "aak_aan", "aak_lp1", "aak_u", "aak_ww1",
                "aal_aam", "aal_mg",
                "aam_nor",
                "aan_aao", "aan_lp2", "aan_sb", "aan_sc", "aan_u", "aan_ww1", "aan_ww2",
                "aao_aav", "aao_cb", "aao_sb", "aao_sc", "aao_ww2",
                "aap_aav", "aap_le3", "aap_nw2", "aap_ww3",
                "aaq_aar", "aaq_poc", "aaq_ptc",
                "aar_aas", "aar_aat", "aar_poc",
                "aas_aau", "aas_aba",
                "aat_aau",
                "aau_le1",
                "aaw_aav", "aaw_aax", "aaw_cb", "aaw_le2",
                "aax_aay", "aax_cb", "aax_nal1",
                "aay_aaz", "aay_lh1", "aay_nal1",
                "aaz_lh1", "aaz_pp",
                "aba_abb", "aba_abf", "aba_al", "aba_peb", "aba_psp",
                "abb_abc",
                "abc_abd",
                "abd_abe", "abd_pg1",
                "abe_istr", "abe_pg1",
                "abf_abg",
                "abg_abh",
                "abh_nal2",
                "abi_abj", "abi_abk", "abi_at", "abi_le1",
                "abj_abk", "abj_at", "abj_le1", "abj_le3",
                "abk_le2",
                "eor_nor", "eor_sor",
                "gs_wor",
                "le2_le3",
                "lp3_sc",
                "nor_wor",
                "nw1_ew4", "nw1_nw2",
                "nw2_ww3",
                "sb_sc",
                "sor_wor",
                "u_ww1"
        };

        Map<String, ImageView> line_path = new HashMap<>();

        int ivl_len = imageview_list.size();
        for (int i = 0; i < ivl_len; i++) {
            String[] parts;

            parts = ivl_string[i].split("_");
            String reversePath = parts[1] + "_" + parts[0];

            line_path.put(ivl_string[i], imageview_list.get(i));
            line_path.put(reversePath, imageview_list.get(i));
        }

        //Sample Path: Main Gate to Lagoon Entrance 1
        String[] path = {"mg", "aaa", "aaq", "aar", "aat", "aau", "le1"};
        //String[] path = {"le1", "aau", "aat", "aar", "aaq", "aaa", "mg"};

        //Sample Path: Grandstand to Linear Park 1
        //String[] path = {"gs", "wor", "aah", "aag", "aaf", "ew1", "aai", "ew2", "aaj", "lp1"};

        //Sample Path: Ninoy Library 2 to East Wing 4
        //String[] path = {"nal2", "abh", "abg", "abf", "aba", "aas", "aau", "le1", "abj", "le3", "aap", "nw2", "nw1", "ew4"};

        for (ImageView imageView : imageview_list) imageView.setVisibility(View.GONE);

        int path_length = path.length;
        int starting_point = 0;
        String previous_node = null, combined_node;
        for (int j = 0; j < path_length; j++) {
            if (starting_point != 0) {
                combined_node = previous_node + "_" + path[j];
                ImageView x = line_path.get(combined_node);
                x.setVisibility(View.VISIBLE);
                previous_node = path[j];
            }
            else {
                previous_node = path[j];
                starting_point = 1;
            }
        }
    }
}
