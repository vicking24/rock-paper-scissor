import java.util.Scanner;

class rps {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int h=0;
        int c=0;
        boolean again=true;
        int win=0, tie=0, lose=0;
        boolean type=true;

        System.out.println ("Welcome to Rock Paper Scissor Battle!");

        while (again){
            System.out.println("Type rock, paper, or scissor.");

            while (type){
                String human= sc.next();
                System.out.println("");
                System.out.println ("You threw "+human);

                if (human.equals("rock")){
                    h=1;
                    type=false;
                } else if (human.equals("paper")){
                    h=2;
                    type=false;
                } else if (human.equals("scissor")){
                    h=3;
                    type=false;
                } else {
                    type=true;
                    System.out.println ("Type Properly!!!");
                }
            }

            int ans= (int)(Math.random()*3+1);

            if (ans<=1){
                System.out.println ("I threw rock");
                c=1;
            } else if (ans>1&&ans<=2){
                System.out.println ("I threw paper");
                c=2;
            } else if (ans>2&&ans<=3){
                System.out.println ("I threw scissor");
                c=3;
            }

            if (h>ans) {
                System.out.println ("Nooo! You beat me!");
                win++;
            }else if (h<ans) {
                System.out.println ("Hahahah I Win!");
                lose++;
            } else if (h==ans) {
                System.out.println ("It's a tie. Battle me again!");
                tie++;
            } 

            System.out.println ("Do you want to play again? [y or n]");
            String yn=sc.next();
            if (yn.equals ("y")){
                again=true;
            } else {
                again=false;
                System.out.println ("");
                System.out.println ("Nice playing with you!");
            }
            type=true; 
        }
        System.out.println ("");
        System.out.println("Your Data:");
        System.out.println ("Wins: "+win);
        System.out.println ("Ties: "+tie);
        System.out.println ("Losses: "+lose);
        System.out.println ("");
        

    }

}