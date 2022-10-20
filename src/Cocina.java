/*
 * Clase Director 
 * 
 */
public class Cocina {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
        System.out.println("Creando Pizza " + pb);
    }

    public Pizza getPizzza(){
        return pizzaBuilder.getPizza();
    }

    public void construirPizza() {
        pizzaBuilder.crearuevaPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }
}
