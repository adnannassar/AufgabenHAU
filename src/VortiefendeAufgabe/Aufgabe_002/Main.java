package VortiefendeAufgabe.Aufgabe_002;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("add")) {
                System.out.println("Hallo Amr");
            } else {
                System.out.println("Hallo");
            }
        }else{
            System.out.println("No Args");
        }

    }
}
