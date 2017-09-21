package com.example.administrator.fragmenttest3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements WordsFragment.OnWordSelectedListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }


            WordsFragment firstFragment = new WordsFragment();
            firstFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container , firstFragment).commit();
        }



    }

    @Override
    public void onWordSelected(int position) {
        DefinitionFragment defFrag = (DefinitionFragment) getSupportFragmentManager()
                .findFragmentById(R.id.definition_fragment);


        if (defFrag != null) {//이미 생성되어 있으면 메소드를 직접 호출한다.
            defFrag.updateDefinitionView(position);
        } else {
            DefinitionFragment newFragment = new DefinitionFragment();
            Bundle args = new Bundle();
            args.putInt(DefinitionFragment.ARG_POSITION, position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    }
}
