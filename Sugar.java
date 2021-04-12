class Sugar extends Cookie{
  String shape;
  boolean isDecorated;
 
  Sugar(){
    shape="";
    isDecorated=false;

  }
  
  Sugar(String s){
    shape = s;
    isDecorated = false;
  }

  void setShape(String s){
    shape =s ;
  }
  String getShape(){
    return shape;
  }

  void cutShapes(String s, int num){
    shape = s;
    cookieNum(num);
    System.out.println(numCookies + " cookies were cut into " + shape);
  }

  void decorateCookie(){
    if(isReady() == true){
      isDecorated = true;
      System.out.println("The cookies were decorated!");
    }else{
      System.out.println("Make sure to bake the cookies first!");
    }
  }
}