package com.example.nicholas.myapplication.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nicholas.myapplication.App;
import com.example.nicholas.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class OthersFragment extends Fragment {

    /*This is how to bind views with butterknife. With this,
    * you don't need to do view.findViewById in fragment anymore*/
    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    View mView;

    public OthersFragment() {
        // Required empty public constructor
    }

    public static OthersFragment newInstance() {
        OthersFragment fragment = new OthersFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_others, container, false);
        /*You must initialize Butterknife in fragment by calling context and view*/
        ButterKnife.bind(this, mView);

        mViewPager.setAdapter(new FragmentsAdapter(getActivity().getSupportFragmentManager(), getActivity().getApplicationContext()));

        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }
        });

        return mView;
    }

    private class FragmentsAdapter extends FragmentPagerAdapter {
        /*You can get Tab Titles using this implementation. However doing this is not recommended for localisation of your app*/
        private String frags[] = {"Tab One", "Tab Two", "Tab 3", "Tab Four"};

        /*The better way to do this getting your titles as arrays*/
        //private String title[] = getActivity().getResources().getStringArray(R.array.tab_titles);

        public FragmentsAdapter(FragmentManager supportFragmentManager, Context context) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragment1();
                case 1:
                    return new fragment2();
                case 2:
                    return new fragment3();
                case 3:
                    return new fragment4();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            /*Depending on which string array you're using, you choose here*/
            return frags.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            /*Same for here too if you want to using stringarrays from resources*/
            return frags[position];
        }
    }
}
