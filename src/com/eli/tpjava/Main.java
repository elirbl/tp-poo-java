import com.eli.tpjava.Animal;
import com.eli.tpjava.Cow;
import com.eli.tpjava.Dog;
import com.eli.tpjava.Pet;

import static com.eli.tpjava.Animal.needs;

void main() {
    Cow gentleCow = new Cow("Shibal", 4, "Moo");
    System.out.println("Nom de l'animal : " + gentleCow.getName());
    gentleCow.makeSound();
    needs();

    Dog fluffyDog = new Dog("Bob", 2, "Ouaf");
    gentleCow.eat();
    fluffyDog.eat();
    gentleCow.eat("de l'herbe");

    fluffyDog.play();
    gentleCow.play();
    List<Pet> petList = new ArrayList<>();
    petList.add(gentleCow);
    petList.add(fluffyDog);

    for (Pet pet : petList) {
        pet.play();
    }
}
