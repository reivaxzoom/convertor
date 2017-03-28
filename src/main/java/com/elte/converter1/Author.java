package com.elte.converter1;

//import hu.elte.txtuml.api.model.ModelClass;

public class Author extends ModelClass {
//public class Author {
  String id;
  
  String name;
  
  public Author(final String name, final int id) {
    this.id = ("author" + Integer.valueOf(id));
    this.name = name;
  }
  
  public String getID() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setID(final String id) {
    this.id = id;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
}