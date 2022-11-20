package kr.ac.dankook.dantumproject.vote

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kr.ac.dankook.dantumproject.R

class VotesAdapter (val context: Context, val voteitem: ArrayList<Votes>) : BaseAdapter()

{
    override fun getCount(): Int {
        return voteitem.size
    }

    override fun getItem(position: Int): Any {
        return voteitem[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.voteslayout, null)

        val title = view.findViewById<TextView>(R.id.vt_title)



        val vote = voteitem[position]
        title.text = vote.votetitle


        return view
    }

}