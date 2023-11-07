package Products;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char answer = 'Y';
        String name = "";
        int amount = 0;
        double price = 0.0;
        String code = "";
        boolean status = false;
        int maxSize = 0;

        do{
            System.out.print("Digite la cantidad de productos que desea ingresar: ");
            maxSize = in.nextInt();
            if(maxSize < 0){
                System.out.println("Valor introducido incorrecto, digite un dato mayor a 0");
            }
        } while(maxSize < 0);

        Product[] prodList = new Product[maxSize];

        if(maxSize == 0){
            System.out.println("No se requieren productos :D");
        } else {

            for(int i = 0; i < maxSize; i++){
                //OBLIGATORIAMENTE crear manualmente una instancia
                prodList[i] = new Product();

                try{

                    System.out.print("Digite el código del producto: ");
                    in.nextLine();
                    code = in.nextLine();
                    System.out.print("Digite el nombre del producto a digitar: ");
                    name = in.nextLine();
                    System.out.print("Digite la cantidad de producto a ingresar: ");
                    amount = in.nextInt();
                    System.out.print("Digite el precio por c/producto: ");
                    price = in.nextDouble();
                    System.out.print("El producto esta activo o inactivo?: ");
                    status = in.nextBoolean();

                    prodList[i].setCode(code);
                    prodList[i].setName(name);
                    prodList[i].setAmount(amount);
                    prodList[i].setPrice(price);
                    prodList[i].setProductStatus(status);

                } catch (Exception e){
                    System.out.println(e);
                }

            }
            in.close();
        }

        //Imprimir los datos
        if(maxSize != 0){
            for (Product prod :prodList) {
                System.out.println(prod);
            }
        }


    }
}
