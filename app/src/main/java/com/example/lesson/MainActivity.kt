package com.example.lesson

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = arrayListOf<ItemModel>()
        email.add(ItemModel("user1", "Edurila.com\n$19 Only (First 10 spots) - Bestselling...\n" +
                "Are you looking to Learn Web Designin...", "12:34 PM", R.drawable.user1))
        email.add(ItemModel("user2", "Chris Abad\nHelp make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM", R.drawable.user2))
        email.add(ItemModel("user3", "Tuto.com\n8H de formation gratuite et les nquvea...\n" +
                "Photoshop, SEQ, Blender, CSS, WordPre...", "11:04 AM", R.drawable.user3))
        email.add(ItemModel("user4", "support\nSociété Ovh: suivi de vó services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM", R.drawable.user4))
        email.add(ItemModel("user5", "Matt from Ionic\nThe New Ionic Creator Is Here!\n" +
                "Annoucing the all-new Creator, building...", "7:58 PM", R.drawable.user5))
        email.add(ItemModel("user1", "Edurila.com\n$19 Only (First 10 spots) - Bestselling...\n" +
                "Are you looking to Learn Web Designin...", "12:34 PM", R.drawable.user1))
        email.add(ItemModel("user2", "Chris Abad\nHelp make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM", R.drawable.user2))
        email.add(ItemModel("user3", "Tuto.com\n8H de formation gratuite et les nquvea...\n" +
                "Photoshop, SEQ, Blender, CSS, WordPre...", "11:04 AM", R.drawable.user3))
        email.add(ItemModel("user4", "support\nSociété Ovh: suivi de vó services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM", R.drawable.user4))
        email.add(ItemModel("user5", "Matt from Ionic\nThe New Ionic Creator Is Here!\n" +
                "Annoucing the all-new Creator, building...", "7:58 PM", R.drawable.user5))
        email.add(ItemModel("user1", "Edurila.com\n$19 Only (First 10 spots) - Bestselling...\n" +
                "Are you looking to Learn Web Designin...", "12:34 PM", R.drawable.user1))
        email.add(ItemModel("user2", "Chris Abad\nHelp make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM", R.drawable.user2))
        email.add(ItemModel("user3", "Tuto.com\n8H de formation gratuite et les nquvea...\n" +
                "Photoshop, SEQ, Blender, CSS, WordPre...", "11:04 AM", R.drawable.user3))
        email.add(ItemModel("user4", "support\nSociété Ovh: suivi de vó services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM", R.drawable.user4))
        email.add(ItemModel("user5", "Matt from Ionic\nThe New Ionic Creator Is Here!\n" +
                "Annoucing the all-new Creator, building...", "7:58 PM", R.drawable.user5))
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = MyCustomAdapter(email)
    }
}