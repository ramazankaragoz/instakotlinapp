package com.ramazankaragoz.instakotlinapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramazankaragoz.instakotlinapp.R
import com.ramazankaragoz.instakotlinapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO=0
    private val TAG="HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigationView()
    }

    fun setupBottomNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        //Bu sınıf activity sınıfı olduğu için this diyerek context gönderebiliriz
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        //Menudeki butonun seçili gelmesi için
        var menu=bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }
}
