package com.absfactory.impl;

import com.absfactory.parent.Color;

public class Blue implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Blue::fill() method.");
	   }
}