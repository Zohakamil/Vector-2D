public class Main {
    public static void main(String[] args){
        Vector2d v1=new Vector2d(2,6);
        Vector2d v2=new Vector2d(4,6);

        System.out.println(v1.add(v2));
        System.out.println(v1.dotProduct(v2));
        System.out.println(v1.multiply(2));
        System.out.println(v2.magnitude());
        System.out.println(v1.toString()
        );


    }
}
