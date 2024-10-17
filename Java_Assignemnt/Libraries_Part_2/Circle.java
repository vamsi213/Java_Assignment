import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class Circle implements Comparable<Circle> {

    int x;
    int y;
    double radius;

    public Circle(int x, int y, double radius){

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    
    public boolean equals(Object obj){
        if (this==obj)
        return true;
        if(obj == null || getClass() != obj.getClass())
        return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y && Double.compare(circle.radius, radius) == 0;

    }
    @Override
    public int hashCode() {
        return 31 * x + 31 * y + Double.hashCode(radius);
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle(" + "x=" + x + ", y=" + y + ", radius=" + radius + ")";
    }

        public static void main(String[] args) {
        
            Set<Circle> circleHashSet = new HashSet<>();
            circleHashSet.add(new Circle(1, 1, 5));
            circleHashSet.add(new Circle(1, 1, 5));  
            
            System.out.println("HashSet (No duplicates):");
        for (Circle circle : circleHashSet) {
            System.out.println(circle);
        }

        Set<Circle> circleTreeSet = new TreeSet<>();
        circleTreeSet.add(new Circle(1, 1, 5));
        circleTreeSet.add(new Circle(1, 1, 5)); 
        circleTreeSet.add(new Circle(2, 3, 7));
        circleTreeSet.add(new Circle(4, 5, 2));
        
        System.out.println("\nTreeSet (Sorted by radius, no duplicates):");
        for (Circle circle : circleTreeSet) {
            System.out.println(circle);
        }

}
}
