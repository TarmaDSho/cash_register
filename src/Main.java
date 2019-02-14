import java.io.*;

public class Main {
    public static void main(String[] args) {
        Menu fullMenu = new Menu();

        String item_text;
        String[] token_container;
        FileReader fr = null;

        try{
            fr = new FileReader("src/menu.txt");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(fr);

        try{
            while ((item_text = br.readLine()) != null) {
                token_container = item_text.split(",");
                fullMenu.addObjectToMenu(token_container[0], Double.parseDouble(token_container[1]));
                //System.out.println(token_container[0] + " " + token_container[1]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        fullMenu.printMenu();
    }
}