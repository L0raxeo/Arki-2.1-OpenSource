package com.sampleCompany.arki.gameEngine.entities;

import java.awt.*;

public abstract class Entity
{

    // attributes

    protected String name;
    protected String unlocalizedName;
    protected float x, y;
    protected int width, height;
    protected Rectangle bounds;

    /**
     * Determines whether entity will be destroyed
     */
    protected boolean active = true;

    // class
    public Entity(String name, String unlocalizedName, float x, float y, int width, int height)
    {
        this.name = name;
        this.unlocalizedName = unlocalizedName;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.bounds = new Rectangle(0, 0, width, height);
    }

    /**
     * Updates entity
     */
    public abstract void tick();

    /**
     * Renders entity, along with any changes
     * made or modified in tick() method.
     *
     * @param g is the drawing tool.
     */
    public abstract void render(Graphics g);

    /**
     * Destroys object and queues it to remove from entity manager.
     */
    public void destroy()
    {
        active = false;
        onDestroy();
    }

    /**
     * Is invoked when entity is destroyed.
     */
    public void onDestroy()
    {

    }

    // Getters

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public boolean isActive()
    {
        return active;
    }

    // Setters

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

}