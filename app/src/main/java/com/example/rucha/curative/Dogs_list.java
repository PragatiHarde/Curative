package com.example.rucha.curative;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Dogs_list extends Activity {

    GridView gridview;

    public static String[] dogsNameList = {

            "Affenpinscher", "Airedale Terrier", "Alaskan Malamute", "Afghan Shephard/Kuchi", "Akbash", "Bakharwal",  "Beagle",
            "Chippiparai","Combai(Kombai)", "Cavalier King Charles Spaniel", "Cocker Spaniel", "Chow Chow", "Dobermann",
            "Dachshund", "English Mastiff", "Gaddi Kutta", "German Shepherd", "Golden Retriever", "Greyhound", "Great Dane",
            "Indian Pariah", "Indian Spitz", "Kanni", "Kumaon Mastiff", "Kuchi Dog", "Labrador Retriever", "Mudhol Hound/Caravan Hound",
            "Miniature Shar Pei", "Pumi Dog", "Pungsan", "Pug", "Rajapalayam Dog", "Rottweiler", "Saarloos Wolfdog", "Sabueo Espanol", "Sakhalin Husky",
            "Samoyed Dog", "Sapsali", "Sarplaninac", "Schipperke", "Scotch Collie", "Scottish Deerhound", "Standard Schnauzer", "Shar Pei","Spaniel",
            "Saluki", "Schapendoes" , "Scottish Terrier", "Tibetan Mastiff"
    };
    public static int[] dogsImages = {
            R.drawable.affenpinscher,
            R.drawable.airedale_terrier,
            R.drawable.alaskanmalamute0b,
            R.drawable.afghan_shephard,
            R.drawable.akbash,
            R.drawable.bakharwal_dog,
            R.drawable.beagle,
            R.drawable.chippiparai,
            R.drawable.combai_kombai,
            R.drawable.cavalier_king_charles_spaniel,
            R.drawable.cocker_spaniel,
            R.drawable.chowchow,
            R.drawable.dobermann,
            R.drawable.dachshund,
            R.drawable.english_mastiff,
            R.drawable.gaddi_kutta,
            R.drawable.german_shepherd,
            R.drawable.golden_retriever,
            R.drawable.greyhound_dog,
            R.drawable.great_dane,
            R.drawable.indian_pariah_dog,
            R.drawable.indian_spitz,
            R.drawable.kanni,
            R.drawable.kumaon_mastiff,
            R.drawable.kuchi_dog,
            R.drawable.labrador_retriever,
            R.drawable.mudhol_hound_caravan_hound,
            R.drawable.miniature_shar_pei,
            R.drawable.pumi_dog,
            R.drawable.pungsan,
            R.drawable.pugs,
            R.drawable.rajapalayam_dog,
            R.drawable.rottweiler,
            R.drawable.saarloos_wolfdog,
            R.drawable.sabueso_espa_ol1,
            R.drawable.sakhalin_husky,
            R.drawable.samoyed_dog,
            R.drawable.sapsali1,
            R.drawable.sarplaninac1,
            R.drawable.schipperke,
            R.drawable.scotch_collie,
            R.drawable.scottish_deerhound,
            R.drawable.standard_schnauzer,
            R.drawable.shar_pei,
            R.drawable.spaniel,
            R.drawable.saluki,
            R.drawable.schapendoes,
            R.drawable.scottish_terrier,
            R.drawable.tibetan_mastiff
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_list);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, dogsNameList, dogsImages));
    }
}