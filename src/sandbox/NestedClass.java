package sandbox;

class NestedClass {

  private int outerClassField;

  public int getOuterClassField() {
    return outerClassField;
  }
  class InnerClass {

    void changeOuterClassField() {

      // can't do this if static
      outerClassField = 5;
    }

  }
}
