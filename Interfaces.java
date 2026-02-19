// You can't access something more then the access of it container => if class in private and method is public u can't access method outside the class scope
// INTERFACES (CAN be public or default(pacakged private)) : defined using interface keyword - 
// it acts like blueprint for a class.  these acts as contracts that abstraction are avbout 
// interface by default are public so no need to write public, but remember to do write public in inheritance as u can't change 
// the visibilit of a inherited class in java
// Interfaces can't have their own childern . hence, don't try to extend them.
interface Animal{
        void makeSound();// Abstract method (no body)
        void sleep();
    }
        
public class Interfaces {
    // BASIC SYNTAX
    
    //implementation
    static class Dog implements Animal {//no enclosing error came when static was not usedq
public void makeSound(){
    System.out.println("woof woof");
}
public void sleep(){
    System.out.println("Zzzz.....");
}
    }

    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.makeSound();
        mydog.sleep();
    }

}
/*  INTERFACES can have:
1. absstract methods -> must be implemented 
2. default  methods  -> can be overidden
3. static methods -> call using interface name
4. constants -> public static final values*/
/* ultra simple map :- 
default -> like parent method 
static -> helper function of interface
constant -> fixed value shared everwhere 
*/
/* */
