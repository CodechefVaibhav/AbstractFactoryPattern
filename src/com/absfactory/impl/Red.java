package com.absfactory.impl;

import com.absfactory.parent.Color;

public class Red implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
}	