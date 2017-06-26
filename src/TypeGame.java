import java.util.Scanner;

/**
 * Created by Andrew on 6/26/2017.
 */
public class TypeGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("you are a evil wizard on mars aliens kick you off");
        System.out.println("choice 1 go to a differnt galexy choice 2 go to earth");
        System.out.print("if you want galaxy type 1 if you want earth type 2");
        String input= scanner.next();
        //section 1
        if(input.equals("1")){
            System.out.print("you were sucked into a black hole ");
            return;
        //section 2
        } else if (input.equals("2")){
            System.out.print("you landed on a mountain");
            System.out.print("choice 1 go get in a house you see choice 2 build a tower choice 3 steal money then buy a space ship\n");
            input= scanner.next();
            //section 3
            if(input.equals("1")){
             System.out.print("you got caught");
             return;
             //section 4
            } else if (input.equals("3")){
                System.out.print("you got caught");
                return;
                //section 5
            } else if (input.equals("2")){
                System.out.print("you see a boy");
                System.out.print("the boy tells you to give him your wand choice 1 give your wand to him" +
                " choice 2 keep wand choice three turn him into a frog");
                input= scanner.next();
                //section 6
                if (input.equals("1")){
                    System.out.print("he teleported you into a black hole");
                        return;
                  //win section
                } else if (input.equals("2") || input.equals("3") ){
                    System.out.print("you win");
                    return;

                }
            }
        }
    }
}
