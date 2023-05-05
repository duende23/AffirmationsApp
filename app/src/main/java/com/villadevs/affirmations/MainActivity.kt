package com.villadevs.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.villadevs.affirmations.adapter.ItemAdapter
import com.villadevs.affirmations.data.Datasource
import com.villadevs.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        binding.rvRecyclerView.adapter = ItemAdapter(this, myDataset)
        binding.rvRecyclerView.setHasFixedSize(true)


    }
}