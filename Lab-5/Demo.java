public class Demo{
      public static void main(String args[]){
             Product p1=new Product("Iphone",4000,4);
             Product p2=new Product("Pixel",3000,4);
             Product p3=new Product("Samsung",6000,2,new Date(10,8,2026));

             p1.display();
             p2.display();
             p3.display();
}

}