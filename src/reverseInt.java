  public class reverseInt {

    public static void main(String[] args) {
      reverse(123456 );
    }

    public static void reverse(int num){
      int revInt=0;
      int ctr= (int) Math.log10(num);


      while (num!=0){
        revInt+=((num%10) * Math.pow(10,ctr));
        num/=10;
        ctr--;
      }
      System.out.println(revInt);
    }
  }