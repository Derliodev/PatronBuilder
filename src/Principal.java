/*
 * clase Main
 * 
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzabuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

        cocina.setPizzaBuilder(hawai_pizzabuilder);
        cocina.construirPizza();

        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizzza();
    }
}
