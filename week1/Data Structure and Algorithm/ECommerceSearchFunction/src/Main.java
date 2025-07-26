import java.util.Arrays;
import java.util.Comparator;

public class Main {

    //O-notation is known as worst case notation
    //we can say that it is the actual time complexity of notation
    //it shows us that how algorithm performs in worst case

    //best-case time complexity
    //It is denoted by omega and shows how algorithm perform in best scenerio.
    //Generally O(1);

    //Average-case time complexity
    //It is denoted by thetha and shows how algorithm perform in Average case scenerio.
    //Generally O(n/2);

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    // Test Search Algorithms
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Shirt", "Apparel"),
                new Product(104, "Shoes", "Footwear"),
                new Product(105, "Phone", "Electronics")
        };

        // Linear Search
        Product result1 = linearSearch(products, "Phone");
        System.out.println("Linear Search Found: " + (result1 != null ? result1.productName : "Not Found"));

        //Sort
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search
        Product result2 = binarySearch(products, "Phone");
        System.out.println("Binary Search Found: " + (result2 != null ? result2.productName : "Not Found"));
    }
}
    //time complexity of linear search
    //O(n)

    //time complexity of binary search
    //O(log n)
    //but here array must be sorted otherwise the time complexity can be n*logn

    //if array is sorted prefer binary search otherwise prefer linear search
