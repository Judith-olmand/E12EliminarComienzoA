import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class E12EliminarComienzoA {
    public static void main(String[] args) {
        Set<String> palabras = new HashSet<>();

        palabras.add("Abrigo");
        // USO DE GEMINI
        //crea 10 líneas como esta, con diferentes palabras. Que haya 5 que empiecen por A
        //palabras.add("Abrigo");
        palabras.add("Acuarela");
        palabras.add("Espejismo");
        palabras.add("Brújula");
        palabras.add("Almendra");
        palabras.add("Asteroide");
        palabras.add("Destello");
        palabras.add("Horizonte");
        palabras.add("Antorcha");
        palabras.add("Cúmulo");
        palabras.add("Abanico");

        System.out.println("LISTA DE PALABRAS COMPLETA");
        for(String palabra : palabras){
            System.out.print(palabra + "; ");
        }

        Iterator<String> iterador = palabras.iterator();
        while(iterador.hasNext()){
            String palabra = iterador.next();
            /**
             * startsWith --> que comience con X
             * también se puede usar:
             * palabra.matches("(?i)A.*") --> (?i) --> ignora mayus o minus.
             */
            if(palabra.toUpperCase().startsWith("A")){
                iterador.remove();
            }
        }

        System.out.println();
        System.out.println("LISTA DE PALABRAS SIN LAS QUE COMIENZAN CON A");
        for(String palabra : palabras){
            System.out.print(palabra + "; ");
        }
    }
}