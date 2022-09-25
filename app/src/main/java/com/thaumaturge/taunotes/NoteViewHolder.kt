package com.thaumaturge.taunotes

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_note.view.*


class NoteViewHolder(itemView:View /*, private val itemClickListener: NotesAdapter.OnItemClickListener*/) :RecyclerView.ViewHolder(itemView) {

    fun bind(note: Note) {
        with (itemView) {
            note.run {
                headerTextView.text = header
                contentTextView.text = content

                /*
                holder.setOnClickListener {
                    itemClickListener.onItemClicked(id = id)
                }
                 */
            }
        }
    }




}