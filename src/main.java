public class main {
    public static void main(String[] args) {
        /* Function f
        Var x = new Var("x");
        Var y = new Var("y");

        x.setValue(1.0);
        y.setValue(1.0);

        Function f = new Plus(x, new Mul(new Val(2), y));

        System.out.println("Formule : " + f.toString());
        System.out.println("Value : " + f.getValue());

        */

        /* Function g
        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        x.setValue(2.0);
        y.setValue(2.0);
        z.setValue(2.0);

        Function x2 = new Sqr(x);
        Function y2 = new Sqr(y);
        Function z2 = new Sqr(z);

        Function g = new Plus(x2, new Plus(y2, z2));

        System.out.println("Formule : " + g.toString());
        System.out.println("Value : " + g.getValue());

        */

        /* Function h
        Var x = new Var("x");

        x.setValue(0.0);

        Function h = new Plus(new Sin(x), new Val(5));

        System.out.println("Formule : " + h.toString());
        System.out.println("Value : " + h.getValue());

        */

        /* Function k
        Var x = new Var("x");
        Var y = new Var("y");

        x.setValue(0.480000);
        y.setValue(0.480000);

        Function k = new Plus(new Sqr(new Sin(x)), new Sqr(new Cos(y)));

        System.out.println("Formule : " + k.toString());
        System.out.println("Value : " + k.getValue());

        */

        /* Function j
        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");

        x.setValue(2.0);
        y.setValue(2.0);
        z.setValue(2.0);

        Function x2 = new Sqr(x);
        Function y2 = new Sqr(y);
        Function z2 = new Sqr(z);

        Function j=new PlusNAire(x2,y2,z2);

        System.out.println("Formule : " + j.toString());
        System.out.println("Value : " + j.getValue());

        */

        /* Function l */
        Var x = new Var("x");
        Var y = new Var("y");

        x.setValue(0.0);
        y.setValue(0.0);

        Function l = new Plus(new Sqr(new Sin(x)),new Sqr(new Cos(x)));

        System.out.println("Formule : " + l.toString());
        System.out.println("Formule Diff : " + l.getDiff(x).toString());
        System.out.println("Value : " + l.getValue());
    }
}
