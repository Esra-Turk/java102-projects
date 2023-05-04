package Store;

import Products.Notebook;
import Products.Phone;
import Products.Product;
import Trademark.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class PatikaStore {
    private static final List<Trademark> list;
    private static List<Product> listPhone = new ArrayList<>();
    private  static List<Product> listNotebook = new ArrayList<>();


    static {
        list = new ArrayList<>();
        list.add(new Trademark(1, "Samsung"));
        list.add(new Trademark(2, "Lenovo"));
        list.add(new Trademark(3, "Apple"));
        list.add(new Trademark(4, "Huawei"));
        list.add(new Trademark(5, "Casper"));
        list.add(new Trademark(6, "Asus"));
        list.add(new Trademark(7, "HP"));
        list.add(new Trademark(8, "Xiaomi"));
        list.add(new Trademark(9, "Monster"));

        list.sort(Comparator.comparing(Trademark::getName));
    }

    public static void listTradeMark(){
        for (Trademark t: list) {
            System.out.println(t.getName());
        }
    }


    public static List<Product> addPhone(){
       listPhone.add(new Phone("SAMSUNG GALAXY A51 ",10,6,128,3199.0,0.2,6.5, new Trademark(1,"Samsung"),4000.0,32,"Black"));
       listPhone.add(new Phone("iPhone 11 64 GB ",11,6,64,7379.0,0.1,6.1, new Trademark(3,"Apple"),3046.0,5,"Blue"));
       listPhone.add(new Phone("SAMSUNG GALAXY A51 ",10,6,128,4012.0,0.2,6.5, new Trademark(8,"Xiaomi"),4000.0,35,"White"));
       return listPhone;
    }

    public static List<Product> addNotebook(){
        listNotebook.add(new Notebook("HUAWEI Matebook 14",10,16,512,7000.0,0.1,14.0,new Trademark(4,"Huawei")));
        listNotebook.add(new Notebook("LENOVO V14 IGL",15,8,1024,3699.0,0.05,14.0,new Trademark(2,"Lenovo")));
        listNotebook.add(new Notebook("ASUS Tuf Gaming  ",13,32,2048,8199.0,0.01,15.6,new Trademark(6,"Asus")));
        return listNotebook;
    }

    public static void listProducts(List<Product> products){
            if (products.isEmpty()) {
                System.out.println("Ürün bulunamadı.");
                return;
            }
            if(products.get(0)){
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("ID\t\t" + "Product Name\t\t" + "Brand\t" + "Price\t" + "Storage\t" + "Screen Size\t "+ "RAM");
                System.out.println("-----------------------------------------------------------------------------------------");
                for (int i = 0; i < products.size(); i++) {
                    Product product = products.get(i);
                    System.out.println((i+1) + "\t\t" + product.getProductName() +"\t"+  product.getTradeMark().getName()
                            +"\t"+ product.getUnitPrice() +"\t"+  product.getStorage() +"\t\t"+ product.getScreenSize() +"\t\t\t"+  product.getRam() );
                }

            }else{

            }

        }
    }

