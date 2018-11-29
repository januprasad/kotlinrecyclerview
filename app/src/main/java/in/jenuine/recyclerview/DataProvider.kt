package `in`.jenuine.recyclerview

import java.util.ArrayList

object DataProvider {

    val oldPersonList: ArrayList<Person>
        get() {
            val persons = ArrayList<Person>()
            persons.add(Person(1, 20, "John"))
            persons.add(Person(2, 12, "Jack"))
            persons.add(Person(3, 8, "Michael"))
            persons.add(Person(4, 19, "Rafael"))
            return persons
        }

    fun sortByAge(oldList: ArrayList<Person>): List<Person> {
        return oldList.sortedBy { it.age }
    }

    fun sortByName(oldList: ArrayList<Person>): List<Person> {
        return oldList.sortedBy { it.name }
    }
}