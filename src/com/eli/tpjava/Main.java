import com.eli.tpjava.Animal;
import com.eli.tpjava.Cow;
import static com.eli.tpjava.Animal.needs;

void main() {
    Cow gentleCow = new Cow("Shibal", 4, "Moo");
    System.out.println("Nom de l'animal : " + gentleCow.name);
    gentleCow.makeSound();
    needs();
}
