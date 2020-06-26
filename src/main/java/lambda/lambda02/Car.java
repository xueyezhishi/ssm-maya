package lambda.lambda02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car {
//要点4：cars2.forEach(car::follow);
//.forEach前的为传入方法中的对象（list有多个对象则调用多次），::后面为方法名称
@FunctionalInterface
public interface Supplier<T> {
	T get();
}

//Supplier是jdk1.8的接口，这里和lamda一起使用了
public static Car create(final Supplier<Car> supplier) {
	return supplier.get();
}

public static void collide(final Car car) {
	System.out.println("Collided " + car.toString());
}

public void follow(final Car another) {
	System.out.println("Following the " + another.toString());
}

public void repair() {
	System.out.println("Repaired " + this.toString());
}

public static void main(String[] args) {
	//构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
	Car car = Car.create(Car::new);
	Car car1 = Car.create(Car::new);
	Car car2 = Car.create(Car::new);
	Car car3 = new Car();
	List<Car> cars = Arrays.asList(car,car1,car2,car3);
	System.out.println("===================构造器引用========================");
	//静态方法引用：它的语法是Class::static_method，实例如下：
	cars.forEach(Car::collide);
	System.out.println("===================静态方法引用========================");
	//特定类的任意对象的方法引用：它的语法是Class::method实例如下：
	cars.forEach(Car::repair);
	System.out.println("==============特定类的任意对象的方法引用================");
	//特定对象的方法引用：它的语法是instance::method实例如下：
	final Car police = Car.create(Car::new);
	final Car police2 = Car.create(Car::new);
	cars.forEach(police::follow);
	System.out.println("===================特定对象的方法引用===================");
	List<Car> cars2 = Arrays.asList(police,police2);
	cars2.forEach(police::follow);
	cars2.forEach(car::follow);
	
	System.out.println("===================其他方法引用实例===================");
	List names = new ArrayList();
    names.add("Google");
    names.add("Runoob");
    names.add("Taobao");
    names.add("Baidu");
    names.add("Sina");
    names.forEach(System.out::println);
    
}
}