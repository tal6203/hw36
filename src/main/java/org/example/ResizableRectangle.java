package org.example;

public class ResizableRectangle extends Rectangle implements Resizable{
    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public void resize(int percent){
        super.length = ((percent / 100) * super.length) + super.length;
        super.width = ((percent / 100) * super.width) + super.width;
    }
}
