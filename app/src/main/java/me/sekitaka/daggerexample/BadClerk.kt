package me.sekitaka.daggerexample

class BadClerk : Clerk {
    override fun greeting(): String {
        return "YO!"
    }
}