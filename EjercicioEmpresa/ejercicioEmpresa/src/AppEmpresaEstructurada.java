import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppEmpresaEstructurada {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList <String> cargos = new ArrayList<>();
        ArrayList <Double> salarios = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados"));

        for (int emp = 0; emp < cantidad; emp++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado"); 
            String cargo = JOptionPane.showInputDialog(null,"Ingrese el cargo del empleado: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el slario del empleado")); // Lo usamos ya que el dato es de tipo double, este tiene que ser especificado "Double.parseDouble"
            //Variables temporales, pedimos informacion por medio de ellas

            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
            //Aqui guardamos los datos de pedidos por las variables anteriores permanentemente
        }

        System.out.println("Los nombres y los salarios de los empleados son: \n");

        for (int emp = 0; emp < cantidad; emp++) {

            System.out.println("Nombre: \n" + nombres.get(emp) + "\n Salario: \n" + salarios.get(emp));
            //Retornamos valores con esta funcion
        }  

        //En algunos casos debe inicializarse primero
        double total = 0;
        for (int emp = 0; emp < cantidad; emp++ ) {

             total = total + salarios.get(emp);
        }
    
        //Total sueldos
        System.out.println("El total de salarios pagados a los empleados es: \n" + total);


        //Empleado que mas gana
        System.out.println("\n El empleado que más dinero gana es: \n");
        double mayorSalario = salarios.get(0);
        int posicion = 0;
        for(int emp = 1; emp < cantidad; emp++ ){

            if (salarios.get(emp) > mayorSalario) {

                mayorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " 
        + cargos.get(posicion) + " Salario: " + mayorSalario);

        //Menos gana
        System.out.println("\n El empleado que menos dinero gana es: \n");
        double menorSalario = salarios.get(0);
        posicion = 0;
        for(int emp = 1; emp < cantidad; emp++ ){

            if (salarios.get(emp) < mayorSalario) {

                menorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " 
        + cargos.get(posicion) + " Salario: " + menorSalario);



        


    }
}
