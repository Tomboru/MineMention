package io.github.noeppi_noeppi.mods.minemention;

import net.minecraft.util.text.Color;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;

public enum MentionType {

    PLAYER(Style.EMPTY.setColor(Color.fromInt(0x00AEFF))),
    GROUP(Style.EMPTY.setFormatting(TextFormatting.LIGHT_PURPLE)),
    INVALID(Style.EMPTY.setFormatting(TextFormatting.RED));
    
    private final Style style;

    MentionType(Style style) {
        this.style = style;
    }

    public Style getStyle() {
        return this.style;
    }
}
