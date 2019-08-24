package com.nitconclave.internitcommunication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.nitconclave.internitcommunication.Helpers.AppConstants;
import com.nitconclave.internitcommunication.Models.User;
import com.nitconclave.internitcommunication.R;

import java.util.ArrayList;
import java.util.List;

public class DiscoverFragment extends Fragment {


    private AppConstants mAppConstants;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mDatabaseReference;
    private User mUserDetails;
    private ValueEventListener mValueEventListener;

    public DiscoverFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
//        mAppConstants = new AppConstants(getContext());
//        mDatabase = FirebaseDatabase.getInstance();
//        mDatabaseReference = mDatabase.getReference("users");
//        mUserDetails = mAppConstants.getmUser();
//
//        mDatabaseReference.child(mAppConstants.getCollege()).child(mAppConstants.getmSecret()).addValueEventListener(mValueEventListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                Log.e("Hey", mAppConstants.getmSecret());
//                mUserDetails = dataSnapshot.getValue(User.class);
//                mAppConstants.setmUser(mUserDetails);
//                List<String> arrayList = mUserDetails.getmRecommendations();
//                Log.e("frag", arrayList.size() + "");
//                for (int j = 0; j < arrayList.size(); j++)
//                    Log.e("Frag", arrayList.get(j) + "\n");
//                mDatabaseReference.child(mAppConstants.getCollege()).child(mAppConstants.getmSecret()).removeEventListener(mValueEventListener);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
        return view;
    }
}
