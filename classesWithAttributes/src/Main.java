
public class Main {


    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Lenovo Laptop");
        product.setStockAmount(2);
        System.out.println(product.getName());
        
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        
        System.out.println(product.getKod());
    }
    
}
