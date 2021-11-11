package comunityuni.com;

import java.util.Scanner;

public class Worker extends Person{
    private String Prosition;
    private int Number_Product;

    public Worker(String prosition, int number_Product) {
        super();
        Prosition = prosition;
        Number_Product = number_Product;
    }

    public Worker()
    {}

    public Worker(String ID, String name, int age, String address,String prosition, int number_Product) {
        super(ID, name, age, address);
        Prosition = prosition;
        Number_Product = number_Product;
    }

    public String getProsition() {
        return Prosition;
    }

    public int getNumber_Product() {
        return Number_Product;
    }

    public void setProsition(String prosition) {
        Prosition = prosition;
    }

    public void setNumber_Product(int number_Product) {
        Number_Product = number_Product;
    }

    public float Money(){
        return this.Number_Product * 120;
    }

    public void input(Scanner scanner, int index){
        System.out.print("Nhap vao Worker thu " + index + 1 + ": ");
        System.out.print("\n");
        System.out.print("Nhap vao ID: ");
        this.setID(scanner.nextLine());
        System.out.print("Nhap vao Name: ");
        this.setName(scanner.nextLine());
        System.out.print("Nhap vao Age: ");
        do{
            this.Age = scanner.nextInt();
            if(this.Age <= 0){
                System.err.print("Nhap sai roi, nhap lai Age: ");
            }
        }while(this.Age <= 0);
        scanner.nextLine();
        System.out.print("Nhap vao Address: ");
        this.setAddress(scanner.nextLine());
        System.out.print("Nhap vao Position: ");
        this.setProsition(scanner.nextLine());
        System.out.print("Nhap vao NumberProduct: ");
        do{
            this.Number_Product = scanner.nextInt();
            if(this.Number_Product <= 0){
                System.err.print("Nhap sai roi, nhap lai NumberProduct: ");
            }
        }while(this.Number_Product <= 0);
    }

    public void output(){
        System.out.print("ID: " + this.getID());
        System.out.print("Name: " + this.getName());
        System.out.print("Age: " + this.getAge());
        System.out.print("Address: " + this.getAddress());
        System.out.print("Position: " + this.getProsition());
        System.out.print("NumberProduct: " + this.getNumber_Product());
        System.out.print("Money: " + this.Money());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", Prosition='" + Prosition + '\'' +
                ", Number_Product=" + Number_Product +
                '}';
    }
}
