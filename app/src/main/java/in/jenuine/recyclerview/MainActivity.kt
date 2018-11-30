package `in`.jenuine.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu
import android.view.MenuItem
import wallet.coinome.hatio.`in`.recyclerviewsample.R


class MainActivity : AppCompatActivity() {
     val personList = PersonRepo.oldPersonList;
     val personListAdapter = PersonListAdapter(personList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this

        with(personsListView) {
            layoutManager = LinearLayoutManager(context)
            adapter = personListAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return when (id) {
            R.id.sort1 -> {
                personListAdapter.updateList(PersonRepo.sortByAge(oldList = personList))
                true
            }
            R.id.sort2 -> {
                personListAdapter.updateList(PersonRepo.sortByName(oldList = personList))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
