package lambda.lambda01;
 
public class Java8Tester1 {
//要点1：->左边为参数名，右边为定义的方法
	public static void main(String args[]) {
//要点2：lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有final 的语义）
 		int num = 1;
 		Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
 		s.convert(2);
 	//	num = 5;
//要点3：在Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
 	//	String first = "";
 		Comparator<String> comparator = (first, second) -> System.out.println(Integer.compare(first.length(), second.length()));//comparator.com("aaaaa","bb");
 		comparator.com("aaaaa","bb");
	}
	public interface Converter<T1, T2> {
        void convert(int i);
    }
	public interface Comparator<T> {
        void com(String a,String b);
    }
}