package javaControl;

public class LoopArray {

	public static void main(String[] args) {
		/* 
         *  <li>ujoo</li>
         *  <li>junmyeon</li>
         *  <li>dongho</li>
         */
         
        String[] users = new String[3];
        users[0] = "ujoo";
        users[1] = "junmyeon";
        users[2] = "dongho";
         
        for(int i=0; i<users.length; i++) {
            System.out.println(users[i]+",");
        }

	}

}
