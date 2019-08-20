package com.ramazankaragoz.instakotlinapp.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.ramazankaragoz.instakotlinapp.R
import com.ramazankaragoz.instakotlinapp.home.HomeActivity
import com.ramazankaragoz.instakotlinapp.news.NewsActivity
import com.ramazankaragoz.instakotlinapp.profile.ProfileActivity
import com.ramazankaragoz.instakotlinapp.search.SearchActivity
import com.ramazankaragoz.instakotlinapp.share.ShareActivity

class BottomNavigationViewHelper {

    //Javadaki gibi static method
    companion object{

        fun setupBottomNavigationView(buttonNavigationViewEx: BottomNavigationViewEx){
            buttonNavigationViewEx.enableAnimation(false)
            buttonNavigationViewEx.enableShiftingMode(false)
            buttonNavigationViewEx.enableItemShiftingMode(false)
            buttonNavigationViewEx.setTextVisibility(false)
        }


        fun setupNavigation(context:Context,buttonNavigationViewEx: BottomNavigationViewEx){

            //object:BottomNavigationView ile inner sınıf oluşturuyoruz.
            buttonNavigationViewEx.onNavigationItemSelectedListener=object :BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {

                    //when javadaki switch case yapısının aynısı
                    when(item.itemId){

                        R.id.icMenuHome->{
                            //Activity başlatmak için intent oluşturuyoruz.
                            //Burada context göndermemizin sebebi bu sınıfın activity sınıfında olmaması
                            //.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION) activity oontrol methodu geçiş animasyonunu kaldırmak için
                            val intent=Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                        R.id.icMenuNews->{
                            val intent=Intent(context,NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                        R.id.icMenuProfile->{
                            val intent=Intent(context,ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                        R.id.icMenuSearch->{
                            val intent=Intent(context,SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                        R.id.icMenuShare->{
                            val intent=Intent(context,ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }

                    }

                    return false

                }

            }

        }
    }
}