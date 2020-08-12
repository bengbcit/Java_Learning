class OuterInnerClass {
  int x = 10;
  class InnerClass { int y = 5;}
  
  public static void main(String[] args) {
    OuterInnerClass myOuter = new OuterInnerClass();
    OuterInnerClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

