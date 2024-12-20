package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
import java.sql.Connection;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Connection conn = Connections.getConnection();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a oid :");
        int oid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a customer name:");
        String name = sc.nextLine();
        System.out.println("Enter a daddress:");
        String daddress = sc.nextLine();
        System.out.println("Enter a item :");
        int item = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a quantity :");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a price :");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a statues:");
        String statues = sc.nextLine();
        FoodOrder fd = new FoodOrder();
        fd.setOid(oid);
        fd.setCustomber(name);
        fd.setDaddress(daddress);
        //fd.setItems();
        fd.setQuantity(quantity);
        fd.setPrice(price);
        fd.setStatues(statues);
        DAOLayer.insertquery(conn,fd);
        DAOLayer.selectQuery(conn,fd);
        DAOLayer.updatequery(conn,fd);
        DAOLayer.deletequery(conn,fd);






    }
}