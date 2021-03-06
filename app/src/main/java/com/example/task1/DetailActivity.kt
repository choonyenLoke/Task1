package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.task1.Item as Item

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val actionbar = supportActionBar
        actionbar?.title = "Item Detail"
        actionbar?.setDisplayHomeAsUpEnabled(true)

        intent?.let {

            val item = it.getParcelableExtra<Item>(MainActivity.ITEM)
            if(item != null){
                val itemTitle = item.mTitle
                val itemSubTitle = item.mSub
                val itemDesc = item.mDesc
                val imageRes = item.mImageRes

                val detailTitle = findViewById<TextView>(R.id.imageTitle)
                detailTitle.text = itemTitle
                val detailSub = findViewById<TextView>(R.id.imageSubTitle)
                detailSub.text = itemSubTitle
                val detailDesc = findViewById<TextView>(R.id.imageDescription)
                detailDesc.text = itemDesc
                val imageItem = findViewById<ImageView>(R.id.imageDetail)
                imageItem.setImageResource(imageRes)
            }


        }

        fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }
}
