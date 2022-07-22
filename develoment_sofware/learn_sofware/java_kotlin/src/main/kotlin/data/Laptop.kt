package data

class Laptop (val name: String)

open class Hanphone (val name: String)

class Smartphone(name: String, val os: String): Hanphone(name)