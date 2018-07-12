package com.example.soronto.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    val issacItemList=arrayListOf<IssacItem>()

    //recyclerview variable
    private lateinit var recyclerView:RecyclerView
    private lateinit var viewAdapter:RecyclerView.Adapter<*>
    private lateinit var viewManager:RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var issacItemListView = findViewById(R.id.content_container) as ListView

        //메뉴 버튼 온클릭 리스
        var menu_btn=findViewById(R.id.menu_icon_btn) as ImageView
        menu_btn.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

        //아이작 데이터 수기 입력
//        issacItemList.add(IssacItem(0,"asd","qweqtqtttewfw"))
//        issacItemList.add(IssacItem(1,"ddfgd","qweqtqtttewfw"))
//        issacItemList.add(IssacItem(2,"cxvbxdfg","qweqtqtttewfw"))
//        issacItemList.add(IssacItem(3,"dfg","qweqtqtttewfw"))
        add_data_analog()

        //아이작 데이터 JSON FORM READ
//        try {
//            val inputStream:InputStream = assets.open(R.drawable.issac_data.json")
//            val inputString = inputStream.bufferedReader().use{it.readText()}
//
//            var gson:Gson=Gson()
//            var issacItemListJson=gson.fromJson<ArrayList<IssacItem>>(inputString, java.util.ArrayList::class.java)
//
//            for(row in issacItemListJson){
//                Log.wtf("fucking them it",row.name)
//            }
//
////            Log.wtf("JSON FILE READ CHECK", topic.get(0).quote)
//
//            // 리스트 뷰 & 온클릭 리스너
//
////
//        } catch (e:Exception){
//            e.printStackTrace()
//        }

        //리스트뷰
//        val issacAdapter=MyListViewAdapter(this,issacItemList)
//            issacItemListView.adapter=issacAdapter
//
//            issacItemListView.setOnItemClickListener{
//                parent,view,position,id->
//                //            Log.v("123","123")
////
////            var name=issacItemList[position].name
////            Toast.makeText(this@MainActivity,"PositionClicked"+name,Toast.LENGTH_SHORT).show()
//                val name=issacItemList[position].item_id
//
//                val nextIntent=Intent(this,DescViewActivity::class.java)
//                nextIntent.putExtra(EXTRA_MESSAGE,name)
//                startActivity(nextIntent)
//            }

//        //리사이클러뷰
//        var recyclerView=findViewById(R.id.recyclerView)<RecyclerView>
//
//        var issacItemAdapter=IssacItemAdapter(issacItemList)
        viewManager= LinearLayoutManager(this)

        viewAdapter=MyAdapter(issacItemList)

        recyclerView=findViewById<RecyclerView>(R.id.recyclerView).apply{
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }

    }
    fun add_data_analog(){
        issacItemList.add(IssacItem("111","The Bean"," Isaac releases bad gas, poisoning any enemy in close vicinity.",R.drawable.rebirthitemsfinal,"Toot on command"))
    }


}
