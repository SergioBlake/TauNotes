package com.thaumaturge.taunotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel :ViewModel() {
    var notesList: MutableLiveData<List<Note>> = MutableLiveData()

    init {
        notesList.value = NotesData.getNotes()
    }

    fun getListNotes() = notesList

    fun updateListNotes() {
        notesList.value = NotesData.getAnotherNotes()
    }
}