import com.eli.tpjava.*;

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
    Cat myCat = new Cat("Patate", 3, "Miaou");
    myCat.hunt();
}
