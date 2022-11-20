package kr.ac.dankook.dantumproject.issue

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kr.ac.dankook.dantumproject.R

class IssuesAdapter (val context: Context, val UserList: ArrayList<Issues>) : BaseAdapter()

{
    override fun getCount(): Int {
        return UserList.size
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null)

        val lable = view.findViewById<TextView>(R.id.vt_title)
        val issuetitle = view.findViewById<TextView>(R.id.is_title)
        val issuecontents = view.findViewById<TextView>(R.id.is_contents)
        val issuewriter = view.findViewById<TextView>(R.id.is_writer)


        val user = UserList[position]
        lable.text = user.lable
        issuetitle.text = user.issuetitle
        issuecontents.text = user.issuecontents
        issuewriter.text = user.issuewriter


        return view
    }

}