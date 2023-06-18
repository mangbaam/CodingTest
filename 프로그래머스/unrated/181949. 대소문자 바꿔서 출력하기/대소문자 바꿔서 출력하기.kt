fun main(args: Array<String>) {
    readln().forEach { c ->
        when {
            c.isUpperCase() -> print(c.lowercase())
            c.isLowerCase() -> print(c.uppercase())
        }
    }
}