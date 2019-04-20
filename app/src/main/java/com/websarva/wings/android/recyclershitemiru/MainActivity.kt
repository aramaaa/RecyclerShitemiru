package com.websarva.wings.android.recyclershitemiru


import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nakami = listOf("taro","jiro","saburo","shiro","goro","rokuro","jimmy","mary","david","judy")

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=RecyclerAdapter(this, nakami)
    }
}

class RecyclerAdapter(context: Context,val nakami:List<String>):RecyclerView.Adapter<ViewHolder>(){
    val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.list_item,p0,false))
    }

    override fun getItemCount(): Int {
        return nakami.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.textView.text =nakami[p1]
    }
}

class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val textView: TextView = itemView.findViewById(R.id.textView)
}
