package com.onurdemir.odnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {



    //private lateinit var navigationController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //navigationController = Navigation.findNavController(this, R.id.fragmentContainerView)
        //NavigationUI.setupActionBarWithNavController(this,navigationController)
    }

    //override fun onSupportNavigateUp(): Boolean {
        //return NavigationUI.navigateUp(navigationController,null)
    //}




    }


