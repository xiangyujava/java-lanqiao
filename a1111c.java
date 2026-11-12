public class a1111c {
    public static void main(String[]args){
        int num=100;
        int sum=add(num);
        System.out.println(sum);
    }
    public static int add(int a){
        if(a==1) return 1;
        else return a+add(a-1);
    }
}
