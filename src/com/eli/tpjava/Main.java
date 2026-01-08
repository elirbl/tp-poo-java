import com.eli.tpjava.Animal;
import com.eli.tpjava.Cow;
import com.eli.tpjava.Dog;

import static com.eli.tpjava.Animal.needs;

void main() {
    Cow gentleCow = new Cow("Shibal", 4, "Moo");
    System.out.println("Nom de l'animal : " + gentleCow.getName());
    gentleCow.makeSound();
    needs();

    Dog fluffyDog = new Dog("Bob", 2, "Ouaf");
    gentleCow.eat();
    fluffyDog.eat();
}
