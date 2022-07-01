package com.voxeldev.summerpractice2022.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.data.models.Snack
import com.voxeldev.summerpractice2022.data.models.SnackRepository

class MainActivity : AppCompatActivity() {

    lateinit var snacks: List<Snack>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val snackRepository = SnackRepository()
        snacks = snackRepository.getSnacks()

        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.main_nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_list,
                R.id.navigation_details
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}