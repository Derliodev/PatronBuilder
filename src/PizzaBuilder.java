public abstract class PizzaBuilder {
    
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void crearuevaPizza() {
        pizza = new Pizza();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
