package com.fti.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PhoneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PhoneFragment extends Fragment {

    Button mDial;
    EditText mPhone;
    public PhoneFragment() {
        // Required empty public constructor
    }


    public void onViewCreated(View view, Bundle savedIntanceState){
        super.onViewCreated(view, savedIntanceState);

        mDial = view.findViewById(R.id.btn_number);
        mPhone = view.findViewById(R.id.phonenumber);

        mDial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String phoneNo = mPhone.getText().toString();
                if(!TextUtils.isEmpty(phoneNo)){
                    String dial = "tel:" + phoneNo;
                    startActivity((new Intent(Intent.ACTION_DIAL, Uri.parse(dial))));
                }
                else {
                    Toast.makeText(getContext(), "Enter phone number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false);
    }
}