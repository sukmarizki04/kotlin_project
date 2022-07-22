package data.Appp

import data.Action


fun fireaction(action: Action) {
    action.action()
}
class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }
}
fun main() {
    fireaction(SampleAction())
    fireaction(object : Action {
        override fun action() = println("Action one")
        
    })
    fireaction(object : Action {
        override fun action() = println("Action two ")

    })
}