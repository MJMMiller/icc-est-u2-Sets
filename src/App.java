import controllers.ContactoController;
import controllers.Ejercicios;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        System.out.println("Nombre: Mateo Miller");
        System.out.println("\n-- Hash Set --------------------------------------");
        System.out.println("Elementos del HashSet (No se garantiza orden): ");
        runHashSet(sets);
        System.out.println("\n-- LinkedHashSet --------------------------------------");
        System.out.println("Elementos del LinkedHashSet (respeta orden de insercion):");
        runLinkedHashSet(sets);
        System.out.println("\n-- TreeSet --------------------------------------");
        System.out.println("Elementos del TreeSet (orden xxxxxx):");
        runTreeSet(sets);
        System.out.println("\n-- TreeSet con Comparador --------------------------------------");
        System.out.println("Elementos del TreeSet con Comparador - Longitud & Alfabeticamente:");
        runConstruirTreeSetConComparador(sets);
        System.out.println("\n-- TreeSet con Comparador Invertido --------------------------------------");
        System.out.println("Elementos del TreeSet con Comparador - Longitud & Alfabeticamente Invertido:");
        runConstruirTreeSetConComparadorInvertido(sets);

        ContactoController cC = new ContactoController();
        Ejercicios e = new Ejercicios();
    }

    public static void runHashSet(Sets sets){
        for(String palabra : sets.construirHashSet()){
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets){
        for(String palabra : sets.construirLinkedHashSet()){
            System.out.println(palabra);
        }
    }

    public static void runTreeSet(Sets sets){
        for(String palabra : sets.TreeSet())
        System.out.println(palabra);
    }

    public static void runConstruirTreeSetConComparador(Sets sets){
        for(String palabra : sets.construirTreeSetConComparador()){
            System.out.println(palabra);
        }
    }

    public static void runConstruirTreeSetConComparadorInvertido(Sets sets){
        for(String palabra : sets.construirTreeSetConComparadorInvertido()){
            System.out.println(palabra);
        }
    }
}
