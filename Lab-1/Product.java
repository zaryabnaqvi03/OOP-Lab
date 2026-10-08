public class Product{

      private String id;
      private String name;
      private double price;
      private int qty;

      public Date md;

      private static int counter=1;
      private static double maxPrice;
      private static double minPrice;


      public Product(String name, double price, int qty){
                this(name,price,qty,new Date(1,1,1));
}

      public Product(String name, double price, int qty, Date md){
                this.id=String.format("P%03d",counter++);
		this.name=name;
		this.price=price;
                this.qty=qty;
                this.md=md;

           if(counter==2){
           maxPrice=price;
           minPrice=price;
}

           if(counter>2 && minPrice>price)
           minPrice=price;
           if(counter>2 && maxPrice<price)
           maxPrice=price;
}


      public void display(){
                System.out.printf("ID: %s \n",id);
                System.out.printf("Name: %s \n",name);
                System.out.printf("Price: %.2f \n",price);
                System.out.printf("Quantity: %d \n",qty);
                System.out.printf("Max Price: %.2f \n",maxPrice);
                System.out.printf("Min Price: %.2f \n",minPrice);
                System.out.printf("Manufacturing Date: %s \n",md);
}

}