class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("Tree");
    tree.cutShapes(tree.getShape(), 10);
    tree.Bake(350, 12);
    tree.decorateCookie();
    Sugar aCookie =new Sugar();
    aCookie.decorateCookie();
  }
}