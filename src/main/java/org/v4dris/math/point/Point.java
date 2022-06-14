package org.v4dris.math.point;

public class Point {
    protected double[] coordinates;
    private String name;

    protected Point(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        String result = name + "(";
        int i;
        for(i = 0; i + 1 < coordinates.length; i++){
            result += String.valueOf(coordinates[i]);
            result += "|";
        }
        result += String.valueOf(coordinates[i]);
        result += ")";
        return result;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}