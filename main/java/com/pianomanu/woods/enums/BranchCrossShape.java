package com.pianomanu.woods.enums;

import net.minecraft.util.IStringSerializable;

public enum BranchCrossShape implements IStringSerializable {
    TOP("top"),
    MID("mid"),
    BOTTOM("bottom");

    private final String name;

    BranchCrossShape(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
}
