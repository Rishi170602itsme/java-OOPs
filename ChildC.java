// In java you can't inherit from multiple classes to avoid the diamond problem : where the java doesn't knows which parents constructor to call
// that's why we use interface, via interface we can apply multiple inheritance 

public class ChildC {
    public static void main( String[] args){

        DOg Rajapalayam = new DOg();
        Rajapalayam.Type();
        Bird sparrow  = new Bird();
        sparrow.Type();
    }
    
}
interface Animalthe{// this cause error becuase ther might be a public class which already had a name Animal as my all files where in same package (folder)
    void Type();

}
interface Ancestor{// interfaces allowed with definations but with use of "default" keyword to provide common behaviour classes implementing 
//interface can just @overide it, they are just like parent class methods that can be overidden 
    default void showOrigin(){
        System.out.println("Origin: primodial soup (NH3/Chemical evoulution)");
 };

}
class DOg implements Animalthe{
    public void Type(){
        System.out.println( "land animal");
    }
}
class Bird implements Animalthe{
    public void Type(){
        System.out.println(" Air animal");
    }
}