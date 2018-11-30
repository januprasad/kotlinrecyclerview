package `in`.jenuine.recyclerview

import android.support.v7.util.DiffUtil

class MyDiffCallback(private var newPersons: List<Person>, private var oldPersons: List<Person>) : DiffUtil.Callback() {

    override fun getOldListSize() = oldPersons.size

    override fun getNewListSize() = newPersons.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldPersons[oldItemPosition].id == newPersons[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldPersons[oldItemPosition] == newPersons[newItemPosition]
    }

}
