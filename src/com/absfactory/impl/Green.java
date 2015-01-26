package com.absfactory.impl;

import com.absfactory.parent.Color;

public class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
}