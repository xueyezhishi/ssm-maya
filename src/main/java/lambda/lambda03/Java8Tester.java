package lambda.lambda03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Java8Tester {
//要点5：可以拼接接口：Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果
//有40种接口，可以用@FunctionalInterface检查函数式接口是否符合lambda定义
   public static void main(String args[]){
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
      // Predicate<Integer> predicate = n -> true
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // n 如果存在则 test 方法返回 true
        
      System.out.println("输出所有数据:");
        
      // 传递参数 n
      eval(list, n->true);
        
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n%2 为 0 test 方法返回 true
        
      System.out.println("输出所有偶数:");
      eval(list, n-> n%2 == 0 );
        
      // Predicate<Integer> predicate2 = n -> n > 3
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n 大于 3 test 方法返回 true
        
      System.out.println("输出大于 3 的所有数字:");
      eval(list, n-> n > 3 );
      System.out.println("简化写法1:");
      eval2(list, n-> n > 3 );
      System.out.println("简化写法2:");
      list.stream().filter(n-> n > 3).forEach(System.out::println);
   }
    
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {
        
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
   public static void eval2(List<Integer> list, Predicate<Integer> predicate) {
	   list.stream().filter(predicate).forEach(System.out::println);
	}
}