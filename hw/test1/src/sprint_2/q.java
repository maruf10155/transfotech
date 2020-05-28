package sprint_2;


class q{
    public static void main(String args[]){
        sum(4,7,1000,-78,74);
        sum();
        double[] a={4,8,9,10};
        sum(a);

    }
    static void sum(double ... x){
        System.out.println(x.length);
        double s=0;
        if (x.length==0) {
            System.out.println("na");
        }else {
            for (double i : x) {
                s = s + i;
            }
            System.out.println(s);
        }

    }
}
