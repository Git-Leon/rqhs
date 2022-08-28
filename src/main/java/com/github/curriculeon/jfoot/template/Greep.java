package com.github.curriculeon.jfoot.template;

import com.github.git_leon.RandomUtils;
import com.github.git_leon.jfoot.system.resources.JFootImage;
import greenfoot.Actor;

/**
 * Sample Actor class
 */
public class Greep extends Actor {
    public Greep() {
        setImage(new JFootImage(new StringBuilder()
                .append(System.getProperty("user.dir"))
                .append("/src/main/resources/images/greeps/greep.png")
                .toString()));
    }

    public void act() {
        move(5);
        if (isAtEdge()) {
            turn(30);
        }

        if (RandomUtils.createBoolean(10)) {
            turn(RandomUtils.createInteger(-90, 90));
        }
    }
}