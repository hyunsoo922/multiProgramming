package chap05;

import java.util.Random;

public class ProgrammingTask09 {
    public static void main(String[] args) {

        char[][] game = map(5,10,0.3);
        mineMap(game);

        char[][] mineGame = nearMineMap(game);
        mineMap(mineGame);
    }

    public static char[][] map(int m, int n, double p)
    {
        char[][] game = new char[m][n];
        Random random =new Random();

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(random.nextDouble() < p)
                {
                    game[i][j] = '*';
                }else{
                    game[i][j] = '-';
                }
            }
        }
        return game;
    }

    public static char[][] nearMineMap(char[][] game)
    {
        int m = game.length;
        int n = game[0].length;
        char[][] mine = new char[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0 ; j < n; j++)
            {
                if(game[i][j]=='*')
                {
                    mine[i][j] = '*';
                }else{
                    mine[i][j] = countNearMine(game,i,j);
                }
            }
        }
        return mine;
    }

    public static char countNearMine(char[][] game,int x,int y)
    {
        int count = 0;
        int m = game.length;
        int n = game[0].length;

        for(int i = x - 1; i <= x+1;i++)
        {
            for(int j = y - 1; j <= y + 1; j++)
            {
                if(i >= 0 && i <m && j >=0 && j < n && !(i==x && j ==y) && game[i][j]=='*')
                {
                    count++;
                }
            }
        }
        return Character.forDigit(count,10);
    }

    public static void mineMap(char[][] game)
    {
        for(int i = 0 ; i < game.length; i++)
        {
            for(int j = 0; j < game[0].length; j++)
            {
                System.out.print(game[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();

    }

}
