package data.Appp

import data.BigNote
import data.Note

fun main() {
    val Note = Note("Belajar Note")
    println(Note.title)

    Note.title = ""
    println(Note.title)

    val bigNote = BigNote("Belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigtitle)
}