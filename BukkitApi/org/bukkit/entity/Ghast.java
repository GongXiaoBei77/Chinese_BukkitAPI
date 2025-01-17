package org.bukkit.entity;

/**
 * 代表恶魂.
 */
public interface Ghast extends Flying {

    /**
     * Gets whether the Ghast is charging
     *
     * @return Whether the Ghast is charging
     */
    boolean isCharging();

    /**
     * Sets whether the Ghast is charging
     *
     * @param flag Whether the Ghast is charging
     */
    void setCharging(boolean flag);
}