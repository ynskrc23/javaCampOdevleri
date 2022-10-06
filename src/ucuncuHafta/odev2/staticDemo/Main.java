package ucuncuHafta.odev2.staticDemo;

public class Main {
    public static void main(String[] args){
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "elma";
        product.price = 20;
        productManager.add(product);
    }
}
