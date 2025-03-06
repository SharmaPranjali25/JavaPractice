package com.today;

import java.util.Objects;

public class Tasktoday {
private int id;
private String category;
private int price;

Tasktoday(){
	
}

public Tasktoday(int id, String category, int price) {
	super();
	this.id = id;
	this.category = category;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	if(category == null)
	{
		throw new IllegalArgumentException("category can't be blank");
		
	}
	else
	{
		if(category.length() < 3)
		{
			throw new IllegalArgumentException("category name is too short");
		}
		else if(category.length() > 30)
		{
			throw new IllegalArgumentException(" category name is too long");
		}
	}

	this.category = category;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Tasktoday [id=" + id + ", category=" + category + ", price=" + price + "]";
}

@Override
public int hashCode() {
	return Objects.hash(category, id, price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Tasktoday other = (Tasktoday) obj;
	return Objects.equals(category, other.category) && id == other.id && price == other.price;
}


}
