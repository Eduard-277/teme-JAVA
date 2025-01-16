package exercitiul1;

public class Parabola {

    private int a;
    private int b;
    private int c;

    public Parabola(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getC() {
        return c;
    }

    public  Punct varf()
    {
        int x,y;
        x=-(b/(2*a));
        y= -((int) Math.pow(b,2) + 4*a*c)/(4*a);
        Punct vf= new Punct(x,y);
        return vf;
    }

    public String toString() {
        return a + "x^2 + " + b + "x + " + c;
    }

    public Punct mij_seg(Parabola p)
    {
        int x1,x2,y1,y2;
        int mx,my;
        Punct vf1= this.varf();
        Punct vf2= p.varf();
        x1= vf1.getX();
        y1= vf1.getY();
        x2= vf2.getX();
        y2= vf2.getY();
        mx=(x1+x2)/2;
        my=(y1+y2)/2;
        Punct mij=new Punct(mx,my);
        return mij;
    }

    public static Punct mij_seg(Parabola p1, Parabola p2)
    {
        int x1,x2,y1,y2;
        int mx,my;
        Punct vf1= p1.varf();
        Punct vf2= p2.varf();
        x1= vf1.getX();
        y1= vf1.getY();
        x2= vf2.getX();
        y2= vf2.getY();
        mx=(x1+x2)/2;
        my=(y1+y2)/2;
        Punct mij=new Punct(mx,my);
        return mij;
    }

    public int lungime(Parabola p)
    {
        int l,x1,x2,y1,y2,k,h;
        Punct vf1= this.varf();
        Punct vf2= p.varf();
        x1= vf1.getX();
        y1= vf1.getY();
        x2= vf2.getX();
        y2= vf2.getY();
        k= (int) Math.pow(x2-x1,2);
        h= (int) Math.pow(y2-y1,2);
        l= (int) Math.sqrt(k+h);
        return l;
    }

    public static int lungime(Parabola p1, Parabola p2)
    {
        int l,x1,x2,y1,y2,k,h;
        Punct vf1= p1.varf();
        Punct vf2= p2.varf();
        x1= vf1.getX();
        y1= vf1.getY();
        x2= vf2.getX();
        y2= vf2.getY();
        k= (int) Math.pow(x2-x1,2);
        h= (int) Math.pow(y2-y1,2);
        l= (int) Math.sqrt(k+h);
        return l;
    }

}
