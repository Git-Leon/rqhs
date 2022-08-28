package com.github.curriculeon.jfoot.template;

import com.github.git_leon.RandomUtils;
import com.github.git_leon.jfoot.system.resources.JFootImage;
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
        if (RandomUtils.createBoolean(10)) {
            turn(RandomUtils.createInteger(0, 90));
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
