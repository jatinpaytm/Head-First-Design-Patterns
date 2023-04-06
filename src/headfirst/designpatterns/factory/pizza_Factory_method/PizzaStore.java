package headfirst.designpatterns.factory.pizza_Factory_method;
//All factory patterns encapsulate object creation. The Factory Method Pattern
// encapsulates object creation by letting subclasses decide what objects to create.
// Let’s check out these class diagrams to see who the players are in this pattern:
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
