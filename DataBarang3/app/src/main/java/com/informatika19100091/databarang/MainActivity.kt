package com.informatika19100091.databarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.informatika19100091.databarang.network.koneksi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koneksi.service.getUser().en
    }
}
