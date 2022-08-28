package com.github.curriculeon.jfoot.template;

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
        addObject(new Greep(), getWidth() / 2, getHeight() / 2);
        addObject(new Greep(), getWidth() / 2, getHeight() / 2);
    }
}