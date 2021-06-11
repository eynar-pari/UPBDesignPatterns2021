package _ejerciciosParcial1.abstractFactory;

public class Client {

    public static void main (String [] args){

        FactoryMateria.make(FactoryMateria.Materia.HISTORIA).inscripcion(new Estudiante("Jose1","001"));
        FactoryMateria.make(FactoryMateria.Materia.INGLES).inscripcion(new Estudiante("Jose2","002"));
        FactoryMateria.make(FactoryMateria.Materia.LENGUAJE).inscripcion(new Estudiante("Jose3","003"));
        FactoryMateria.make(FactoryMateria.Materia.MATEMATICA).inscripcion(new Estudiante("Jose4","004"));
        FactoryMateria.make(FactoryMateria.Materia.HISTORIA).inscripcion(new Estudiante("Jose5","005"));

    }
}
