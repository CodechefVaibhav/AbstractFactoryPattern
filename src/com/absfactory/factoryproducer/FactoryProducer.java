package com.absfactory.factoryproducer;

import com.absfactory.objectfactory.ColorFactory;
import com.absfactory.objectfactory.ShapeFactory;
import com.absfactory.superparent.AbstractFactory;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }
	}