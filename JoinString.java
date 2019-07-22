


public class JoinString {

    private static String one = "Event handlers is dedicated", two = " to making your event", three = " a memorable one";

    public static void main(String[] args) {

        System.out.println("Hello" + " " + "World");
        System.out.println("123" + "456");

        StringBuilder sb = new StringBuilder();
        sb.append(one.toCharArray());
        sb.append(two.toCharArray());
        sb.append(three);
        System.out.println(sb.toString());


        System.out.println("Bye!");
        String word = "rock";
        String word2 = word.replace('r', 'd');

        System.out.println(word2);

        StringBuilder builder = new StringBuilder("rock");
        builder.replace(0, 1, "d");

        System.out.println(builder);

    }

}
