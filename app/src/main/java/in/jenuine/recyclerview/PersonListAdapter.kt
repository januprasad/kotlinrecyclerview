package `in`.jenuine.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_view_person.view.*
import `in`.jenuine.recyclerview.PersonListAdapter.VH
import android.support.v7.util.DiffUtil
import wallet.coinome.hatio.`in`.recyclerviewsample.R


class PersonListAdapter(private val personList: ArrayList<Person>) : RecyclerView.Adapter<VH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(parent.inflate(R.layout.item_view_person))
    }

    override fun getItemCount() = personList.size


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindViews(personList[position])
    }


    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(person: Person) {
            name.text = person.name
            age.text = person.age.toString()
        }

        val name = itemView.name
        val age = itemView.age
    }

    fun updateList(newList: List<Person>) {
        val diffResult = DiffUtil.calculateDiff(MyDiffCallback(personList, newList))
        diffResult.dispatchUpdatesTo(this)
    }

}