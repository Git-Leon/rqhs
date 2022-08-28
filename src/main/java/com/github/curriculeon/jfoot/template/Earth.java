package com.github.curriculeon.jfoot.template;

import com.github.git_leon.RandomUtils;
import com.github.git_leon.jfoot.system.resources.JFootImage;
import com.github.git_leon.jfoot.world.AbstractJFootWorld;


/**
 * Sample World class
 */
public class Earth extends AbstractJFootWorld {
    public Earth() {
        super(800, 600, 1);
        setBackground(new JFootImage(new StringBuilder()
                .append(System.getProperty("user.dir"))
                .append("/src/main/resources/images/sky.png")
                .toString()));
    }

    @Override
    protected void init() {

    }

    @Override
    public void act() {
        if(RandomUtils.createBoolean(10)) {
            addObject(new Animal(), RandomUtils.createInteger(0, getWidth()), RandomUtils.createInteger(0, getHeight()));
        }
    }
}