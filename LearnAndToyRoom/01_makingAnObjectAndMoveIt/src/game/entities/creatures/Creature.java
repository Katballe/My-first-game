package game.entities.creatures;

import game.entities.Entity;

public abstract class Creature extends Entity {

    public static final int defaultHealth = 10;
    public static final float defaultSpeed = 3.0f;
    public static final int defaultCreatureWidth = 80, 
                              defaultCreatureHeight = 80;

    protected int health;
    protected float speed;
    protected float xMove, yMove; 

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = defaultHealth;
        speed = defaultSpeed;
        xMove = 0; yMove = 0;
    }

    public void move(){
        x += xMove;
        y += yMove;
    }

    // getters and setters
    public int getHealth(){
        return health;
    }
    public float getSpeed(){
        return speed;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setSpeed(float speed){
        this.speed = speed;
    }

    public float getXMove(){
        return xMove;
    }
    public float getYMove(){
        return yMove;
    }
    public void setXMove(float xMove){
        this.xMove = xMove;
    }
    public void setYMove(float yMove){
        this.yMove = yMove;
    }
    
}