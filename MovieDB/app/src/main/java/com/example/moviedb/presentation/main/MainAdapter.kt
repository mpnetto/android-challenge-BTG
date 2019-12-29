package com.example.moviedb.presentation.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.moviedb.presentation.movies.Favoritesragment
import com.example.moviedb.presentation.movies.MoviesFragment

class MainAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MoviesFragment()

            else -> Favoritesragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Filmes"
            else -> "Favoritos"
        }
    }
}