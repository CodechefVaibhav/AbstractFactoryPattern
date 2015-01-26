package com.absfactory.impl;

import com.absfactory.parent.Shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}