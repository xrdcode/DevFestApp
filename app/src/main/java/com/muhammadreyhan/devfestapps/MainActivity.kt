package com.muhammadreyhan.devfestapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.muhammadreyhan.devfestapps.models.DevFest
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    lateinit var data: DevFest;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        saveBtn.setOnClickListener({
            data = DevFest(name.text.toString(), gender.text.toString(), address.text.toString() );

            if (data != null) {
                result(data.name, data.gender, data.address)
            };
        })
    }

    fun result(name : String, gender: String, address : String) {
//        tvName.setText(data!!.name);
//        tvGender.setText(data!!.gender);
//        tvAddress.setText(data!!.address);
        tvName.setText(name);
        tvGender.setText(gender);
        tvAddress.setText(address);
    }
}
