package chap05;

public class ProgrammingTask07 {
    public static void main(String[] args) {
        int[] a = {3,2,4,1,5};
        int[] b = {3,2,4,1};
        int[] c = {3,2,4,1,5};
        int[] d = {2,7,1,8,2};

        boolean aCheck = false;
        boolean bCheck = false;
        boolean cCheck = false;
        boolean dCheck = false;


        for(int i = 0 ; i < a.length; i++)
        {
            if(a.length == b.length) {
                if (a[i] == b[i]) {
                    bCheck = true;
                } else {
                    bCheck = false;
                }
            }
            if(a.length == c.length) {
                if (a[i] == c[i]) {
                    cCheck = true;
                } else {
                    cCheck = false;
                }
            }

            if(a.length == d.length) {
                if (a[i] == d[i]) {
                    dCheck = true;
                } else {
                    dCheck = false;
                }
            }
        }
        System.out.println("a 와 b 배열의 동일성 "+bCheck);
        System.out.println("a 와 c 배열의 동일성 "+cCheck);
        System.out.println("a 와 d 배열의 동일성 "+dCheck);

        for(int i = 0 ; i < a.length; i++)
        {
            if(b.length == a.length) {
                if (a[i] == b[i]) {
                    bCheck = true;
                } else {
                    bCheck = false;
                }
            }
            if(b.length == c.length) {
                if (b[i] == c[i]) {
                    cCheck = true;
                } else {
                    cCheck = false;
                }
            }

            if(b.length == d.length) {
                if (b[i] == d[i]) {
                    dCheck = true;
                } else {
                    dCheck = false;
                }
            }
        }
        System.out.println("b 와 a 배열의 동일성 "+bCheck);
        System.out.println("b 와 c 배열의 동일성 "+cCheck);
        System.out.println("b 와 d 배열의 동일성 "+dCheck);

        for(int i = 0 ; i < a.length; i++)
        {
            if(c.length == a.length) {
                if (a[i] == c[i]) {
                    bCheck = true;
                } else {
                    bCheck = false;
                }
            }
            if(b.length == c.length) {
                if (b[i] == c[i]) {
                    cCheck = true;
                } else {
                    cCheck = false;
                }
            }

            if(c.length == d.length) {
                if (c[i] == d[i]) {
                    dCheck = true;
                } else {
                    dCheck = false;
                }
            }
        }
        System.out.println("c 와 a 배열의 동일성 "+bCheck);
        System.out.println("c 와 b 배열의 동일성 "+cCheck);
        System.out.println("c 와 d 배열의 동일성 "+dCheck);

    }
}
