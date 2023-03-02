package com.example.pract12suhih

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.contracts.contract

class AccountViewHolder(item: View):RecyclerView.ViewHolder(item)
{
    var Day :TextView =item.findViewById(R.id.editTextDate)
    var Time : TextView =item.findViewById(R.id.editTextTime)
    var Cate : TextView = item.findViewById(R.id.editTextTextPersonName)
    var sum : TextView =item.findViewById(R.id.editTextNumber)
}
class AccountRVAdapter(context: Context?,val data:MutableList<Accounting>):RecyclerView.Adapter<AccountViewHolder?>()
{
    private val layoutInflater:LayoutInflater=LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder
    {
        val view: View = layoutInflater.inflate(R.layout.activity_main3, parent, false)
        return AccountViewHolder(view)
    }
    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        val item = data[position]
        holder.Cate.text=item.category
        holder.Day.text=item.date
        holder.sum.text=item.Summ
        holder.Time.text=item.time
    }
    override fun getItemCount(): Int=data.size
}
class ShowAccountActivity :AppCompatActivity()
{
    private val accountList:MutableList<Accounting> = mutableListOf()
    private lateinit var rv:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        accountList.addAll(Accounts().getAccounts(getSharedPreferences("pref", MODE_PRIVATE)))
        val adapter=AccountRVAdapter(this,accountList)
        rv=findViewById(R.id.recycleView)
        rv.adapter=adapter
        rv.layoutManager=LinearLayoutManager(this)
    }

}

class MainActivity3 : AppCompatActivity()
    {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    ShowAccountActivity()
    }

}