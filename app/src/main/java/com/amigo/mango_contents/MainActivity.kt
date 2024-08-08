package com.amigo.mango_contents

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=540&h=436&c=Y",
                "밍글스",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320351",
                "https://img.siksinhot.com/place/1554870952814204.jpg?w=540&h=436&c=Y",
                "삼성원조양곱창",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320334",
                "https://img.siksinhot.com/place/1530594902236001.jpg?w=540&h=436&c=Y",
                "뜨락",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/find/1459329005595123.jpg?w=540&h=436&c=X",
                "권숙수",
            )
        )


        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=540&h=436&c=Y",
                "밍글스",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320351",
                "https://img.siksinhot.com/place/1554870952814204.jpg?w=540&h=436&c=Y",
                "삼성원조양곱창",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320334",
                "https://img.siksinhot.com/place/1530594902236001.jpg?w=540&h=436&c=Y",
                "뜨락",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/find/1459329005595123.jpg?w=540&h=436&c=X",
                "권숙수",
            )
        )



        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=540&h=436&c=Y",
                "밍글스",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320351",
                "https://img.siksinhot.com/place/1554870952814204.jpg?w=540&h=436&c=Y",
                "삼성원조양곱창",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320334",
                "https://img.siksinhot.com/place/1530594902236001.jpg?w=540&h=436&c=Y",
                "뜨락",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/find/1459329005595123.jpg?w=540&h=436&c=X",
                "권숙수",
            )
        )




        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=540&h=436&c=Y",
                "밍글스",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320351",
                "https://img.siksinhot.com/place/1554870952814204.jpg?w=540&h=436&c=Y",
                "삼성원조양곱창",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/320334",
                "https://img.siksinhot.com/place/1530594902236001.jpg?w=540&h=436&c=Y",
                "뜨락",
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/363138",
                "https://img.siksinhot.com/find/1459329005595123.jpg?w=540&h=436&c=X",
                "권숙수",
            )
        )




        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter
        //recyclerview.layoutManager = LinearLayoutManager(this)

        rvAdapter.itemClick = object: RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int){

                var intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].imageUrl)
                startActivity(intent)

            }
        }

        recyclerview.layoutManager = GridLayoutManager(this, 2)



    }
}