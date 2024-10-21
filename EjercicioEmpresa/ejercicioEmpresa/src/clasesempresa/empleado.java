package clasesempresa;

public class empleado {

    private String nombre;
    private String cargo;
    private double salario;

    public empleado () {

    }

    public empleado ( String nombre, String cargo, double salario){

        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Nombre

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return nombre; 
    }

    //Cargo

    public void setCargo (String cargo){
        this.cargo = cargo;
    }

    
    public String getCargo (){
        return cargo; 
    }

    //Salario

    public void setSalario (double salario){
        this.salario = salario; 
        
    }
    
    public double getSalario (){
        return salario; 
    }
    
    
    
}
