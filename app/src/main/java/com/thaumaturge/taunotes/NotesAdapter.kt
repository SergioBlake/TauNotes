package com.thaumaturge.taunotes

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class NotesAdapter(/*private val itemClickListener: OnItemClickListener*/) :RecyclerView.Adapter<NoteViewHolder>() {

    private var notes :List<Note> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView : View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(itemView/*, itemClickListener*/)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    fun refreshNotes(notes:List<Note>) {
        this.notes = notes
        notifyDataSetChanged()
    }

    override fun getItemCount() = notes.size

    interface OnItemClickListener {
        fun onItemClicked(id:String)
    }

    fun removeNote(id: String) {
        val noteToRemove = notes.find{it.id == id}
        // ToDo - здесь сделать удаление из списка (в оригинале он Mutable и работает .remove, здесь - ХЗ)
    }
}