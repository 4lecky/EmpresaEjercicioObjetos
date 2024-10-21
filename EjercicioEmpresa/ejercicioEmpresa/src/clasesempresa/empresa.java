package clasesempresa;
import java.util.ArrayList;


public class empresa { 

   ArrayList<empleado> empleados;

   //Contructor
   public empresa (){
    empleados = new ArrayList<empleado>();
   }

   //Metodo, se agregan empleados a la empresa

   public void contratarEmpleados (empleado e){
    empleados.add(e);
   }

   // Metodo, obtiene el total de empleados

   public int getTotalEmpleados(){
    return empleados.size();
   }

   // Metodo, muestra el nombre y salario de los empleados 

   public void nombreSalario(){

        for (empleado e: empleados){

            System.out.println("El empleado: \n" + e.getNombre() + " \n Tiene un salario" + e.getSalario());

        }
     

   }

   // Metodo, retorna el total del dinero

   public double getTotalSalarios (){
    double total = 0;
    for(empleado e: empleados){

        total = total + e.getSalario();

    }

    return total; 
   }


   
//ESCRIBIR CODIGO FALTANTE 


}
