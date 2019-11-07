object Clock {
    val milliseconds: Long
        get() = System.currentTimeMillis()

    val nanoseconds: Long
        get() = System.nanoTime()

    val seconds: Double
        get() = milliseconds / 1000.0
}