package com.thaumaturge.taunotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() /*, NotesAdapter.OnItemClickListener*/ {

    private val notesViewModel by lazy {
        ViewModelProviders.of(this).get(NotesViewModel::class.java)
    }
    private var alertDialog :AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Init adapter
        var adapter = NotesAdapter()
        notesListRecyclerView.layoutManager = LinearLayoutManager(this)
        notesListRecyclerView.adapter = adapter

        // Listener for update
        notesViewModel.getListNotes()
            .observe(this, Observer { it?.let { adapter.refreshNotes(it) } })

    }

    // Creating menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Process menu Refresh click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.refresh -> {
                notesViewModel.updateListNotes()
            }
        }
        return super.onOptionsItemSelected(item)
    }
/*
    override fun onItemClicked(id: String) {
        this.alertDialog = AlertDialog.Builder(this)
            .setTitle("Info dialog")
            .setMessage("Here will be the text")
            .setPositiveButton("Yes") { dialog, which -> }
            .setNegativeButton("No") { dialog, which -> dialog.dismiss()}
            .show()
    }
*/
    fun ToastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, world!", Toast.LENGTH_SHORT)
        myToast.show()
    }
}