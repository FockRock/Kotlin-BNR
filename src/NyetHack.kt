fun main() {
    val name = "Nick"
    val healthPoints = 50
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus: String = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball(3)
    drunkBooze(13)

}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val status: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scrathes."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt!"
        else -> "is in awful condition!"
    }
    return status
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    return if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun castFireball(numFireballs: Int = 2) {
    println("A glass of Fireball springs into existence(x$numFireballs).")
}

private fun drunkBooze (bottles: Int) {
    val drunkStatus: String = when (bottles) {
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        else -> "..t0ast3d"
    }
    println (drunkStatus)
}