import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class Program42 {
    
    public static void main(String[] args) {

        
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lengthDiff = Integer.compare(s1.length(), s2.length());
                
                return lengthDiff != 0 ? lengthDiff : s1.compareTo(s2);
            }
        };

        Set<String> stringTreeSet = new TreeSet<>(lengthComparator);

        stringTreeSet.add("Vamsi");
        stringTreeSet.add("python");
        stringTreeSet.add("Bat");

        System.out.println("Strings sorted by length:");
        for (String str : stringTreeSet) {
            System.out.println(str);
        }
        
    }
}
