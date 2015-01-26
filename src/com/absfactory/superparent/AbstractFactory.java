package com.absfactory.superparent;

import com.absfactory.parent.Color;
import com.absfactory.parent.Shape;

public abstract class AbstractFactory {
	   public abstract Color getColor(String color);
	   public abstract Shape getShape(String shape) ;
}
