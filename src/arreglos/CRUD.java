package arreglos;

import utils.Leer;
public class CRUD {
    public static String[] nombre = new String[1000];
    public static String[] fnacimiento = new String[1000];
    public static String[] dni = new String[1000];
    public static String[] usuario = new String[1000];
    public static String[] contraseña = new String[1000];
    public static String[] fregistro = new String[1000];
    public static int posicion = -1;
    
    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar usuario ");
        System.out.println("2. Editar informacion del usuario");
        System.out.println("3. Eliminar usuario ");
        System.out.println("4. Listar usuario ");
        System.out.println("5. Salir");
        System.out.println("Escoja una de las opciones : ");
    }
    public static void registrarusuario(){
        String continuar;
        do {
        posicion++;
        System.out.println("Registrar usuario: ");
        System.out.println("Nombre: ");
        nombre[posicion]=Leer.cadena();
        System.out.println("Dni");
        dni[posicion]=Leer.cadena();
        System.out.println("Fecha de Nacimiento");
        fnacimiento[posicion]=Leer.cadena();
        System.out.println("Fecha de Registro");
        fregistro[posicion]=Leer.cadena();
        System.out.println("ID usuario");
        usuario[posicion]=Leer.cadena();
        System.out.println("Contraseña");
        contraseña[posicion]=Leer.cadena();
        System.out.println("¿Deseas agregar otro [S/N]?");
        continuar = Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void eliminarusuario(){
        String continuar;
        do {
        listarinformacion();
        System.out.println("Ingrese el numero a eliminar");
        int numero=Leer.entero();
        numero--;
        for (int i = 0; i < numero; i++) {
            nombre[i]=nombre[i+1];
            dni[i]=dni[i+1];
            fnacimiento[i]=fnacimiento[i+1];   
            fregistro[i]=fregistro[i+1];
            usuario[i]=usuario[i+1];
            contraseña[i]=contraseña[i+1];
        }
        nombre[posicion]="";
        dni[posicion]="";
        fnacimiento[posicion]="";
        fregistro[posicion]="";
        usuario[posicion]="";
        contraseña[posicion]="";
        posicion --;
        System.out.println("¿Deseas eliminar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void editarusuario(){
        String continuar;
        do {
        System.out.println("ingrese el numero de la persona a editar: ");
        int numero = Leer.entero();
        numero--;
        System.out.println("resultado:"+nombre[numero]+ "--"+dni[numero]+"--"+ fnacimiento[numero]+"--"+fregistro[numero]+"--"+usuario[numero]+"--"+contraseña[numero]);
        System.out.println("nuevo nombre: ");
        nombre[numero]=Leer.cadena();
        System.out.println("nuevo dni: ");
        dni[numero]=Leer.cadena();
        System.out.println("nueva fecha de nacimiento: ");
        fnacimiento[numero]=Leer.cadena();
        System.out.println("nueva fecha de registro: ");
        fregistro[numero]=Leer.cadena();
        System.out.println("nuevo usuario: ");
        usuario[numero]=Leer.cadena();
        System.out.println("nueva contraseña: ");
        contraseña[numero]=Leer.cadena();
        System.out.print("¿Deseas editar otro [S/N]?");
        continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
        
    }
    public static void listarinformacion(){
        System.out.println("Listado");
        System.out.println("N°\tDNI\t\tF. Nac. \t\tNombre Completo\t\tF. Registro\t\tUsuario\t\tContraseña");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i + 1) + "\t" + dni[i] + "\t" + fnacimiento[i] + "\t" + nombre[i]+ "\t" +fregistro[i]+ "\t" + usuario[i]+ "\t" + contraseña[i]);
        }

    }
    public static void salir(){
        System.out.println("Gracias por su visita");
    }
    public static void error(){
        System.out.println("Error , Opcion incorrecta");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();     
            opcion = Leer.entero();
            switch(opcion){
                case 1 : registrarusuario();
                    break;  
                case 2: editarusuario();
                    break;
                case 3: eliminarusuario();
                    break;
                case 4: listarinformacion();
                    break;
                case 5: salir();
                    break;
                default : error();
    
            }               
                
            
        }while (opcion!=5); 
    }
    public static void main(String[] args) {  
        inicio();
    }
}

