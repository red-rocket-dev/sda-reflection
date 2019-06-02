import pl.sda.MyDumbClass;
import pl.sda.MyPrivateDumbClass;
import pl.sda.fields.Person;
import pl.sda.fields.Student;

public class Main {
    public static void main(String[] args) {
        // Uwaga, nie można modyfikować żadnej klasy poza Main!
        // Zakładamy, że wszystkie inne klasy są dla nas nieedytowalne
        //1. Spraw, żeby poniższy kod wypisał hello world
        MyDumbClass myDumbObject = new MyDumbClass();
        myDumbObject.printSomeString();
        //2. Wypisz wartość pola MyDumbClass.SOME_PASSWORD
        //3. W jakiś sposób utwórz obiekt MyPrivateDumbClass i spraw, żeby metoda printSomeString wypisała hello java
        // MyPrivateDumbClass myPrivateDumbObject = new MyPrivateDumbClass(); <- tak się nie da :(
        //myPrivateDumbObject.printSomeString(); <- to odkomentuj jak znajdziesz sposób na wywołanie konstuktora

        //4. Wyciągnij z Person wszystkie pola i wywołaj gettery dla wszystkich tych pól, a następnie wyświetl ich wartość (za pomocą refleksji)
        // Podpowiedz: ymisum retteg ćałowyw ybeż ,alop ogenad ald aretteg einatsod an ubosops ogenzcigam ogendaż am ein
        // Podpowiedz cd: .aloPawzaN + teg ędotem ćałowyw abezrt żet ogetalD .aloPawzaN + teg ot aretteg awzan adżaK .ijcnewnok an ęis ćezrpo
        Person person = new Person("Jan", "Kowalski", 50);
        //4.5 W zasadzie prawie bez modyfikacji powinno dać się ten sam kod zaaplikować dla studenta i dowolnej innej klasy
        // normalnie byłoby lepiej oceny trzymać w liście, ale dla uproszczenia są w stringu
        Student student = new Student("Alicja", "Szara", "5,5,5,4,5");

        //5. Wywołaj wszystkie metody, mające w sobie słówko call, które znajdują się w klasach w pakiecie pl.sda.methods
        //Podpowiedź: ): jatut ywzan hci ćasipezrp einzcęr abezrt ,eiceikap w salk ainawotsil od ydotem jendaż eibos jemas w eivaJ w am ein
        //6. Wywołaj wszystkie metody, które są oznaczone adnotacją @Action w pakiecie pl.sda.classes
    }
}
