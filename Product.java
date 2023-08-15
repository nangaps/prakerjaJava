class Product
{

    private String name,description;
    private int price,stock;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public int getStock()
    {
        return this.stock;
    }

    public static void main(String[] args)
    {
        Product coffee = new Product();
        Product milk = new Product();
        Product appleJuice = new Product();
        
        
        // Set all attribute to object
        coffee.setName("coffe");
        coffee.setDescription("this is coffe");
        coffee.setPrice(15000);
        coffee.setStock(10);
        
        milk.setName("milk");
        milk.setDescription("this is milk");
        milk.setPrice(25000);
        milk.setStock(10);
        
        appleJuice.setName("apple juice");
        appleJuice.setDescription("this is apple juice");
        appleJuice.setPrice(18000);
        appleJuice.setStock(20);
        
        System.out.println("INFO PRODUK \n");
        System.out.println("nama : " + coffee.getName());
        System.out.println("deskripsi : " + coffee.getDescription());
        System.out.print("harga : ");
        System.out.println(coffee.getPrice());
        System.out.print("stok : ");
        System.out.println(coffee.getStock());

        System.out.println("=============================");

        System.out.println("INFO PRODUK \n");
        System.out.println("nama : " + milk.getName());
        System.out.println("deskripsi : " + milk.getDescription());
        System.out.print("harga : ");
        System.out.println(milk.getPrice());
        System.out.print("stok : ");
        System.out.println(milk.getStock());

        

        System.out.println("INFO PRODUK \n");
        System.out.println("nama : " + appleJuice.getName());
        System.out.println("deskripsi : " + appleJuice.getDescription());
        System.out.print("harga : ");
        System.out.println(appleJuice.getPrice());
        System.out.print("stok : ");
        System.out.println(appleJuice.getStock());
    }
}