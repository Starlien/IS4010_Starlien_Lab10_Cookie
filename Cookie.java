class Cookie{
  int numCookies;
  private int bakeTempF;
  private int bakeTime;
  private boolean bakedCookies;

  Cookie(){
    numCookies=0;
    bakeTempF=0;
    bakeTime=0;
    bakedCookies=false;
  }
  Cookie(int num, int bTe, int bTi){
    numCookies = num;
    bakeTempF =  bTe;
    bakeTime =bTi;
    bakedCookies = false;
  }
  boolean isReady(){
    return bakedCookies;
  }
  void areBaked(boolean bake){
    bakedCookies = bake;
  }
  void cookieNum(int num){
    numCookies=num;
  }
  void Bake(int baketemp, int timeBake){
    bakeTempF = baketemp;
    bakeTime = timeBake;
    System.out.println(numCookies + " cookies where baked at " + bakeTempF +" degrees F for " + bakeTime + " minutes." );

    areBaked(true);
  }
}