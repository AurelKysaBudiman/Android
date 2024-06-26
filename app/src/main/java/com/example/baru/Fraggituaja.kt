package com.example.baru

import android.icu.text.IDNA.Info
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.baru.databinding.ActivityFraggituajaBinding

class Fraggituaja : AppCompatActivity() {

    private lateinit var binding: ActivityFraggituajaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFraggituajaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragmentManager = supportFragmentManager
        var fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.framelayout, HomeFragment())
        fragmentTransition.commit()

        binding.btnNav.setOnItemSelectedListener{
            when(it.itemId) {
                R.id.btnHome -> replaceFragment(HomeFragment())
                R.id.btnInfo -> replaceFragment(InfoFragment())
                R.id.btnProfile -> replaceFragment(ProfileFragment())
            }
            true
            }
        }
    private fun replaceFragment(fragment_to : Fragment) {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        var fragment_from = supportFragmentManager.
                findFragmentById(R.id.framelayout)

        if (fragment_from is HomeFragment && fragment_to is InfoFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromleft, R.anim.toright)

        if (fragment_from is InfoFragment && fragment_to is ProfileFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromleft, R.anim.toright)

        if (fragment_from is ProfileFragment && fragment_to is InfoFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromright, R.anim.toleft)

        if (fragment_from is InfoFragment && fragment_to is HomeFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromright, R.anim.toleft)

        if (fragment_from is HomeFragment && fragment_to is ProfileFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromleft, R.anim.toright)

        if (fragment_from is ProfileFragment && fragment_to is HomeFragment)
            fragmentTransaction.setCustomAnimations(R.anim.fromright, R.anim.toleft)

        fragmentTransaction.replace(R.id.framelayout, fragment_to)
        fragmentTransaction.commit()
    }
}
