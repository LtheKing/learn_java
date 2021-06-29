package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String player1 = displayHighScorePosition("aldi") + calculateHighScorePosition(1500);
        System.out.println(player1);

        String player2 = displayHighScorePosition("nana") + calculateHighScorePosition(900);
        System.out.println(player2);

        String player3 = displayHighScorePosition("muhrim") + calculateHighScorePosition(400);
        System.out.println(player3);

        String player4 = displayHighScorePosition("ununu") + calculateHighScorePosition(50);
        System.out.println(player4);

    }

    public static String displayHighScorePosition(String name) {

        String result = ("Peserta Dengan Nama " +name +  " Menempati Posisi : ");
        return  result;
    }

    public static int calculateHighScorePosition(int score) {
        int position = 0;
        if (score > 1000){
            position = 1;
        } else if(score > 500 && score < 1000) {
            position = 2;
        } else if(score > 100 && score < 500) {
            position = 3;
        } else  {
            position = 4;
        }
        String kataKata = ("Menempati posisi "+position);
        return position;
    }

}
