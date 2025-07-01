package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets(){

    }

    public Set<String> construirHashSet(){

        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }

    public Set<String> construirLinkedHashSet(){

        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;
    }

    public Set<String> TreeSet(){

        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador(){

        // Crear un Comparator

        Comparator<String> comparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //Comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
                if(result == 0){
                    result = s1.compareToIgnoreCase(s2);
                }
                return result;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorLongitud);

        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Celulas");

        return miTreeSetComparador;
    }

        public Set<String> construirTreeSetConComparadorInvertido(){

        // Crear un Comparator

        Comparator<String> comparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //Comparamos la longitud
                int result = Integer.compare(s2.length(), s1.length());
                if(result == 0){
                    result = s2.compareToIgnoreCase(s1);
                }
                return result;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorLongitud);

        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Celular");
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Laptop");
        miTreeSetComparador.add("Celulas");

        return miTreeSetComparador;
    }
    
}
