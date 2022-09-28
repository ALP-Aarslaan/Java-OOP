public class $_21_variable_length_arguments {
    public static void main(String[] args) {
        add ob1=new add();
        ob1.sum(1,2,3,4,5,6,7,8,9,10);

    }
}

/**
 * variable arguments method is used for to use as much as arguments we want to
 * declare inside a method.
 */
class add{
    int sum=0;
    void sum(int...num){
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("sum is : "+sum);
    }
}
