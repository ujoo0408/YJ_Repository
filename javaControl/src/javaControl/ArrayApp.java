package javaControl;

public class ArrayApp {

	public static void main(String[] args) {
		// ujoo, junmyeon, dongho 
		// String users = "ujoo, junmyeon, dongho";
        String[] users = new String[3];
        users[0] = "ujoo";
        users[1] = "junmyeon";
        users[2] = "dongho";
         
        System.out.println(users[1]);
        System.out.println(users.length);
         
        int[] scores = {10, 100, 100}; // ¿ø¼Ò, element
        System.out.println(scores[1]);
        System.out.println(scores.length);

	}

}
