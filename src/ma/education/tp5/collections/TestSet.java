package ma.education.tp5.collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

        public static void main(String[] args) {

            Set<String> set1 = new HashSet<String>();
            set1.add("ABC1");
            set1.add("ABC2");
            set1.add("ABC3");
            set1.add("ABC1");
            set1.add("ABC4");
            set1.add("ABC5");
            set1.forEach(i-> System.out.println(i));

            //avant la redefinition des methodes equals et hashCode dans la classe Client le set avait des doublons
            //Client{code=1, name='ALAMI'}
            //Client{code=1, name='ALAMI'}
            //Client{code=2, name='SOUHAIL'}
            Set<Client> set2 = new HashSet<Client>();
            set2.add(new Client(1,"ALAMI"));
            set2.add(new Client(1,"ALAMI"));
            set2.add(new Client(2,"SOUHAIL"));
            set2.forEach(i-> System.out.println(i));
            //apres la redefinition des methodes equals et hashCode dans la classe Client le set n'a pas des doublons
            //Client{code=1, name='ALAMI'}
            //Client{code=2, name='SOUHAIL'}

            Set<Integer> set3 = new TreeSet<>();
            set3.add(22);
            set3.add(11);
            set3.add(15);
            set3.add(9);
            set3.forEach(i-> System.out.println(i));

            Comparator<Client> c = new CodeComparator();
            Set<Client> set4 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
            set4.add(new Client(1,"OMAR"));
            set4.add(new Client(3,"SAID"));
            set4.add(new Client(2,"HASSAN"));
            set4.forEach(i-> System.out.println(i));

            //Client{code=1, name='OMAR'}
            //Client{code=2, name='HASSAN'}
            //Client{code=3, name='SAID'}

        }

}
