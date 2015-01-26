package com.absfactory.objectfactory;

import com.absfactory.impl.Circle;
import com.absfactory.impl.Rectangle;
import com.absfactory.impl.Square;
import com.absfactory.parent.Color;
import com.absfactory.parent.Shape;
import com.absfactory.superparent.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
	
	   public Shape getShape(String shapeType){
	   
	      if(shapeType == null){
	         return null;
	      }		
	      
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	      return null;
	   }
	}