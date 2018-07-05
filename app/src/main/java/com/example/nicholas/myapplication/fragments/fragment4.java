package com.example.nicholas.myapplication.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.nicholas.myapplication.R;
import com.example.nicholas.myapplication.activities.Deadpool2;

import butterknife.BindView;
import butterknife.ButterKnife;


public class fragment4 extends Fragment {

    @BindView(R.id.avengers)
    ImageView avengers;

    View mView;

    public fragment4() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_four, container, false);
        ButterKnife.bind(this, mView);


        avengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Deadpool2.class);
                startActivity(intent);
            }
        });

        /*This can also be shortened using lambda expression as*/
/*
        imgbutton.setOnClickListener(v -> {
            Toast.makeText(App.getAppContext(), "Clicked", Toast.LENGTH_SHORT).show();
        });
        */

        return mView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
