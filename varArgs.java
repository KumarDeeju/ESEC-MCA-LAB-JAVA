public class varArgs {
    public static void main(String[] args) {
        System.out.println(concate("Arjun", "Rohit"));
        System.out.println(concate("Raaj", "Rohit"));
        System.out.println(concate("SUmit", "Amit", "Sujit"));
        System.out.println(concate("Mithun", "Raghav"));
    }

    public static String concate(String... str) {
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(string).append(" ");
        }
        return sb.toString();
    }
}
