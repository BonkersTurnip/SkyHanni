package at.hannibal2.skyhanni.features.gui.customscoreboard.elements

import at.hannibal2.skyhanni.features.gui.customscoreboard.CustomScoreboard.informationFilteringConfig
import at.hannibal2.skyhanni.features.gui.customscoreboard.CustomScoreboardUtils.getGodPotion

object ScoreboardElementGodPotion : ScoreboardElement() {
    override fun getDisplay() = buildString {
        append("§cGod Potion§f: ")
        append(getGodPotion())
    }

    override fun showWhen(): Boolean {
        val godPot: String = getGodPotion()
        // showWhen it is not the case that the line is empty and the user is hiding empty lines
        return !((godPot == "§cNot Active!" || godPot == "§8Loading") && informationFilteringConfig.hideEmptyLines)
    }

    override val configLine = "§cGod Potion§f: 14 Hours"
}
