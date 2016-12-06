package lesson17;

public class Book {
String name;
int pages;
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}


@Override
public String toString(){
	
	return " Name book:"+name;
 
}
}