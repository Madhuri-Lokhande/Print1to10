
public class StatciCodeExample {

	//Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        //concatenates strings using + in a loop
        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);
        System.out.println(s);

    }
    public static void main(String[] args) {
    	StatciCodeExample sc=new StatciCodeExample();
    	sc.test();
	}
}
