package com.applicationdevelopment.polymapp2plines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView aaa_aab = findViewById(R.id.img_aaa_aab);
        ImageView aaa_aal = findViewById(R.id.img_aaa_aal);
        ImageView aaa_aaq = findViewById(R.id.img_aaa_aaq);
        ImageView aaa_abe = findViewById(R.id.img_aaa_abe);
        ImageView aaa_mg = findViewById(R.id.img_aaa_mg);
        ImageView aab_aac = findViewById(R.id.img_aab_aac);
        ImageView aab_aal = findViewById(R.id.img_aab_aal);
        ImageView aac_aad = findViewById(R.id.img_aac_aad);
        ImageView aad_aae = findViewById(R.id.img_aad_aae);
        ImageView aad_aag = findViewById(R.id.img_aad_aag);
        ImageView aad_aah = findViewById(R.id.img_aad_aah);
        ImageView aad_ic = findViewById(R.id.img_aad_ic);
        ImageView aae_aaf = findViewById(R.id.img_aae_aaf);
        ImageView aae_ew4 = findViewById(R.id.img_aae_ew4);
        ImageView aae_ic = findViewById(R.id.img_aae_ic);
        ImageView aae_nw1 = findViewById(R.id.img_aae_nw1);
        ImageView aaf_aag = findViewById(R.id.img_aaf_aag);
        ImageView aaf_ew1 = findViewById(R.id.img_aaf_ew1);
        ImageView aaf_ew4 = findViewById(R.id.img_aaf_ew4);
        ImageView aaf_fn = findViewById(R.id.img_aaf_fn);
        ImageView aag_aah = findViewById(R.id.img_aag_aah);
        ImageView aag_fn = findViewById(R.id.img_aag_fn);
        ImageView aag_ic = findViewById(R.id.img_aag_ic);
        ImageView aah_sor = findViewById(R.id.img_aah_sor);
        ImageView aah_wor = findViewById(R.id.img_aah_wor);
        ImageView aai_ew1 = findViewById(R.id.img_aai_ew1);
        ImageView aai_ew2 = findViewById(R.id.img_aai_ew2);
        ImageView aaj_aak = findViewById(R.id.img_aaj_aak);
        ImageView aaj_ew2 = findViewById(R.id.img_aaj_ew2);
        ImageView aaj_fw = findViewById(R.id.img_aaj_fw);
        ImageView aaj_lp1 = findViewById(R.id.img_aaj_lp1);
        ImageView aak_aan = findViewById(R.id.img_aak_aan);
        ImageView aak_lp1 = findViewById(R.id.img_aak_lp1);
        ImageView aak_u = findViewById(R.id.img_aak_u);
        ImageView aak_ww1 = findViewById(R.id.img_aak_ww1);
        ImageView aal_aam = findViewById(R.id.img_aal_aam);
        ImageView aal_mg = findViewById(R.id.img_aal_mg);
        ImageView aam_nor = findViewById(R.id.img_aam_nor);
        ImageView aan_aao = findViewById(R.id.img_aan_aao);
        ImageView aan_lp2 = findViewById(R.id.img_aan_lp2);
        ImageView aan_sb = findViewById(R.id.img_aan_sb);
        ImageView aan_sc = findViewById(R.id.img_aan_sc);
        ImageView aan_u = findViewById(R.id.img_aan_u);
        ImageView aan_ww1 = findViewById(R.id.img_aan_ww1);
        ImageView aan_ww2 = findViewById(R.id.img_aan_ww2);
        ImageView aao_aav = findViewById(R.id.img_aao_aav);
        ImageView aao_cb = findViewById(R.id.img_aao_cb);
        ImageView aao_sb = findViewById(R.id.img_aao_sb);
        ImageView aao_sc = findViewById(R.id.img_aao_sc);
        ImageView aao_ww2 = findViewById(R.id.img_aao_ww2);
        ImageView aap_aav = findViewById(R.id.img_aap_aav);
        ImageView aap_le3 = findViewById(R.id.img_aap_le3);
        ImageView aap_nw2 = findViewById(R.id.img_aap_nw2);
        ImageView aap_ww3 = findViewById(R.id.img_aap_ww3);
        ImageView aaq_aar = findViewById(R.id.img_aaq_aar);
        ImageView aaq_poc = findViewById(R.id.img_aaq_poc);
        ImageView aaq_ptc = findViewById(R.id.img_aaq_ptc);
        ImageView aar_aas = findViewById(R.id.img_aar_aas);
        ImageView aar_aat = findViewById(R.id.img_aar_aat);
        ImageView aar_poc = findViewById(R.id.img_aar_poc);
        ImageView aas_aau = findViewById(R.id.img_aas_aau);
        ImageView aas_aba = findViewById(R.id.img_aas_aba);
        ImageView aat_aau = findViewById(R.id.img_aat_aau);
        ImageView aau_le1 = findViewById(R.id.img_aau_le1);
        ImageView aaw_aav = findViewById(R.id.img_aaw_aav);
        ImageView aaw_aax = findViewById(R.id.img_aaw_aax);
        ImageView aaw_cb = findViewById(R.id.img_aaw_cb);
        ImageView aaw_le2 = findViewById(R.id.img_aaw_le2);
        ImageView aax_aay = findViewById(R.id.img_aax_aay);
        ImageView aax_cb = findViewById(R.id.img_aax_cb);
        ImageView aax_nal1 = findViewById(R.id.img_aax_nal1);
        ImageView aay_aaz = findViewById(R.id.img_aay_aaz);
        ImageView aay_lh1 = findViewById(R.id.img_aay_lh1);
        ImageView aay_nal1 = findViewById(R.id.img_aay_nal1);
        ImageView aaz_lh1 = findViewById(R.id.img_aaz_lh1);
        ImageView aaz_pp = findViewById(R.id.img_aaz_pp);
        ImageView aba_abb = findViewById(R.id.img_aba_abb);
        ImageView aba_abf = findViewById(R.id.img_aba_abf);
        ImageView aba_al = findViewById(R.id.img_aba_al);
        ImageView aba_peb = findViewById(R.id.img_aba_peb);
        ImageView aba_psp = findViewById(R.id.img_aba_psp);
        ImageView abb_abc = findViewById(R.id.img_abb_abc);
        ImageView abc_abd = findViewById(R.id.img_abc_abd);
        ImageView abd_abe = findViewById(R.id.img_abd_abe);
        ImageView abd_pg1 = findViewById(R.id.img_abd_pg1);
        ImageView abe_istr = findViewById(R.id.img_abe_istr);
        ImageView abe_pg1 = findViewById(R.id.img_abe_pg1);
        ImageView abf_abg = findViewById(R.id.img_abf_abg);
        ImageView abg_abh = findViewById(R.id.img_abg_abh);
        ImageView abh_nal2 = findViewById(R.id.img_abh_nal2);
        ImageView abi_abj = findViewById(R.id.img_abi_abj);
        ImageView abi_abk = findViewById(R.id.img_abi_abk);
        ImageView abi_at = findViewById(R.id.img_abi_at);
        ImageView abi_le1 = findViewById(R.id.img_abi_le1);
        ImageView abj_abk = findViewById(R.id.img_abj_abk);
        ImageView abj_at = findViewById(R.id.img_abj_at);
        ImageView abj_le1 = findViewById(R.id.img_abj_le1);
        ImageView abj_le3 = findViewById(R.id.img_abj_le3);
        ImageView abk_le2 = findViewById(R.id.img_abk_le2);
        ImageView eor_nor = findViewById(R.id.img_eor_nor);
        ImageView eor_sor = findViewById(R.id.img_eor_sor);
        ImageView gs_wor = findViewById(R.id.img_gs_wor);
        ImageView le2_le3 = findViewById(R.id.img_le2_le3);
        ImageView lp3_sc = findViewById(R.id.img_lp3_sc);
        ImageView nor_wor = findViewById(R.id.img_nor_wor);
        ImageView nw1_ew4 = findViewById(R.id.img_nw1_ew4);
        ImageView nw1_nw2 = findViewById(R.id.img_nw1_nw2);
        ImageView nw2_ww3 = findViewById(R.id.img_nw2_ww3);
        ImageView sb_sc = findViewById(R.id.img_sb_sc);
        ImageView sor_wor = findViewById(R.id.img_sor_wor);
        ImageView u_ww1 = findViewById(R.id.img_u_ww1);

        ImageView[] imageview_list = {
                aaa_aab, aaa_aal, aaa_aaq, aaa_abe, aaa_mg,
                aab_aac, aab_aal,
                aac_aad,
                aad_aae, aad_aag, aad_aah, aad_ic,
                aae_aaf, aae_ew4, aae_ic, aae_nw1,
                aaf_aag, aaf_ew1, aaf_ew4, aaf_fn,
                aag_aah, aag_fn, aag_ic,
                aah_sor, aah_wor,
                aai_ew1, aai_ew2,
                aaj_aak, aaj_ew2, aaj_fw, aaj_lp1,
                aak_aan, aak_lp1, aak_u, aak_ww1,
                aal_aam, aal_mg,
                aam_nor,
                aan_aao, aan_lp2, aan_sb, aan_sc, aan_u, aan_ww1, aan_ww2,
                aao_aav, aao_cb, aao_sb, aao_sc, aao_ww2,
                aap_aav, aap_le3, aap_nw2, aap_ww3,
                aaq_aar, aaq_poc, aaq_ptc,
                aar_aas, aar_aat, aar_poc,
                aas_aau, aas_aba,
                aat_aau,
                aau_le1,
                aaw_aav, aaw_aax, aaw_cb, aaw_le2,
                aax_aay, aax_cb, aax_nal1,
                aay_aaz, aay_lh1, aay_nal1,
                aaz_lh1, aaz_pp,
                aba_abb, aba_abf, aba_al, aba_peb, aba_psp,
                abb_abc,
                abc_abd,
                abd_abe, abd_pg1,
                abe_istr, abe_pg1,
                abf_abg,
                abg_abh,
                abh_nal2,
                abi_abj, abi_abk, abi_at, abi_le1,
                abj_abk, abj_at, abj_le1, abj_le3,
                abk_le2,
                eor_nor, eor_sor,
                gs_wor,
                le2_le3,
                lp3_sc,
                nor_wor,
                nw1_ew4, nw1_nw2,
                nw2_ww3,
                sb_sc,
                sor_wor,
                u_ww1
        };
        for (ImageView imageView : imageview_list) imageView.setVisibility(View.GONE);

        //Sample Path: Main Gate to Lagoon Entrance 1
        //String[] path = {"mg", "aaa", "aaq", "aar", "aat", "aau", "le1"};

        //Sample Path: Grandstand to Linear Park 1
        //String[] path = {"gs", "wor", "aah", "aag", "aaf", "ew1", "aai", "ew2", "aaj", "lp1"};

        //Sample Path: Ninoy Library 2 to East Wing 4
        String[] path = {"nal2", "abh", "abg", "abf", "aba", "aas", "aau", "le1", "abj", "le3", "aap", "nw2", "nw1", "ew4"};

        Map<String, ImageView> line_path = new HashMap<>();
        line_path.put("aaa_aab", aaa_aab);
        line_path.put("aaa_aal", aaa_aal);
        line_path.put("aaa_aaq", aaa_aaq);
        line_path.put("aaa_abe", aaa_abe);
        line_path.put("aaa_mg", aaa_mg);
        line_path.put("aab_aaa", aaa_aab);
        line_path.put("aab_aac", aab_aac);
        line_path.put("aab_aal", aab_aal);
        line_path.put("aac_aab", aab_aac);
        line_path.put("aac_aad", aac_aad);
        line_path.put("aad_aac", aac_aad);
        line_path.put("aad_aae", aad_aae);
        line_path.put("aad_aag", aad_aag);
        line_path.put("aad_aah", aad_aah);
        line_path.put("aad_ic", aad_ic);
        line_path.put("aae_aad", aad_aae);
        line_path.put("aae_aaf", aae_aaf);
        line_path.put("aae_ew4", aae_ew4);
        line_path.put("aae_ic", aae_ic);
        line_path.put("aae_nw1", aae_nw1);
        line_path.put("aaf_aae", aae_aaf);
        line_path.put("aaf_aag", aaf_aag);
        line_path.put("aaf_ew1", aaf_ew1);
        line_path.put("aaf_ew4", aaf_ew4);
        line_path.put("aaf_fn", aaf_fn);
        line_path.put("aag_aad", aad_aag);
        line_path.put("aag_aaf", aaf_aag);
        line_path.put("aag_aah", aag_aah);
        line_path.put("aag_fn", aag_fn);
        line_path.put("aag_ic", aag_ic);
        line_path.put("aah_aad", aad_aah);
        line_path.put("aah_aag", aag_aah);
        line_path.put("aah_sor", aah_sor);
        line_path.put("aah_wor", aah_wor);
        line_path.put("aai_ew1", aai_ew1);
        line_path.put("aai_ew2", aai_ew2);
        line_path.put("aaj_aak", aaj_aak);
        line_path.put("aaj_ew2", aaj_ew2);
        line_path.put("aaj_fw", aaj_fw);
        line_path.put("aaj_lp1", aaj_lp1);
        line_path.put("aak_aaj", aaj_aak);
        line_path.put("aak_aan", aak_aan);
        line_path.put("aak_lp1", aak_lp1);
        line_path.put("aak_u", aak_u);
        line_path.put("aak_ww1", aak_ww1);
        line_path.put("aal_aaa", aaa_aal);
        line_path.put("aal_aab", aab_aal);
        line_path.put("aal_aam", aal_aam);
        line_path.put("aal_mg", aal_mg);
        line_path.put("aam_aal", aal_aam);
        line_path.put("aam_nor", aam_nor);
        line_path.put("aan_aak", aak_aan);
        line_path.put("aan_aao", aan_aao);
        line_path.put("aan_lp2", aan_lp2);
        line_path.put("aan_sb", aan_sb);
        line_path.put("aan_sc", aan_sc);
        line_path.put("aan_u", aan_u);
        line_path.put("aan_ww1", aan_ww1);
        line_path.put("aan_ww2", aan_ww2);
        line_path.put("aao_aan", aan_aao);
        line_path.put("aao_aav", aao_aav);
        line_path.put("aao_cb", aao_cb);
        line_path.put("aao_sb", aao_sb);
        line_path.put("aao_sc", aao_sc);
        line_path.put("aao_ww2", aao_ww2);
        line_path.put("aap_aav", aap_aav);
        line_path.put("aap_le3", aap_le3);
        line_path.put("aap_nw2", aap_nw2);
        line_path.put("aap_ww3", aap_ww3);
        line_path.put("aaq_aaa", aaa_aaq);
        line_path.put("aaq_aar", aaq_aar);
        line_path.put("aaq_poc", aaq_poc);
        line_path.put("aaq_ptc", aaq_ptc);
        line_path.put("aar_aaq", aaq_aar);
        line_path.put("aar_aas", aar_aas);
        line_path.put("aar_aat", aar_aat);
        line_path.put("aar_poc", aar_poc);
        line_path.put("aas_aar", aar_aas);
        line_path.put("aas_aau", aas_aau);
        line_path.put("aas_aba", aas_aba);
        line_path.put("aat_aar", aar_aat);
        line_path.put("aat_aau", aat_aau);
        line_path.put("aau_aas", aas_aau);
        line_path.put("aau_aat", aat_aau);
        line_path.put("aau_le1", aau_le1);
        line_path.put("aav_aao", aao_aav);
        line_path.put("aav_aap", aap_aav);
        line_path.put("aav_aaw", aaw_aav);
        line_path.put("aaw_aav", aaw_aav);
        line_path.put("aaw_aax", aaw_aax);
        line_path.put("aaw_cb", aaw_cb);
        line_path.put("aaw_le2", aaw_le2);
        line_path.put("aax_aaw", aaw_aax);
        line_path.put("aax_aay", aax_aay);
        line_path.put("aax_cb", aax_cb);
        line_path.put("aax_nal1", aax_nal1);
        line_path.put("aay_aax", aax_aay);
        line_path.put("aay_aaz", aay_aaz);
        line_path.put("aay_lh1", aay_lh1);
        line_path.put("aay_nal1", aay_nal1);
        line_path.put("aaz_aay", aay_aaz);
        line_path.put("aaz_lh1", aaz_lh1);
        line_path.put("aaz_pp", aaz_pp);
        line_path.put("aba_aas", aas_aba);
        line_path.put("aba_abb", aba_abb);
        line_path.put("aba_abf", aba_abf);
        line_path.put("aba_al", aba_al);
        line_path.put("aba_peb", aba_peb);
        line_path.put("aba_psp", aba_psp);
        line_path.put("abb_aba", aba_abb);
        line_path.put("abb_abc", abb_abc);
        line_path.put("abc_abb", abb_abc);
        line_path.put("abc_abd", abc_abd);
        line_path.put("abd_abc", abc_abd);
        line_path.put("abd_abe", abd_abe);
        line_path.put("abd_pg1", abd_pg1);
        line_path.put("abe_aaa", aaa_abe);
        line_path.put("abe_abd", abd_abe);
        line_path.put("abe_istr", abe_istr);
        line_path.put("abe_pg1", abe_pg1);
        line_path.put("abf_aba", aba_abf);
        line_path.put("abf_abg", abf_abg);
        line_path.put("abg_abf", abf_abg);
        line_path.put("abg_abh", abg_abh);
        line_path.put("abh_abg", abg_abh);
        line_path.put("abh_nal2", abh_nal2);
        line_path.put("abi_abj", abi_abj);
        line_path.put("abi_abk", abi_abk);
        line_path.put("abi_at", abi_at);
        line_path.put("abi_le1", abi_le1);
        line_path.put("abj_abi", abi_abj);
        line_path.put("abj_abk", abj_abk);
        line_path.put("abj_at", abj_at);
        line_path.put("abj_le1", abj_le1);
        line_path.put("abj_le3", abj_le3);
        line_path.put("abk_abj", abj_abk);
        line_path.put("abk_abi", abi_abk);
        line_path.put("abk_le2", abk_le2);
        line_path.put("al_aba", aba_al);
        line_path.put("at_abi", abi_at);
        line_path.put("at_abj", abj_at);
        line_path.put("cb_aao", aao_cb);
        line_path.put("cb_aaw", aaw_cb);
        line_path.put("cb_aax", aax_cb);
        line_path.put("eor_nor", eor_nor);
        line_path.put("eor_sor", eor_sor);
        line_path.put("ew1_aaf", aaf_ew1);
        line_path.put("ew1_aai", aai_ew1);
        line_path.put("ew2_aai", aai_ew2);
        line_path.put("ew2_aaj", aaj_ew2);
        line_path.put("ew4_aae", aae_ew4);
        line_path.put("ew4_aaf", aaf_ew4);
        line_path.put("fn_aaf", aaf_fn);
        line_path.put("fn_aag", aag_fn);
        line_path.put("fw_aaj", aaj_fw);
        line_path.put("gs_wor", gs_wor);
        line_path.put("ic_aad", aad_ic);
        line_path.put("ic_aae", aae_ic);
        line_path.put("ic_aag", aag_ic);
        line_path.put("istr_abe", abe_istr);
        line_path.put("le1_aau", aau_le1);
        line_path.put("le1_abi", abi_le1);
        line_path.put("le1_abj", abj_le1);
        line_path.put("le2_aaw", aaw_le2);
        line_path.put("le2_abk", abk_le2);
        line_path.put("le2_le3", le2_le3);
        line_path.put("le3_aap", aap_le3);
        line_path.put("le3_abj", abj_le3);
        line_path.put("le3_le2", le2_le3);
        line_path.put("lh1_aay", aay_lh1);
        line_path.put("lh1_aaz", aaz_lh1);
        line_path.put("lp1_aaj", aaj_lp1);
        line_path.put("lp1_aak", aak_lp1);
        line_path.put("lp2_aan", aan_lp2);
        line_path.put("lp3_sc", lp3_sc);
        line_path.put("mg_aaa", aaa_mg);
        line_path.put("mg_aal", aal_mg);
        line_path.put("nal1_aax", aax_nal1);
        line_path.put("nal1_aay", aay_nal1);
        line_path.put("nal2_abh", abh_nal2);
        line_path.put("nor_aam", aam_nor);
        line_path.put("nor_eor", eor_nor);
        line_path.put("nor_wor", nor_wor);
        line_path.put("nw1_aae", aae_nw1);
        line_path.put("nw1_ew4", nw1_ew4);
        line_path.put("nw1_nw2", nw1_nw2);
        line_path.put("nw2_aap", aap_nw2);
        line_path.put("nw2_nw1", nw1_nw2);
        line_path.put("nw2_ww3", nw2_ww3);
        line_path.put("peb_aba", aba_peb);
        line_path.put("pg1_abd", abd_pg1);
        line_path.put("pg1_abe", abe_pg1);
        line_path.put("poc_aaq", aaq_poc);
        line_path.put("poc_aar", aar_poc);
        line_path.put("pp_aaz", aaz_pp);
        line_path.put("psp_aba", aba_psp);
        line_path.put("ptc_aaq", aaq_ptc);
        line_path.put("sb_aan", aan_sb);
        line_path.put("sb_aao", aao_sb);
        line_path.put("sb_sc", sb_sc);
        line_path.put("sc_aan", aan_sc);
        line_path.put("sc_aao", aao_sc);
        line_path.put("sc_lp3", lp3_sc);
        line_path.put("sc_sb", sb_sc);
        line_path.put("sor_aah", aah_sor);
        line_path.put("sor_eor", eor_sor);
        line_path.put("sor_wor", sor_wor);
        line_path.put("u_aak", aak_u);
        line_path.put("u_aan", aan_u);
        line_path.put("u_ww1", u_ww1);
        line_path.put("wor_aah", aah_wor);
        line_path.put("wor_gs", gs_wor);
        line_path.put("wor_nor", nor_wor);
        line_path.put("wor_sor", sor_wor);
        line_path.put("ww1_aak", aak_ww1);
        line_path.put("ww1_aan", aan_ww1);
        line_path.put("ww1_u", u_ww1);
        line_path.put("ww2_aan", aan_ww2);
        line_path.put("ww2_aao", aao_ww2);
        line_path.put("ww3_aap", aap_ww3);
        line_path.put("ww3_nw2", nw2_ww3);

        //line_path.put("", );

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
