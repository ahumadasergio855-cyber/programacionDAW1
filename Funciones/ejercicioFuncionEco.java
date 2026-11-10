public class PracticalogicadeFuncionesUD4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        int n= sc.nextInt();
        //llamada de una funcion
        eco( n);
        
    }
    
     static void eco(int n){
         //el numero de veces que se introduzca del usuario 
        for(int i = 0; i < n; i++){
            System.out.println("Eco...");
        }
    }
}
