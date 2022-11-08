package com.example.samplemvvm.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.samplemvvm.models.Customer;

public class CustomerViewModel extends AndroidViewModel {
    Customer customer;
    public CustomerViewModel(@NonNull Application application) {
        super(application);
        customer=new Customer("Suraj","Kumar");
    }

    public Customer getCustomer(){
        return this.customer;
    }
}
