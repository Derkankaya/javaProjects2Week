public class main {
    public static void main(String[] args) {
        Product product =new Product(12,"Laptop","Asus Laptop",2100,23,"Blue");

        /*Product product = new Product();
        product.setName("Laptop");
        product.setId(12312321);
        product.setDescription("Asus Laptop");
        product.setPrice(2100);
        product.setStockAmount(23);
        product.setColor("Blue");*/

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }

}
