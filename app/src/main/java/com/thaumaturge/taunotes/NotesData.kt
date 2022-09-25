package com.thaumaturge.taunotes

import java.util.Random

object NotesData {

    fun getNotes() = listOf(
        Note(Random().toString(),"Конспект лекции 1","asdsadasdasd asdasdasdasd asdsadasdadsad asdasdasdasd"),
        Note(Random().toString(), "Конспект лекции 2", "wqeqweqwewq qweqeqweqwe qweqeqewqeeqw"),
        Note(Random().toString(), "Список покупок", "ячсясячсяч ячссчясся ячссчяс ячсчсясчясч")
    )

    fun getAnotherNotes() = listOf(
        Note(Random().toString(),"Конспект лекции 3","asdsadasdasd asdasdasdasd asdsadasdadsad asdasdasdasd"),
        Note(Random().toString(), "Конспект лекции 4", "wqeqweqwewq qweqeqweqwe qweqeqewqeeqw"),
        Note(Random().toString(), "Список покупок 2", "ячсясячсяч ячссчясся ячссчяс ячсчсясчясч"),
        Note(Random().toString(),"Конспект лекции 3","asdsadasdasd asdasdasdasd asdsadasdadsad asdasdasdasd"),
        Note(Random().toString(), "Конспект лекции 4", "wqeqweqwewq qweqeqweqwe qweqeqewqeeqw"),
        Note(Random().toString(), "Список покупок 2", "ячсясячсяч ячссчясся ячссчяс ячсчсясчясч")
    )

}