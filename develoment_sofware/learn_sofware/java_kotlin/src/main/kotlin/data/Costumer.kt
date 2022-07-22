package data

open class Customer(val name:String, val type:String, val Balance: Long) {
    constructor(name: String, type: String): this(name, type, 0)
    constructor(name: String) : this(name, "standard")
}

class PremiumCustomer: Customer {
    constructor(name: String): super(name, "Premium")
    constructor(name: String, balance: Long): super(name, "Premium", balance)

}
class ExcecutiveCostumer(name: String, balance: Long) : Customer(name, "Excecutive", balance) {
    constructor(name: String): this(name, 0)

}