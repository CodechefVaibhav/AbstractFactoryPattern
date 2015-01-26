package com.absfactory.objectfactory;

import com.absfactory.impl.Blue;
import com.absfactory.impl.Green;
import com.absfactory.impl.Red;
import com.absfactory.parent.Color;
import com.absfactory.parent.Shape;
import com.absfactory.superparent.AbstractFactory;

public class ColorFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	   }
	}