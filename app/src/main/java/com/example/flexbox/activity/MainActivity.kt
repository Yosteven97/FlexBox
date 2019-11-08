package com.example.flexbox.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flexbox.R
import com.example.flexbox.adapter.FlexBoxAdapter
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Set layoutManager
         */
        val layoutManager = FlexboxLayoutManager(this)
        layoutManager.flexDirection = FlexDirection.ROW
        layoutManager.justifyContent =
            JustifyContent.FLEX_START //change to FLEX_CENTER if Wanna in center
        recyclerView.layoutManager = layoutManager


        /**
         * Make ArrayList For be adding @adapter later
         */
        var flexBoxContent = ArrayList<String>()
        flexBoxContent.add("Google")
        flexBoxContent.add("Amazon")
        flexBoxContent.add("Microsoft")
        flexBoxContent.add("TikTok")
        flexBoxContent.add("Nikon")
        flexBoxContent.add("Kodak")

        /**
         * Adding arrayList flexBoxContent in FlexBoxAdapter
         */
        val flexBoxAdapter = FlexBoxAdapter(flexBoxContent)
        recyclerView.adapter = flexBoxAdapter

    }


}
