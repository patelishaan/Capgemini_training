package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamAPI {
    public static <by> void main(String[] args){
        List<String> immutableList = Stream.of("red","green",null,null).toList();
        System.out.println(immutableList);
        //immutableList.add("yellow");
        System.out.println("------------------------------");
        List<String> mutablelist = Stream.of("red","green",null,null).collect(toList());
        System.out.println(mutablelist);
        mutablelist.add("orange");
        mutablelist.set(2,"yellow");
        System.out.println(mutablelist);
        System.out.println("------------------------------");
        record Product(String name, String category, int price){

        }
        Stream<Product> products = Stream.of(new Product("bat","sportsitem",4000),
                new Product("ball","sportsitem",3000),
                new Product("laptop","electronics",5000),
                new Product("phone","electronics",1000),
                new Product("water bottle","daily use",2000),
                new Product("manas","daily use",100));
        /*Map<String, List<Product>> categoryMap = products.collect(Collectors.groupingBy(Product::category));
        System.out.println(categoryMap);*/
        //AGGREGATING BASED ON GROUPING
        /*Map<String, Integer> pricing = products.collect(Collectors.groupingBy(Product::category, Collectors.summingInt(Product::price)));
        System.out.println(pricing);*/

        //AVERAGE PRICE FOR EACH CATEGORY
        //Map<String, Double> average_price = products.collect(Collectors.groupingBy(Product::category, Collectors.averagingDouble(Product::price)));
        //System.out.println(average_price);

        //FILTER
        //List<Product> filtered = products.filter(Product->Product.price>2500).collect(Collectors.toList());
        //System.out.println(filtered);

        //PARTITION BASED ON CONDITION
        //Map<Boolean, List<Product>> part = products.collect(Collectors.partitioningBy(Product->Product.price>1000));
        //System.out.println(part);

        //SUMMARIZING INT
        System.out.println(products.collect(Collectors.summarizingInt(Product::price)));

    }
}
