package gato_con_botas.quiz;

import java.util.Scanner;

public class JavaQuiz {
    private static final String[][] QUESTIONS = {
            {
                    "¿Qué palabra clave se usa para indicar que una clase no puede ser extendida?",
                    "a) final",
                    "b) static",
                    "c) abstract",
                    "a"
            },
            {
                    "¿Cuál de estos NO es un tipo primitivo en Java?",
                    "a) int",
                    "b) String",
                    "c) boolean",
                    "b"
            },
            {
                    "¿Qué interfaz debe implementar una clase para ser usada en un for-each loop?",
                    "a) Serializable",
                    "b) Iterable",
                    "c) Comparable",
                    "b"
            },
            {
                    "¿Qué método se ejecuta al iniciar un programa Java?",
                    "a) init()",
                    "b) main()",
                    "c) start()",
                    "b"
            },
            {
                    "¿Cuál es la superclase de todas las clases en Java?",
                    "a) Object",
                    "b) Class",
                    "c) Super",
                    "a"
            },
            {
                    "¿Qué palabra clave se usa para manejar excepciones?",
                    "a) exception",
                    "b) try",
                    "c) error",
                    "b"
            },
            {
                    "¿Qué colección NO permite elementos duplicados?",
                    "a) ArrayList",
                    "b) HashSet",
                    "c) LinkedList",
                    "b"
            }
    };

    public static boolean askQuestion(Scanner scanner) {
        int randomIndex = (int)(Math.random() * QUESTIONS.length);
        String[] question = QUESTIONS[randomIndex];

        System.out.println("\n=== Pregunta sobre Java ===");
        System.out.println(question[0]);
        System.out.println(question[1]);
        System.out.println(question[2]);
        System.out.println(question[3]);

        System.out.print("Tu respuesta (a/b/c): ");
        String answer = scanner.nextLine().toLowerCase();

        boolean correct = answer.equals(question[4]);
        if (correct) {
            System.out.println("¡Correcto! Sabes mucho de Java.");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era " + question[4]);
        }

        return correct;
    }
}
