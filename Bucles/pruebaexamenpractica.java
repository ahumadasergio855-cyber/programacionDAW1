  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio");
        double precio = sc.nextDouble();
        double total = 0;
        double mayor = 0;
        double menor = 0;
        int numproductos = 0;
        while (precio !=-1){
            if(precio > 0){
                total = total + precio;
                numproductos++;
            }
            if(numproductos == 1){
                mayor  = precio;
                menor = precio;
            }
            if(precio > mayor){
                mayor = precio;
            }
            if (precio < menor){
                menor =  precio;
            }
        System.out.println("Introduce el precio: ");
        precio = sc.nextDouble();
        }
        if( numproductos > 0){
        double media = total / numproductos;
       

    System.out.println("Productos: " + numproductos);
    System.out.println("Total: " + total);
    System.out.println("Media: " + media);
    System.out.println("Mayor: " + mayor);
    System.out.println("Menor: " + menor);
}
        }
        
    }
