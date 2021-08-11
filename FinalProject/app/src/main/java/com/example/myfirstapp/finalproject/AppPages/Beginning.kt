package com.example.myfirstapp.finalproject.AppPages

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.activity_beginning.*
import kotlinx.android.synthetic.main.tool_bar.*
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.myfirstapp.finalproject.SignInUp.logIn
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.header_nav.*


class Beginning : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginning)
        //   setSupportActionBar(toolbar)
        supportActionBar!!.hide();
        //nameOfOwner.setText(logIn.usernameProfile)
        var toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, 0, 0)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        AddIt(Items())
        navigation_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        when (id) {
            R.id.profile -> replaceIt(Account())
            R.id.products -> replaceIt(Items())
            R.id.addItem -> replaceIt(AddItem())
            R.id.help -> replaceIt(help())
            R.id.logout -> replaceIt(logIn())
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    fun AddIt(f: Fragment) {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.navigation, f)
        fragmentTransaction.commit()

    }

    fun replaceIt(f: Fragment) {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navigation, f)
        fragmentTransaction.commit()
    }
}