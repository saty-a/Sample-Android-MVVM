package com.example.samplemvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.os.Bundle;

import com.example.samplemvvm.R;
import com.example.samplemvvm.ViewModels.CustomerViewModel;
import com.example.samplemvvm.databinding.ActivityMainBinding;
import com.example.samplemvvm.models.Customer;

public class MainActivity extends AppCompatActivity {
    CustomerViewModel customerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainxml= DataBindingUtil.setContentView(this, R.layout.activity_main);
        customerViewModel= ViewModelProviders.of(this).get(CustomerViewModel.class);

        mainxml.setFname(customerViewModel.getCustomer().getFname());
        mainxml.setLname(customerViewModel.getCustomer().getLname());

        }
}