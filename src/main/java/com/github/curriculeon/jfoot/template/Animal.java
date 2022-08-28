package com.github.curriculeon.jfoot.template;

import com.github.git_leon.RandomUtils;
import greenfoot.Actor;

/**
 * @author leonhunter
 * @created 08/28/2022 - 7:20 AM
 */
public class Animal extends Actor {
    public Animal() {
        setImage(new StringBuilder()
                .append(System.getProperty("user.dir"))
                .append("/src/main/resources/images/bee.png")
                .toString());
    }

    public void act() {
        move(RandomUtils.createInteger(1, 3));
        final boolean isAtEdge = isAtEdge();
        final boolean shouldDieSpontaneously = RandomUtils.createBoolean(1);
        final boolean shouldDie = isAtEdge || shouldDieSpontaneously;
        final boolean shouldTurn = RandomUtils.createBoolean(10);
        final int amountToTurn = RandomUtils.createInteger(0, 90);

        if (shouldTurn) {
            turn(amountToTurn);
        }
        if (shouldDie) {
            getWorld().removeObject(this);
        }
    }
}
