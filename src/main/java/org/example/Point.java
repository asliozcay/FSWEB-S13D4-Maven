package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        int xA = this.x;
        int yA = this.y;
        int xB = 0;
        int yB = 0;
        double distanceSquared = Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2);
        return Math.sqrt(distanceSquared);
    }
    public double distance(Point p){
        int xA = this.x;
        int yA = this.y;
        int xB = p.getX();
        int yB = p.getY();
        double distanceSquared = Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2);
        return Math.sqrt(distanceSquared);
    }
    public double distance(int a, int b){
        int xA = this.x;
        int yA = this.y;
        int xB = a;
        int yB = b;
        double distanceSquared = Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2);
        return Math.sqrt(distanceSquared);
    }

}
