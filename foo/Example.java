public class Example{

  public void foo(int a){
    System.out.println(a);
  }

  public int square(int toSquare){
    return toSquare*toSquare;
  }

  public int goo(){
    int num = 30976;
    foo(num);
    foo(square(num));
    return num;
  }

  public void sum(){
    System.out.println(goo());
    int num = 55;
    System.out.println(square(num));
    foo(num);
  }

}
