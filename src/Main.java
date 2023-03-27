import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name below.");
        String name = keyboard.nextLine();
        System.out.println(name
                +"'s favorite color is "
                + getUsersFavoriteColor(name)
                +".");
    }

    public static String getUsersFavoriteColor(String usersName){
        String selectedFavoriteColor="";
        String[] acceptedColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        Boolean isAcceptedColors = false;
        while(!isAcceptedColors){
            Scanner keyboard = new Scanner(System.in);
            System.out.println(usersName
                    +", please enter your favorite color below. (Valid inputs are R.O.Y.G.B.I.V.)");
            String favoriteColor = keyboard.nextLine();
            for(int i=0;i<acceptedColors.length;i++){
                if(favoriteColor.equalsIgnoreCase(acceptedColors[i])){
                    isAcceptedColors=true;
                    selectedFavoriteColor=acceptedColors[i];
                    break;
                }
            }
        }
        return selectedFavoriteColor;
    }
}