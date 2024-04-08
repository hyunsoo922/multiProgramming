package chap05;

public class ProgrammingTask03 {
    public static void main(String[] args) {
        for(Direction d: Direction.values())
        {
            System.out.print(d+" ");
        }
    }
}

enum Direction{
    EAST("동"),WEST("서"),SOUTH("남"),NORTH("북");

    private String s;

    Direction(String s) {
        this.s = s;
    }

    public String toString(){
        return s;
    }


}