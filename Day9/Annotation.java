class A{
    public void showTheClassName(){
        System.out.println("show A");
    }
}
class B extends A{
    @Override // helps to problems with method name 
    public void showTheClassName(){
        System.out.println("show A");
    }
}

public class Annotation {
    
}
